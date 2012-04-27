/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Prestamo;
import java.util.ArrayList;
import java.util.List;
import entidades.Autores;
import entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author gustavo
 */
public class LibroJpaController implements Serializable {

    public LibroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Libro libro) throws PreexistingEntityException, Exception {
        if (libro.getPrestamoList() == null) {
            libro.setPrestamoList(new ArrayList<Prestamo>());
        }
        if (libro.getAutoresList() == null) {
            libro.setAutoresList(new ArrayList<Autores>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Prestamo> attachedPrestamoList = new ArrayList<Prestamo>();
            for (Prestamo prestamoListPrestamoToAttach : libro.getPrestamoList()) {
                prestamoListPrestamoToAttach = em.getReference(prestamoListPrestamoToAttach.getClass(), prestamoListPrestamoToAttach.getIdPrestamo());
                attachedPrestamoList.add(prestamoListPrestamoToAttach);
            }
            libro.setPrestamoList(attachedPrestamoList);
            List<Autores> attachedAutoresList = new ArrayList<Autores>();
            for (Autores autoresListAutoresToAttach : libro.getAutoresList()) {
                autoresListAutoresToAttach = em.getReference(autoresListAutoresToAttach.getClass(), autoresListAutoresToAttach.getIdAutor());
                attachedAutoresList.add(autoresListAutoresToAttach);
            }
            libro.setAutoresList(attachedAutoresList);
            em.persist(libro);
            for (Prestamo prestamoListPrestamo : libro.getPrestamoList()) {
                Libro oldIdLibroOfPrestamoListPrestamo = prestamoListPrestamo.getIdLibro();
                prestamoListPrestamo.setIdLibro(libro);
                prestamoListPrestamo = em.merge(prestamoListPrestamo);
                if (oldIdLibroOfPrestamoListPrestamo != null) {
                    oldIdLibroOfPrestamoListPrestamo.getPrestamoList().remove(prestamoListPrestamo);
                    oldIdLibroOfPrestamoListPrestamo = em.merge(oldIdLibroOfPrestamoListPrestamo);
                }
            }
            for (Autores autoresListAutores : libro.getAutoresList()) {
                Libro oldIdLibroOfAutoresListAutores = autoresListAutores.getIdLibro();
                autoresListAutores.setIdLibro(libro);
                autoresListAutores = em.merge(autoresListAutores);
                if (oldIdLibroOfAutoresListAutores != null) {
                    oldIdLibroOfAutoresListAutores.getAutoresList().remove(autoresListAutores);
                    oldIdLibroOfAutoresListAutores = em.merge(oldIdLibroOfAutoresListAutores);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibro(libro.getIdLibro()) != null) {
                throw new PreexistingEntityException("Libro " + libro + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Libro libro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libro persistentLibro = em.find(Libro.class, libro.getIdLibro());
            List<Prestamo> prestamoListOld = persistentLibro.getPrestamoList();
            List<Prestamo> prestamoListNew = libro.getPrestamoList();
            List<Autores> autoresListOld = persistentLibro.getAutoresList();
            List<Autores> autoresListNew = libro.getAutoresList();
            List<Prestamo> attachedPrestamoListNew = new ArrayList<Prestamo>();
            for (Prestamo prestamoListNewPrestamoToAttach : prestamoListNew) {
                prestamoListNewPrestamoToAttach = em.getReference(prestamoListNewPrestamoToAttach.getClass(), prestamoListNewPrestamoToAttach.getIdPrestamo());
                attachedPrestamoListNew.add(prestamoListNewPrestamoToAttach);
            }
            prestamoListNew = attachedPrestamoListNew;
            libro.setPrestamoList(prestamoListNew);
            List<Autores> attachedAutoresListNew = new ArrayList<Autores>();
            for (Autores autoresListNewAutoresToAttach : autoresListNew) {
                autoresListNewAutoresToAttach = em.getReference(autoresListNewAutoresToAttach.getClass(), autoresListNewAutoresToAttach.getIdAutor());
                attachedAutoresListNew.add(autoresListNewAutoresToAttach);
            }
            autoresListNew = attachedAutoresListNew;
            libro.setAutoresList(autoresListNew);
            libro = em.merge(libro);
            for (Prestamo prestamoListOldPrestamo : prestamoListOld) {
                if (!prestamoListNew.contains(prestamoListOldPrestamo)) {
                    prestamoListOldPrestamo.setIdLibro(null);
                    prestamoListOldPrestamo = em.merge(prestamoListOldPrestamo);
                }
            }
            for (Prestamo prestamoListNewPrestamo : prestamoListNew) {
                if (!prestamoListOld.contains(prestamoListNewPrestamo)) {
                    Libro oldIdLibroOfPrestamoListNewPrestamo = prestamoListNewPrestamo.getIdLibro();
                    prestamoListNewPrestamo.setIdLibro(libro);
                    prestamoListNewPrestamo = em.merge(prestamoListNewPrestamo);
                    if (oldIdLibroOfPrestamoListNewPrestamo != null && !oldIdLibroOfPrestamoListNewPrestamo.equals(libro)) {
                        oldIdLibroOfPrestamoListNewPrestamo.getPrestamoList().remove(prestamoListNewPrestamo);
                        oldIdLibroOfPrestamoListNewPrestamo = em.merge(oldIdLibroOfPrestamoListNewPrestamo);
                    }
                }
            }
            for (Autores autoresListOldAutores : autoresListOld) {
                if (!autoresListNew.contains(autoresListOldAutores)) {
                    autoresListOldAutores.setIdLibro(null);
                    autoresListOldAutores = em.merge(autoresListOldAutores);
                }
            }
            for (Autores autoresListNewAutores : autoresListNew) {
                if (!autoresListOld.contains(autoresListNewAutores)) {
                    Libro oldIdLibroOfAutoresListNewAutores = autoresListNewAutores.getIdLibro();
                    autoresListNewAutores.setIdLibro(libro);
                    autoresListNewAutores = em.merge(autoresListNewAutores);
                    if (oldIdLibroOfAutoresListNewAutores != null && !oldIdLibroOfAutoresListNewAutores.equals(libro)) {
                        oldIdLibroOfAutoresListNewAutores.getAutoresList().remove(autoresListNewAutores);
                        oldIdLibroOfAutoresListNewAutores = em.merge(oldIdLibroOfAutoresListNewAutores);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = libro.getIdLibro();
                if (findLibro(id) == null) {
                    throw new NonexistentEntityException("The libro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libro libro;
            try {
                libro = em.getReference(Libro.class, id);
                libro.getIdLibro();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libro with id " + id + " no longer exists.", enfe);
            }
            List<Prestamo> prestamoList = libro.getPrestamoList();
            for (Prestamo prestamoListPrestamo : prestamoList) {
                prestamoListPrestamo.setIdLibro(null);
                prestamoListPrestamo = em.merge(prestamoListPrestamo);
            }
            List<Autores> autoresList = libro.getAutoresList();
            for (Autores autoresListAutores : autoresList) {
                autoresListAutores.setIdLibro(null);
                autoresListAutores = em.merge(autoresListAutores);
            }
            em.remove(libro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Libro> findLibroEntities() {
        return findLibroEntities(true, -1, -1);
    }

    public List<Libro> findLibroEntities(int maxResults, int firstResult) {
        return findLibroEntities(false, maxResults, firstResult);
    }

    private List<Libro> findLibroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Libro findLibro(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Libro.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libro> rt = cq.from(Libro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
