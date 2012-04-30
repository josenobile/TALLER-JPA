//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: JPanelUsuarios.java
//
// FECHA:12/03/30
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
//*********************************************************
package gui;

import com.toedter.calendar.JDateChooser;
import controlador.ControladorUsuario;
import dao.exceptions.NonexistentEntityException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelUsuarios extends javax.swing.JPanel {

    ControladorUsuario controladorUsuario;
    private final JDateChooser dateInicial;
    private final JDateChooser dateFinal;
    private final String dateFormatPattern;

    public JPanelUsuarios() {
        controladorUsuario = new ControladorUsuario();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);

        dateFormatPattern = "dd MMMM yyyy' - 'hh:mm:ss aa";
        
        dateInicial = new JDateChooser(new Date());
        dateInicial.setDateFormatString(dateFormatPattern);
        dateInicial.setBounds(70, 130, 230, 35);
        jPanelConsulta.add(dateInicial);
        dateInicial.setEnabled(false);

        dateFinal = new JDateChooser(new Date());
        dateFinal.setDateFormatString(dateFormatPattern);
        dateFinal.setBounds(350, 130, 230, 35);
        jPanelConsulta.add(dateFinal);
        dateFinal.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistar = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLIdentificacion = new javax.swing.JLabel();
        jLTipoDoc = new javax.swing.JLabel();
        jLNumDocumento = new javax.swing.JLabel();
        jLPrograma2 = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jTFIdentificacion = new javax.swing.JTextField();
        jTFTipoDoc = new javax.swing.JTextField();
        jTFNumDoc = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFCelular = new javax.swing.JTextField();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelRegistar1 = new javax.swing.JLabel();
        jLCodigo1 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jButtonLimpiarC = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jLCodigo2 = new javax.swing.JLabel();
        jLCodigo4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonExportar = new javax.swing.JButton();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar2 = new javax.swing.JLabel();
        jLIdentificacion1 = new javax.swing.JLabel();
        jLTipoDoc1 = new javax.swing.JLabel();
        jLNumDocumento1 = new javax.swing.JLabel();
        jLPrograma3 = new javax.swing.JLabel();
        jLEmail1 = new javax.swing.JLabel();
        jLDireccion1 = new javax.swing.JLabel();
        jLTelefono1 = new javax.swing.JLabel();
        jLCelular1 = new javax.swing.JLabel();
        jTFIdentificacion1 = new javax.swing.JTextField();
        jTFTipoDoc1 = new javax.swing.JTextField();
        jTFNumDoc1 = new javax.swing.JTextField();
        jTFNombre1 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jTFDireccion1 = new javax.swing.JTextField();
        jTFTelefono1 = new javax.swing.JTextField();
        jTFCelular1 = new javax.swing.JTextField();
        jButtonLimpiarE = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

        setLayout(null);

        jPanelRegistar.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Usuario");
        jPanelRegistar.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 600, 40);

        jLIdentificacion.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLIdentificacion.setText("Identificacion");
        jPanelRegistar.add(jLIdentificacion);
        jLIdentificacion.setBounds(50, 70, 200, 30);

        jLTipoDoc.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTipoDoc.setText("Tipo de Documento");
        jPanelRegistar.add(jLTipoDoc);
        jLTipoDoc.setBounds(50, 110, 200, 30);

        jLNumDocumento.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumDocumento.setText("Numero Documento");
        jPanelRegistar.add(jLNumDocumento);
        jLNumDocumento.setBounds(50, 150, 200, 30);

        jLPrograma2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma2.setText("Nombre");
        jPanelRegistar.add(jLPrograma2);
        jLPrograma2.setBounds(50, 190, 200, 30);

        jLEmail.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLEmail.setText("Email");
        jPanelRegistar.add(jLEmail);
        jLEmail.setBounds(50, 230, 200, 30);

        jLDireccion.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLDireccion.setText("Direccion");
        jPanelRegistar.add(jLDireccion);
        jLDireccion.setBounds(50, 270, 200, 30);

        jLTelefono.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTelefono.setText("Telefono");
        jPanelRegistar.add(jLTelefono);
        jLTelefono.setBounds(50, 310, 200, 30);

        jLCelular.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCelular.setText("Celular");
        jPanelRegistar.add(jLCelular);
        jLCelular.setBounds(50, 350, 200, 30);
        jPanelRegistar.add(jTFIdentificacion);
        jTFIdentificacion.setBounds(260, 70, 250, 30);
        jPanelRegistar.add(jTFTipoDoc);
        jTFTipoDoc.setBounds(260, 110, 250, 30);
        jPanelRegistar.add(jTFNumDoc);
        jTFNumDoc.setBounds(260, 150, 250, 30);
        jPanelRegistar.add(jTFNombre);
        jTFNombre.setBounds(260, 190, 250, 30);
        jPanelRegistar.add(jTFEmail);
        jTFEmail.setBounds(260, 230, 250, 30);
        jPanelRegistar.add(jTFDireccion);
        jTFDireccion.setBounds(260, 270, 250, 30);
        jPanelRegistar.add(jTFTelefono);
        jTFTelefono.setBounds(260, 310, 250, 30);
        jPanelRegistar.add(jTFCelular);
        jTFCelular.setBounds(260, 350, 250, 30);

        jButtonLimpiarR.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarR.setText("LIMPIAR");
        jButtonLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRActionPerformed(evt);
            }
        });
        jPanelRegistar.add(jButtonLimpiarR);
        jButtonLimpiarR.setBounds(315, 400, 130, 35);

        jButtonRegistar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonRegistar.setText("REGISTAR");
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });
        jPanelRegistar.add(jButtonRegistar);
        jButtonRegistar.setBounds(165, 400, 130, 35);

        jTabbedPane1.addTab("Registar", jPanelRegistar);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Usuarios");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 5, 600, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("Codigo:");
        jPanelConsulta.add(jLCodigo1);
        jLCodigo1.setBounds(20, 50, 70, 35);
        jPanelConsulta.add(jTFCodigo1);
        jTFCodigo1.setBounds(90, 50, 310, 35);

        jButtonLimpiarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarC.setText("LIMPIAR");
        jButtonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonLimpiarC);
        jButtonLimpiarC.setBounds(440, 40, 140, 35);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonConsultar);
        jButtonConsultar.setBounds(30, 175, 140, 35);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(180, 175, 140, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTableResultados);

        jPanelConsulta.add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 580, 230);

        jButtonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEliminar);
        jButtonEliminar.setBounds(330, 175, 140, 35);

        jLCodigo2.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLCodigo2.setText("Inicio");
        jPanelConsulta.add(jLCodigo2);
        jLCodigo2.setBounds(20, 130, 50, 35);

        jLCodigo4.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLCodigo4.setText("Fin");
        jPanelConsulta.add(jLCodigo4);
        jLCodigo4.setBounds(320, 130, 30, 35);

        jCheckBox1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jCheckBox1.setText("Usuarios que han hecho préstamos en un periodo:");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jPanelConsulta.add(jCheckBox1);
        jCheckBox1.setBounds(20, 90, 410, 40);

        jButtonExportar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonExportar.setText("EXPORTAR");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonExportar);
        jButtonExportar.setBounds(440, 80, 140, 35);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar2.setText("Editar Usuario");
        jPanelEditar.add(jLabelRegistar2);
        jLabelRegistar2.setBounds(0, 10, 600, 40);

        jLIdentificacion1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLIdentificacion1.setText("Identificacion");
        jPanelEditar.add(jLIdentificacion1);
        jLIdentificacion1.setBounds(50, 70, 200, 30);

        jLTipoDoc1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTipoDoc1.setText("Tipo de Documento");
        jPanelEditar.add(jLTipoDoc1);
        jLTipoDoc1.setBounds(50, 110, 200, 30);

        jLNumDocumento1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumDocumento1.setText("Numero Documento");
        jPanelEditar.add(jLNumDocumento1);
        jLNumDocumento1.setBounds(50, 150, 200, 30);

        jLPrograma3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma3.setText("Nombre");
        jPanelEditar.add(jLPrograma3);
        jLPrograma3.setBounds(50, 190, 200, 30);

        jLEmail1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLEmail1.setText("Email");
        jPanelEditar.add(jLEmail1);
        jLEmail1.setBounds(50, 230, 200, 30);

        jLDireccion1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLDireccion1.setText("Direccion");
        jPanelEditar.add(jLDireccion1);
        jLDireccion1.setBounds(50, 270, 200, 30);

        jLTelefono1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTelefono1.setText("Telefono");
        jPanelEditar.add(jLTelefono1);
        jLTelefono1.setBounds(50, 310, 200, 30);

        jLCelular1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCelular1.setText("Celular");
        jPanelEditar.add(jLCelular1);
        jLCelular1.setBounds(50, 350, 200, 30);

        jTFIdentificacion1.setEditable(false);
        jTFIdentificacion1.setEnabled(false);
        jPanelEditar.add(jTFIdentificacion1);
        jTFIdentificacion1.setBounds(260, 70, 250, 30);
        jPanelEditar.add(jTFTipoDoc1);
        jTFTipoDoc1.setBounds(260, 110, 250, 30);
        jPanelEditar.add(jTFNumDoc1);
        jTFNumDoc1.setBounds(260, 150, 250, 30);
        jPanelEditar.add(jTFNombre1);
        jTFNombre1.setBounds(260, 190, 250, 30);
        jPanelEditar.add(jTFEmail1);
        jTFEmail1.setBounds(260, 230, 250, 30);
        jPanelEditar.add(jTFDireccion1);
        jTFDireccion1.setBounds(260, 270, 250, 30);
        jPanelEditar.add(jTFTelefono1);
        jTFTelefono1.setBounds(260, 310, 250, 30);
        jPanelEditar.add(jTFCelular1);
        jTFCelular1.setBounds(260, 350, 250, 30);

        jButtonLimpiarE.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarE.setText("LIMPIAR");
        jButtonLimpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarEActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonLimpiarE);
        jButtonLimpiarE.setBounds(315, 400, 130, 35);

        jButtonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonActualizar);
        jButtonActualizar.setBounds(165, 400, 130, 35);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 610, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">         

        if (jTableResultados.getSelectedRow() >= 0) {
            String idUsuario = jTableResultados.getValueAt(jTableResultados.getSelectedRow(), 0).toString();
            String usuario[] = controladorUsuario.seleccionarUsuario(idUsuario);

            jTFIdentificacion1.setText(usuario[0]);
            jTFTipoDoc1.setText(usuario[1]);
            jTFNumDoc1.setText(usuario[2]);
            jTFNombre1.setText(usuario[3]);
            jTFEmail1.setText(usuario[4]);
            jTFDireccion1.setText(usuario[5]);
            jTFTelefono1.setText(usuario[6]);
            jTFCelular1.setText(usuario[7]);

            jTabbedPane1.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun usuario para editar");
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">

        Object usuarios[][] = null;
        if (jCheckBox1.isSelected()) {
            usuarios = controladorUsuario.consultarUsuariosporPeriodo(
                    dateInicial.getDate(), dateFinal.getDate());

        } else {
            String busqueda;
            try {
                busqueda = jTFCodigo1.getText();
                usuarios = controladorUsuario.consultarUsuario(busqueda);
            } catch (NullPointerException e) {
                busqueda = "";
                usuarios = controladorUsuario.consultarTodoslosUsuarios();
            }
        }

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                usuarios,
                new String[]{"Identificacion", "Tipo Documento", "Numero Documento", "Nombre", "Email", "Direccion", "Telefono", "Celular"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));

        // Setting the colum width
        TableColumn column = null;
        for (int i = 0; i < 8; i++) {
            column = jTableResultados.getColumnModel().getColumn(i);
            if (i == 1 || i == 3 || i == 4 || i == 5) {
                column.setPreferredWidth(220);
            } else {
                column.setPreferredWidth(110);
            }

        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
    }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">        
        if (!jTFIdentificacion.getText().equals("")) {
            String registro;
            registro = controladorUsuario.guardarUsuario(jTFIdentificacion.getText(),
                    jTFTipoDoc.getText(),
                    jTFNumDoc.getText(),
                    jTFNombre.getText(),
                    jTFEmail.getText(),
                    jTFDireccion.getText(),
                    jTFTelefono.getText(),
                    jTFCelular.getText());
            if (registro.equals("OK")) {
                JOptionPane.showMessageDialog(this, "Usuario Registrado exitosamente");
                limpiarCamposRegistro();
            } else {
                JOptionPane.showMessageDialog(this, registro);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay suficiente informacion para registrar un Usuario");
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonLimpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarEActionPerformed
        limpiarCamposEdicion();
    }//GEN-LAST:event_jButtonLimpiarEActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        String registro;
        registro = controladorUsuario.editarUsuario(
                jTFTipoDoc1.getText(),
                jTFNumDoc1.getText(),
                jTFNombre1.getText(),
                jTFEmail1.getText(),
                jTFDireccion1.getText(),
                jTFTelefono1.getText(),
                jTFCelular1.getText());
        if (registro.equals("OK")) {
            JOptionPane.showMessageDialog(this, "Usuario actualizado exitosamente");
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        jTabbedPane1.setSelectedIndex(1);
        limpiarCamposConsulta();
        jTFCodigo1.setText(jTFIdentificacion1.getText());
        jButtonConsultar.doClick();
        limpiarCamposEdicion();
        jTFIdentificacion1.setText("");
        //</editor-fold>
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        int[] selection = jTableResultados.getSelectedRows();
        if (selection.length > 0) {
            String[] idUsuarios = new String[selection.length];
            
            for (int i = 0; i < idUsuarios.length; i++) {
                idUsuarios[i] = jTableResultados.getValueAt(selection[i], 0).toString();
            }
            try {
                controladorUsuario.eliminar(idUsuarios);
            } catch (NonexistentEntityException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            limpiarCamposConsulta();
            jButtonConsultar.doClick();
        } else {
            JOptionPane.showMessageDialog(this, "Ningun usuario seleccionado para eliminar");
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        //<editor-fold defaultstate="collapsed" desc="jCheckBox1ItemStateChanged">
        if (jCheckBox1.isSelected()) {
            jTFCodigo1.setEnabled(false);
            dateInicial.setEnabled(true);
            dateFinal.setEnabled(true);
            jTFCodigo1.setText("");
        } else {
            jTFCodigo1.setEnabled(true);
            dateInicial.setEnabled(false);
            dateFinal.setEnabled(false);
        }
        //</editor-fold>
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        new ReportFromJTable(jTableResultados, "Consulta Usuarios");
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFIdentificacion.setText("");
        jTFTipoDoc.setText("");
        jTFNumDoc.setText("");
        jTFNombre.setText("");
        jTFEmail.setText("");
        jTFDireccion.setText("");
        jTFTelefono.setText("");
        jTFCelular.setText("");
        //</editor-fold>
    }

    private void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFTipoDoc1.setText("");
        jTFNumDoc1.setText("");
        jTFNombre1.setText("");
        jTFEmail1.setText("");
        jTFDireccion1.setText("");
        jTFTelefono1.setText("");
        jTFCelular1.setText("");
        //</editor-fold>
    }

    private void limpiarCamposConsulta() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposConsulta()">
        jTFCodigo1.setText("");

        TableModel myModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{});

        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));
        //</editor-fold>
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonLimpiarC;
    private javax.swing.JButton jButtonLimpiarE;
    private javax.swing.JButton jButtonLimpiarR;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCelular1;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLCodigo2;
    private javax.swing.JLabel jLCodigo4;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLDireccion1;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEmail1;
    private javax.swing.JLabel jLIdentificacion;
    private javax.swing.JLabel jLIdentificacion1;
    private javax.swing.JLabel jLNumDocumento;
    private javax.swing.JLabel jLNumDocumento1;
    private javax.swing.JLabel jLPrograma2;
    private javax.swing.JLabel jLPrograma3;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTelefono1;
    private javax.swing.JLabel jLTipoDoc;
    private javax.swing.JLabel jLTipoDoc1;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar2;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCelular1;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDireccion1;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFIdentificacion;
    private javax.swing.JTextField jTFIdentificacion1;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNumDoc;
    private javax.swing.JTextField jTFNumDoc1;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefono1;
    private javax.swing.JTextField jTFTipoDoc;
    private javax.swing.JTextField jTFTipoDoc1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
