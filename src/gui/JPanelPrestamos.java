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
import controlador.ControladorPrestamo;
import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JPanelPrestamos extends javax.swing.JPanel {

    ControladorPrestamo controladorPrestamo;
    JDateChooser dateChooserPrestamo;
    JDateChooser dateChooserDevolucion;
    JDateChooser dateChooserPrestamo1;
    JDateChooser dateChooserDevolucion1;
    String dateFormatPattern;

    public JPanelPrestamos() {
        controladorPrestamo = new ControladorPrestamo();
        initComponents();

        dateFormatPattern = "dd MMMM yyyy' - 'hh:mm:ss aa";
        dateChooserPrestamo = new JDateChooser(new Date());
        dateChooserPrestamo.setDateFormatString(dateFormatPattern);
        dateChooserPrestamo.setBounds(230, 190, 330, 30);
        jPanelRegistar.add(dateChooserPrestamo);

        dateChooserDevolucion = new JDateChooser(new Date());
        dateChooserDevolucion.setDateFormatString(dateFormatPattern);
        dateChooserDevolucion.setBounds(230, 230, 330, 30);
        jPanelRegistar.add(dateChooserDevolucion);

        dateChooserPrestamo1 = new JDateChooser(new Date());
        dateChooserPrestamo1.setDateFormatString(dateFormatPattern);
        dateChooserPrestamo1.setBounds(230, 190, 330, 30);
        jPanelEditar.add(dateChooserPrestamo1);

        dateChooserDevolucion1 = new JDateChooser(new Date());
        dateChooserDevolucion1.setDateFormatString(dateFormatPattern);
        dateChooserDevolucion1.setBounds(230, 230, 330, 30);
        jPanelEditar.add(dateChooserDevolucion1);

        jCBid_libro.setModel(new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadLibros()));
        jCBid_usuario.setModel(new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadUsuarios()));
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
        jTFId_prestamo = new javax.swing.JTextField();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jCBid_libro = new javax.swing.JComboBox();
        jCBid_usuario = new javax.swing.JComboBox();
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
        jButtonExportar = new javax.swing.JButton();
        jPanelEditar = new javax.swing.JPanel();
        jLabelRegistar3 = new javax.swing.JLabel();
        jLIdentificacion2 = new javax.swing.JLabel();
        jLTipoDoc2 = new javax.swing.JLabel();
        jLNumDocumento2 = new javax.swing.JLabel();
        jLPrograma4 = new javax.swing.JLabel();
        jLEmail2 = new javax.swing.JLabel();
        jTFId_prestamo1 = new javax.swing.JTextField();
        jButtonLimpiarR1 = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jCBid_libro1 = new javax.swing.JComboBox();
        jCBid_usuario1 = new javax.swing.JComboBox();

        setLayout(null);

        jPanelRegistar.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Prestamo");
        jPanelRegistar.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 600, 40);

        jLIdentificacion.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLIdentificacion.setText("Identificacion");
        jPanelRegistar.add(jLIdentificacion);
        jLIdentificacion.setBounds(50, 70, 200, 30);

        jLTipoDoc.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTipoDoc.setText("Id Libro");
        jPanelRegistar.add(jLTipoDoc);
        jLTipoDoc.setBounds(50, 110, 200, 30);

        jLNumDocumento.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumDocumento.setText("Id Usuario");
        jPanelRegistar.add(jLNumDocumento);
        jLNumDocumento.setBounds(50, 150, 200, 30);

        jLPrograma2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma2.setText("Fecha Prestamo");
        jPanelRegistar.add(jLPrograma2);
        jLPrograma2.setBounds(50, 190, 200, 30);

        jLEmail.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLEmail.setText("Fecha Devolucion");
        jPanelRegistar.add(jLEmail);
        jLEmail.setBounds(50, 230, 200, 30);

        jTFId_prestamo.setText("P-");
        jPanelRegistar.add(jTFId_prestamo);
        jTFId_prestamo.setBounds(230, 70, 330, 30);

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

        jCBid_libro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBid_libroPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelRegistar.add(jCBid_libro);
        jCBid_libro.setBounds(230, 110, 330, 30);

        jCBid_usuario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBid_usuarioPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelRegistar.add(jCBid_usuario);
        jCBid_usuario.setBounds(230, 150, 330, 30);

        jTabbedPane1.addTab("Registar", jPanelRegistar);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Prestamos");
        jPanelConsulta.add(jLabelRegistar1);
        jLabelRegistar1.setBounds(0, 5, 600, 40);

        jLCodigo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLCodigo1.setText("Codigo");
        jPanelConsulta.add(jLCodigo1);
        jLCodigo1.setBounds(70, 60, 100, 35);
        jPanelConsulta.add(jTFCodigo1);
        jTFCodigo1.setBounds(170, 60, 230, 35);

        jButtonLimpiarC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarC.setText("LIMPIAR");
        jButtonLimpiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonLimpiarC);
        jButtonLimpiarC.setBounds(430, 40, 140, 35);

        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonConsultar);
        jButtonConsultar.setBounds(70, 130, 140, 35);

        jButtonEditar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEditar);
        jButtonEditar.setBounds(230, 130, 140, 35);

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableResultados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTableResultados);

        jPanelConsulta.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 580, 270);

        jButtonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonEliminar);
        jButtonEliminar.setBounds(390, 130, 140, 35);

        jButtonExportar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonExportar.setText("EXPORTAR");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });
        jPanelConsulta.add(jButtonExportar);
        jButtonExportar.setBounds(430, 80, 140, 35);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar3.setText("Editar Prestamo");
        jPanelEditar.add(jLabelRegistar3);
        jLabelRegistar3.setBounds(0, 10, 600, 40);

        jLIdentificacion2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLIdentificacion2.setText("Identificacion");
        jPanelEditar.add(jLIdentificacion2);
        jLIdentificacion2.setBounds(50, 70, 200, 30);

        jLTipoDoc2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTipoDoc2.setText("Id Libro");
        jPanelEditar.add(jLTipoDoc2);
        jLTipoDoc2.setBounds(50, 110, 200, 30);

        jLNumDocumento2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLNumDocumento2.setText("Id Usuario");
        jPanelEditar.add(jLNumDocumento2);
        jLNumDocumento2.setBounds(50, 150, 200, 30);

        jLPrograma4.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLPrograma4.setText("Fecha Prestamo");
        jPanelEditar.add(jLPrograma4);
        jLPrograma4.setBounds(50, 190, 200, 30);

        jLEmail2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLEmail2.setText("Fecha Devolucion");
        jPanelEditar.add(jLEmail2);
        jLEmail2.setBounds(50, 230, 200, 30);

        jTFId_prestamo1.setText("P-");
        jPanelEditar.add(jTFId_prestamo1);
        jTFId_prestamo1.setBounds(230, 70, 330, 30);

        jButtonLimpiarR1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonLimpiarR1.setText("LIMPIAR");
        jButtonLimpiarR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarR1ActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonLimpiarR1);
        jButtonLimpiarR1.setBounds(315, 400, 130, 35);

        jButtonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelEditar.add(jButtonActualizar);
        jButtonActualizar.setBounds(165, 400, 130, 35);

        jCBid_libro1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBid_libro1PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelEditar.add(jCBid_libro1);
        jCBid_libro1.setBounds(230, 110, 330, 30);

        jCBid_usuario1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBid_usuario1PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelEditar.add(jCBid_usuario1);
        jCBid_usuario1.setBounds(230, 150, 330, 30);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 610, 500);
        jTabbedPane1.setEnabledAt(2, false);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">         
        if (jTableResultados.getSelectedRow() >= 0) {
            String idPrestamo = jTableResultados.getValueAt(jTableResultados.getSelectedRow(), 0).toString();
            String prestamo[] = controladorPrestamo.seleccionarPrestamo(idPrestamo);

            jTFId_prestamo1.setText(prestamo[0]);

            jCBid_libro1.setModel(new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadLibros()));
            jCBid_libro1.setSelectedItem(prestamo[1]);

            jCBid_usuario1.setModel(new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadUsuarios()));
            jCBid_usuario1.setSelectedItem(prestamo[2]);
            
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy' - 'hh:mm:ss aa");
            try {
                dateChooserPrestamo1.setDate(simpleDateFormat.parse(prestamo[3]));
                dateChooserDevolucion1.setDate(simpleDateFormat.parse(prestamo[4]));
            } catch (ParseException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }

            jTabbedPane1.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun usuario para editar");
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonConsultarActionPerformed()">
        String busqueda;
        try {
            busqueda = jTFCodigo1.getText();
        } catch (NullPointerException e) {
            busqueda = "";
        }

        Object prestamos[][] = controladorPrestamo.consultarPrestamo(busqueda);
        TableModel myModel = new javax.swing.table.DefaultTableModel(
                prestamos,
                new String[]{"Id", "id Libro", "id Usuario", "Fecha Prestamo", "Fecha Devolucion"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));

        // Setting the colum width
        TableColumn column = null;
        for (int i = 0; i < 5; i++) {
            column = jTableResultados.getColumnModel().getColumn(i);
            if ( i == 3 || i == 4) {
                column.setPreferredWidth(220);
            } else {
                column.setPreferredWidth(90);
            }

        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimpiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCActionPerformed
        limpiarCamposConsulta();
    }//GEN-LAST:event_jButtonLimpiarCActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEliminarActionPerformed()">
        int[] selection = jTableResultados.getSelectedRows();
        if (selection.length > 0) {
            String[] idPrestamos = new String[selection.length];

            for (int i = 0; i < idPrestamos.length; i++) {
                idPrestamos[i] = jTableResultados.getValueAt(selection[i], 0).toString();
            }
            try {
                controladorPrestamo.eliminar(idPrestamos);
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

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonRegistarActionPerformed()">        
        if (!jTFId_prestamo.getText().equals("P-")) {
            try {
                controladorPrestamo.guardarPrestamo(jTFId_prestamo.getText(),
                        jCBid_libro.getSelectedItem().toString().split(" - ")[0],
                        jCBid_usuario.getSelectedItem().toString().split(" - ")[0],
                        dateChooserPrestamo.getDate(),
                        dateChooserDevolucion.getDate());
                JOptionPane.showMessageDialog(this, "Prestamo registrado exitosamente");
                limpiarCamposRegistro();
                
            } catch (PreexistingEntityException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay suficiente informacion para registar el prestamo");
        }
        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jCBid_libroPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBid_libroPopupMenuWillBecomeVisible
        jCBid_libro.setModel(
                new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadLibros()));
    }//GEN-LAST:event_jCBid_libroPopupMenuWillBecomeVisible

    private void jCBid_usuarioPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBid_usuarioPopupMenuWillBecomeVisible
        jCBid_usuario.setModel(
                new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadUsuarios()));
    }//GEN-LAST:event_jCBid_usuarioPopupMenuWillBecomeVisible

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        new ReportFromJTable(jTableResultados, "Consulta Prestamos");
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void jButtonLimpiarR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarR1ActionPerformed
        limpiarCamposEdicion();
    }//GEN-LAST:event_jButtonLimpiarR1ActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonActualizarActionPerformed()">
        String registro;
        registro = controladorPrestamo.editarPrestamo(
                    jCBid_libro1.getSelectedItem().toString().split(" - ")[0],
                    jCBid_usuario1.getSelectedItem().toString().split(" - ")[0],
                    dateChooserPrestamo1.getDate(),
                    dateChooserDevolucion1.getDate());
        
        if (registro.equals("OK")) {
            JOptionPane.showMessageDialog(this, "Usuario actualizado exitosamente");
            limpiarCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, registro);
        }
        jTabbedPane1.setSelectedIndex(1);
        limpiarCamposConsulta();
        jTFCodigo1.setText(jTFId_prestamo1.getText());
        jButtonConsultar.doClick();
        //</editor-fold>         
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jCBid_libro1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBid_libro1PopupMenuWillBecomeVisible
        String seleccionado = jCBid_libro1.getSelectedItem().toString();
        jCBid_libro1.setModel(
                new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadLibros()));
        jCBid_libro1.setSelectedItem(seleccionado);
    }//GEN-LAST:event_jCBid_libro1PopupMenuWillBecomeVisible

    private void jCBid_usuario1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBid_usuario1PopupMenuWillBecomeVisible
        String seleccionado = jCBid_usuario1.getSelectedItem().toString();
        jCBid_usuario1.setModel(
                new javax.swing.DefaultComboBoxModel(controladorPrestamo.loadUsuarios()));
        jCBid_usuario1.setSelectedItem(seleccionado);
    }//GEN-LAST:event_jCBid_usuario1PopupMenuWillBecomeVisible

    private void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFId_prestamo.setText("P-");
        jCBid_libro.setSelectedIndex(0);
        jCBid_usuario.setSelectedIndex(0);
        dateChooserDevolucion.setDate(new Date());
        dateChooserPrestamo.setDate(new Date());
        //</editor-fold>
    }

    private void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jCBid_libro1.setSelectedIndex(0);
        jCBid_usuario1.setSelectedIndex(0);
        dateChooserDevolucion1.setDate(new Date());
        dateChooserPrestamo1.setDate(new Date());
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
    private javax.swing.JButton jButtonLimpiarR;
    private javax.swing.JButton jButtonLimpiarR1;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JComboBox jCBid_libro;
    private javax.swing.JComboBox jCBid_libro1;
    private javax.swing.JComboBox jCBid_usuario;
    private javax.swing.JComboBox jCBid_usuario1;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEmail2;
    private javax.swing.JLabel jLIdentificacion;
    private javax.swing.JLabel jLIdentificacion2;
    private javax.swing.JLabel jLNumDocumento;
    private javax.swing.JLabel jLNumDocumento2;
    private javax.swing.JLabel jLPrograma2;
    private javax.swing.JLabel jLPrograma4;
    private javax.swing.JLabel jLTipoDoc;
    private javax.swing.JLabel jLTipoDoc2;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar3;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFId_prestamo;
    private javax.swing.JTextField jTFId_prestamo1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
