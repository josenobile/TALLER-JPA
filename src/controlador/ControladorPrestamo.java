//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: TALLER-JPA
//
// ARCHIVO: ControladorPrestamo.java
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

import dao.LibroJpaController;
import dao.PrestamoJpaController;
import dao.UsuarioJpaController;
import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entidades.Libro;
import entidades.Prestamo;
import entidades.Usuario;
import java.util.Date;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public class ControladorPrestamo {

    @PersistenceUnit
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("TALLER-JPAPU");
    EntityManager manager = factory.createEntityManager();
    PrestamoJpaController daoPrestamo;
    Prestamo prestamoSeleccionado;
    UsuarioJpaController daoUsuario;
    LibroJpaController daoLibro;

    public ControladorPrestamo() {    // instancia de la variable entidad
        daoPrestamo = new PrestamoJpaController(factory);
        daoLibro = new LibroJpaController(factory);
        daoUsuario = new UsuarioJpaController(factory);

    }

    public void guardarPrestamo(String idPrestamo, String idLibro, String idUsuario, Date fPrestamo,
            Date fDevolucion) throws PreexistingEntityException, Exception {

        System.out.println("idLibro: " + idLibro + " idUsuario: " + idUsuario);
        Prestamo prestamo = new Prestamo();
        prestamo.setIdPrestamo(idPrestamo);
        prestamo.setIdLibro(daoLibro.findLibro(idLibro));
        prestamo.setIdUsuario(daoUsuario.findUsuario(idUsuario));
        prestamo.setFechaPrestamo(fPrestamo);
        prestamo.setFechaDevolucion(fDevolucion);

        daoPrestamo.create(prestamo);

    }

    public Object[][] consultarPrestamo(String idPrestamo) {

        Vector<Prestamo> ultimoPrestamo;

        if (idPrestamo.equals("")) {
            ultimoPrestamo = (Vector<Prestamo>) daoPrestamo.findPrestamoEntities();

            Object resultado[][] = new Object[ultimoPrestamo.size()][5];

            for (int i = 0; i < resultado.length; i++) {
                resultado[i][0] = ultimoPrestamo.get(i).getIdPrestamo();
                resultado[i][1] = ultimoPrestamo.get(i).getIdLibro().getIdLibro();
                resultado[i][2] = ultimoPrestamo.get(i).getIdUsuario().getIdUsuario();
                resultado[i][3] = ultimoPrestamo.get(i).getFechaPrestamo().toGMTString();
                resultado[i][4] = ultimoPrestamo.get(i).getFechaDevolucion().toGMTString();
            }

            return resultado;
        } else {
            ultimoPrestamo = new Vector<Prestamo>();
            ultimoPrestamo.add(daoPrestamo.findPrestamo(idPrestamo));

            Object resultado1[][] = new Object[ultimoPrestamo.size()][5];

            for (int i = 0; i < resultado1.length; i++) {
                resultado1[i][0] = ultimoPrestamo.get(i).getIdPrestamo();
                resultado1[i][1] = ultimoPrestamo.get(i).getIdLibro().getIdLibro();
                resultado1[i][2] = ultimoPrestamo.get(i).getIdUsuario().getIdUsuario();
                resultado1[i][3] = ultimoPrestamo.get(i).getFechaPrestamo().toGMTString();
                resultado1[i][4] = ultimoPrestamo.get(i).getFechaDevolucion().toGMTString();
            }

            return resultado1;
        }

        // </editor-fold>
    }

    public String[] seleccionarPrestamo(String idPrestamo) {
        String prestamo[] = new String[5];

        prestamoSeleccionado = daoPrestamo.findPrestamo(idPrestamo);
        prestamo[0] = prestamoSeleccionado.getIdPrestamo();
        prestamo[1] = prestamoSeleccionado.getIdLibro().getIdLibro() + " - " + prestamoSeleccionado.getIdLibro().getTitulo();
        prestamo[2] = prestamoSeleccionado.getIdUsuario().getIdUsuario() + " - " + prestamoSeleccionado.getIdUsuario().getNombreCompleto();
        prestamo[3] = prestamoSeleccionado.getFechaPrestamo().toGMTString();
        prestamo[4] = prestamoSeleccionado.getFechaDevolucion().toGMTString();
        return prestamo;
    }

    public String editarPrestamo(Libro idLibro, Usuario idUsuario, Date fPrestamo, Date fDevolucion) {
        prestamoSeleccionado.setIdLibro(idLibro);
        prestamoSeleccionado.setIdUsuario(idUsuario);
        prestamoSeleccionado.setFechaPrestamo(fPrestamo);
        prestamoSeleccionado.setFechaDevolucion(fDevolucion);

        try {
            daoPrestamo.edit(prestamoSeleccionado);

            return "OK";
        } catch (Exception ex) {
            System.err.print(ex.getMessage());

            return "No se pudo actualizar";
        }
    }

    public void eliminar(String[] idPrestamo) throws NonexistentEntityException {
        for (int i = 0; i < idPrestamo.length; i++) {
            daoPrestamo.destroy(idPrestamo[i]);
        }
    }

    public String[] loadLibros() {

        Vector<Libro> libros = (Vector<Libro>) daoLibro.findLibroEntities();
        String[] librosRegistrados = new String[libros.size() + 1];

        librosRegistrados[0] = " ";
        for (int i = 0; i < libros.size(); i++) {
            librosRegistrados[i + 1] = libros.get(i).getIdLibro() + " - " + libros.get(i).getTitulo();
        }
        return librosRegistrados;
    }

    public String[] loadUsuarios() {

        Vector<Usuario> usuarios = (Vector<Usuario>) daoUsuario.findUsuarioEntities();
        String[] usuariosRegistrados = new String[usuarios.size() + 1];

        usuariosRegistrados[0] = " ";
        for (int i = 0; i < usuarios.size(); i++) {
            usuariosRegistrados[i + 1] = usuarios.get(i).getIdUsuario() + " - " + usuarios.get(i).getNombreCompleto();
        }
        return usuariosRegistrados;
    }
}