//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: TALLER-JPA
//
// ARCHIVO: ControladorUsuario.java
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

import dao.UsuarioJpaController;
import dao.exceptions.NonexistentEntityException;
import entidades.Usuario;
import java.util.Date;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public class ControladorUsuario {
    
    @PersistenceUnit
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("TALLER-JPAPU");
    public EntityManager manager = factory.createEntityManager();
    UsuarioJpaController daoUsuario;
    private Usuario usuarioSeleccionado;

    // constructor de clase
    public ControladorUsuario() {    // instancia de la variable entidad
        daoUsuario = new UsuarioJpaController(factory);
    }

    // metodos q se aplican a la entidad
    public String guardarUsuario(String id, String docType, String docNum, String name, String email, String addres,
            String telephone, String mobile) {
        Usuario usuario = new Usuario();
        
        usuario.setIdUsuario(id);
        usuario.setTipoDocumento(docType);
        usuario.setNumDocumento(docNum);
        usuario.setNombreCompleto(name);
        usuario.setEMail(email);
        usuario.setDireccionResidencia(addres);
        usuario.setTelefono(telephone);
        usuario.setCelular(mobile);
        
        try {
            daoUsuario.create(usuario);
            
            return "OK";
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            
            return "No se pudo registar el nuevo usuario";
        }
    }
    
    public Object[][] consultarUsuario(String idUsuario) {
        Vector<Usuario> ultimaConsulta = new Vector<Usuario>();
        ultimaConsulta.add(daoUsuario.findUsuario(idUsuario));
        
        Object resultado1[][] = new Object[ultimaConsulta.size()][8];
        
        for (int i = 0; i < resultado1.length; i++) {
            resultado1[i][0] = ultimaConsulta.get(i).getIdUsuario();
            resultado1[i][1] = ultimaConsulta.get(i).getTipoDocumento();
            resultado1[i][2] = ultimaConsulta.get(i).getNumDocumento();
            resultado1[i][3] = ultimaConsulta.get(i).getNombreCompleto();
            resultado1[i][4] = ultimaConsulta.get(i).getEMail();
            resultado1[i][5] = ultimaConsulta.get(i).getDireccionResidencia();
            resultado1[i][6] = ultimaConsulta.get(i).getTelefono();
            resultado1[i][7] = ultimaConsulta.get(i).getCelular();
        }
        
        return resultado1;
    }

    // </editor-fold>
    public String[] seleccionarUsuario(String idUsuario) {
        String usuario[] = new String[8];
        
        usuarioSeleccionado = daoUsuario.findUsuario(idUsuario);
        usuario[0] = usuarioSeleccionado.getIdUsuario();
        usuario[1] = usuarioSeleccionado.getTipoDocumento();
        usuario[2] = usuarioSeleccionado.getNumDocumento();
        usuario[3] = usuarioSeleccionado.getNombreCompleto();
        usuario[4] = usuarioSeleccionado.getEMail();
        usuario[5] = usuarioSeleccionado.getDireccionResidencia();
        usuario[6] = usuarioSeleccionado.getTelefono();
        usuario[7] = usuarioSeleccionado.getCelular();
        
        return usuario;
    }
    
    public String editarUsuario(String docType, String docNum, String name, String email, String addres,
            String telephone, String mobile) {
        usuarioSeleccionado.setTipoDocumento(docType);
        usuarioSeleccionado.setNumDocumento(docNum);
        usuarioSeleccionado.setNombreCompleto(name);
        usuarioSeleccionado.setEMail(email);
        usuarioSeleccionado.setDireccionResidencia(addres);
        usuarioSeleccionado.setTelefono(telephone);
        usuarioSeleccionado.setCelular(mobile);
        
        try {
            daoUsuario.edit(usuarioSeleccionado);
            
            return "OK";
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            
            return "No se pudo actualizar";
        }
    }
    
    public void eliminar(String[] idUsuarios) throws NonexistentEntityException {
        for (int i = 0; i < idUsuarios.length; i++) {
            daoUsuario.destroy(idUsuarios[i]);
        }
    }
    
    public Object[][] consultarUsuariosporPeriodo(Date dateInicial, Date dateFinal) {
        
        Vector<Usuario> ultimaConsulta = (Vector<Usuario>) daoUsuario.findUsuariosbyDateofPrestamo(dateInicial, dateFinal);
        
        Object resultado[][] = new Object[ultimaConsulta.size()][8];
        
        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getIdUsuario();
            resultado[i][1] = ultimaConsulta.get(i).getTipoDocumento();
            resultado[i][2] = ultimaConsulta.get(i).getNumDocumento();
            resultado[i][3] = ultimaConsulta.get(i).getNombreCompleto();
            resultado[i][4] = ultimaConsulta.get(i).getEMail();
            resultado[i][5] = ultimaConsulta.get(i).getDireccionResidencia();
            resultado[i][6] = ultimaConsulta.get(i).getTelefono();
            resultado[i][7] = ultimaConsulta.get(i).getCelular();
        }
        
        return resultado;
    }
    
    public Object[][] consultarTodoslosUsuarios() {
        
        Vector<Usuario> ultimaConsulta = (Vector<Usuario>) daoUsuario.findUsuarioEntities();
        
        Object resultado[][] = new Object[ultimaConsulta.size()][8];
        
        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getIdUsuario();
            resultado[i][1] = ultimaConsulta.get(i).getTipoDocumento();
            resultado[i][2] = ultimaConsulta.get(i).getNumDocumento();
            resultado[i][3] = ultimaConsulta.get(i).getNombreCompleto();
            resultado[i][4] = ultimaConsulta.get(i).getEMail();
            resultado[i][5] = ultimaConsulta.get(i).getDireccionResidencia();
            resultado[i][6] = ultimaConsulta.get(i).getTelefono();
            resultado[i][7] = ultimaConsulta.get(i).getCelular();
        }
        
        return resultado;
        
    }
}
