//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: TALLER-JPA
//
// ARCHIVO: ControladorLibro.java
//
// FECHA:12/04/26
//
// AUTORES:
// Gustavo Adolfo Rodriguez    0932979-3743
// gustalibreros@hotmail.com
//
// José Antonio Nobile Rendón  0747102-2711
// jose.nobile@gmail.com
//
// Roberto Ceballos            0441812-3743
// robertrock2000@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//**********************************************************

package controlador;

import dao.AutoresJpaController;
import dao.LibroJpaController;
import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entidades.Autores;
import entidades.Libro;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;


public class ControladorLibro {
    @PersistenceUnit

    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("TALLER-JPAPU");
    AutoresJpaController         daoAutores;
    LibroJpaController daoLibro;
    Libro              libroSeleccionado;

    // constructor de clase
    public ControladorLibro() {    // instancia de la variable entidad
        daoLibro   = new LibroJpaController(factory);
        daoAutores = new AutoresJpaController(factory);
    }

    public Object[][] consultarLibros(String idLibro) {

        // <editor-fold defaultstate="collapsed" desc="consultarLibros()">
        Vector<Libro> ultimaConsulta;

        if (idLibro.equals("")) {
            ultimaConsulta = (Vector<Libro>) daoLibro.findLibroEntities();

            Object resultado[][] = new Object[ultimaConsulta.size()][3];

            for (int i = 0; i < resultado.length; i++) {
                resultado[i][0] = ultimaConsulta.get(i).getIdLibro();
                resultado[i][1] = ultimaConsulta.get(i).getTitulo();
                resultado[i][2] = ultimaConsulta.get(i).getSubtitulo();
            }

            return resultado;
        } else {
            ultimaConsulta = new Vector<Libro>();
            ultimaConsulta.add(daoLibro.findLibro(idLibro));

            Object resultado1[][] = new Object[ultimaConsulta.size()][3];

            for (int i = 0; i < resultado1.length; i++) {
                resultado1[i][0] = ultimaConsulta.get(i).getIdLibro();
                resultado1[i][1] = ultimaConsulta.get(i).getTitulo();
                resultado1[i][2] = ultimaConsulta.get(i).getSubtitulo();
            }

            return resultado1;
        }

        // </editor-fold>
    }

    public void eliminar(String[] idLibros) throws NonexistentEntityException {
        for (int i = 0; i < idLibros.length; i++) {
            Libro           libroEliminar = daoLibro.findLibro(idLibros[i]);
            Vector<Autores> autoresVector = (Vector<Autores>) libroEliminar.getAutoresList();

            System.out.print("autoresVector.size(): " + autoresVector.size());

            for (int j = 0; j < autoresVector.size(); j++) {
                daoAutores.destroy(autoresVector.elementAt(j).getIdAutor());
                autoresVector.remove(j);
            }

            libroEliminar.setAutoresList(autoresVector);
            daoLibro.destroy(libroEliminar.getIdLibro());
        }
    }

    public void guardarLibro(String id, String titulo, String subtitulo, String[] autores)
            throws PreexistingEntityException, Exception {

        // <editor-fold defaultstate="collapsed" desc="guardarLibro()">
        Libro libroAGuardar = new Libro();

        libroAGuardar.setIdLibro(id);
        libroAGuardar.setTitulo(titulo);
        libroAGuardar.setSubtitulo(subtitulo);
        daoLibro.create(libroAGuardar);

        Vector<Autores> autoresV = new Vector<Autores>();
        Autores         autorActual;

        for (int i = 0; i < autores.length; i++) {
            autorActual = new Autores();
            autorActual.setNombreCompleto(autores[i]);
            autorActual.setIdLibro(libroAGuardar);
            autorActual.setIdAutor(id + i);
            daoAutores.create(autorActual);
            autoresV.add(autorActual);
        }

        libroAGuardar.setAutoresList(autoresV);
        daoLibro.edit(libroAGuardar);

        // </editor-fold>
    }

    public String[] seleccionarLibro(String idLibro) {

        // <editor-fold defaultstate="collapsed" desc="seleccionarLibro()">
        String libro[] = new String[3];

        libroSeleccionado = daoLibro.findLibro(idLibro);
        libro[0]          = libroSeleccionado.getIdLibro();
        libro[1]          = libroSeleccionado.getTitulo();
        libro[2]          = libroSeleccionado.getSubtitulo();

        return libro;

        // </editor-fold>
    }

    public String[] getAutores(String idLibro) {

        // <editor-fold defaultstate="collapsed" desc="getAutores()">
        Vector<Autores> autoresV    = (Vector<Autores>) libroSeleccionado.getAutoresList();
        String[]        autoresList = new String[autoresV.size()];

        for (int i = 0; i < autoresV.size(); i++) {
            Autores autores = autoresV.elementAt(i);

            autoresList[i] = autores.getNombreCompleto();
        }

        return autoresList;

        // </editor-fold>
    }

    public void editarLibro(String titulo, String subtitulo, String[] autores)
            throws NonexistentEntityException, Exception {

        // <editor-fold defaultstate="collapsed" desc="editarLibro()">
        libroSeleccionado.setTitulo(titulo);
        libroSeleccionado.setSubtitulo(subtitulo);

        Vector<Autores> autoresVector = (Vector<Autores>) libroSeleccionado.getAutoresList();

        System.out.print("autores.length: " + autores.length);

        if (autores.length < autoresVector.size()) {
            for (int i = autores.length; i < autoresVector.size(); i++) {
                daoAutores.destroy(autoresVector.elementAt(i).getIdAutor());
                autoresVector.remove(i);
            }
        }

        for (int i = 0; i < autoresVector.size(); i++) {
            if (!autores[i].equals(autoresVector.elementAt(i).getNombreCompleto())) {
                autoresVector.elementAt(i).setNombreCompleto(autores[i]);
                daoAutores.edit(autoresVector.elementAt(i));
            }
        }

        if (autores.length > autoresVector.size()) {
            for (int i = autoresVector.size(); i < autores.length; i++) {
                Autores newActor = new Autores();

                newActor.setIdLibro(libroSeleccionado);
                newActor.setNombreCompleto(autores[i]);
                newActor.setIdAutor(libroSeleccionado.getIdLibro() + i);
                daoAutores.create(newActor);
                autoresVector.add(newActor);
            }
        }

        libroSeleccionado.setAutoresList(autoresVector);
        daoLibro.edit(libroSeleccionado);

        // </editor-fold>
    }
}