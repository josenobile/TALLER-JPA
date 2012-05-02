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

import dao.exceptions.PreexistingEntityException;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import controlador.ControladorLibro;
import dao.exceptions.NonexistentEntityException;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class JPanelLibros extends javax.swing.JPanel {

    ControladorLibro controladorLibro;

    public JPanelLibros() {
        controladorLibro = new ControladorLibro();
        initComponents();
        jTabbedPane1.setEnabledAt(2, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelRegistar = new javax.swing.JPanel();
        jLabelRegistar = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLSubtitulo = new javax.swing.JLabel();
        jLAutores = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFTitulo = new javax.swing.JTextField();
        jTFSubTitulo = new javax.swing.JTextField();
        jButtonLimpiarR = new javax.swing.JButton();
        jButtonRegistar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAutores = new javax.swing.JTextArea();
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
        jLabelRegistar2 = new javax.swing.JLabel();
        jLId1 = new javax.swing.JLabel();
        jLTitulo1 = new javax.swing.JLabel();
        jLSubtitulo1 = new javax.swing.JLabel();
        jLAutores1 = new javax.swing.JLabel();
        jTFId1 = new javax.swing.JTextField();
        jTFTitulo1 = new javax.swing.JTextField();
        jTFSubTitulo1 = new javax.swing.JTextField();
        jButtonLimpiarR1 = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAutores1 = new javax.swing.JTextArea();

        setLayout(null);

        jPanelRegistar.setLayout(null);

        jLabelRegistar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar.setText("Registar Libro");
        jPanelRegistar.add(jLabelRegistar);
        jLabelRegistar.setBounds(0, 10, 600, 40);

        jLId.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLId.setText("id");
        jPanelRegistar.add(jLId);
        jLId.setBounds(50, 70, 200, 30);

        jLTitulo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTitulo.setText("Titulo");
        jPanelRegistar.add(jLTitulo);
        jLTitulo.setBounds(50, 110, 200, 30);

        jLSubtitulo.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSubtitulo.setText("Subtitulo");
        jPanelRegistar.add(jLSubtitulo);
        jLSubtitulo.setBounds(50, 150, 200, 30);

        jLAutores.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLAutores.setText("Autores:");
        jPanelRegistar.add(jLAutores);
        jLAutores.setBounds(50, 190, 200, 30);
        jPanelRegistar.add(jTFId);
        jTFId.setBounds(260, 70, 250, 30);
        jPanelRegistar.add(jTFTitulo);
        jTFTitulo.setBounds(260, 110, 250, 30);
        jPanelRegistar.add(jTFSubTitulo);
        jTFSubTitulo.setBounds(260, 150, 250, 30);

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

        jTextAreaAutores.setColumns(20);
        jTextAreaAutores.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAutores);

        jPanelRegistar.add(jScrollPane2);
        jScrollPane2.setBounds(50, 230, 490, 150);

        jTabbedPane1.addTab("Registar", jPanelRegistar);

        jPanelConsulta.setLayout(null);

        jLabelRegistar1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar1.setText("Consulta Libro");
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
        jButtonLimpiarC.setBounds(440, 40, 140, 35);

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
        jButtonExportar.setBounds(440, 80, 140, 35);

        jTabbedPane1.addTab("Consultar", jPanelConsulta);

        jPanelEditar.setLayout(null);

        jLabelRegistar2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelRegistar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistar2.setText("Editar Libro");
        jPanelEditar.add(jLabelRegistar2);
        jLabelRegistar2.setBounds(0, 10, 600, 40);

        jLId1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLId1.setText("id");
        jPanelEditar.add(jLId1);
        jLId1.setBounds(50, 70, 200, 30);

        jLTitulo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLTitulo1.setText("Titulo");
        jPanelEditar.add(jLTitulo1);
        jLTitulo1.setBounds(50, 110, 200, 30);

        jLSubtitulo1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLSubtitulo1.setText("Subtitulo");
        jPanelEditar.add(jLSubtitulo1);
        jLSubtitulo1.setBounds(50, 150, 200, 30);

        jLAutores1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLAutores1.setText("Autores:");
        jPanelEditar.add(jLAutores1);
        jLAutores1.setBounds(50, 190, 200, 30);

        jTFId1.setEditable(false);
        jTFId1.setEnabled(false);
        jPanelEditar.add(jTFId1);
        jTFId1.setBounds(260, 70, 250, 30);
        jPanelEditar.add(jTFTitulo1);
        jTFTitulo1.setBounds(260, 110, 250, 30);
        jPanelEditar.add(jTFSubTitulo1);
        jTFSubTitulo1.setBounds(260, 150, 250, 30);

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

        jTextAreaAutores1.setColumns(20);
        jTextAreaAutores1.setRows(5);
        jScrollPane3.setViewportView(jTextAreaAutores1);

        jPanelEditar.add(jScrollPane3);
        jScrollPane3.setBounds(50, 230, 490, 150);

        jTabbedPane1.addTab("Editar", jPanelEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 610, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //<editor-fold defaultstate="collapsed" desc="jButtonEditarActionPerformed()">         

        if (jTableResultados.getSelectedRow() >= 0) {
            limpiarCamposEdicion();
            String idLibro = jTableResultados.getValueAt(jTableResultados.getSelectedRow(), 0).toString();
            String libro[] = controladorLibro.seleccionarLibro(idLibro);
            String autores[] = controladorLibro.getAutores(idLibro);

            jTFId1.setText(libro[0]);
            jTFTitulo1.setText(libro[1]);
            jTFSubTitulo1.setText(libro[2]);

            for (int i = 0; i < autores.length; i++) {
                jTextAreaAutores1.append(autores[i]);
                jTextAreaAutores1.append("\n");
            }
            jTabbedPane1.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun Libro para editar");
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
        Object libros[][] = controladorLibro.consultarLibros(busqueda);
        TableModel myModel = new javax.swing.table.DefaultTableModel(
                libros,
                new String[]{"Identificacion", "Titulo", "Subtitulo"}) {

            boolean[] canEdit = new boolean[]{false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        jTableResultados.setModel(myModel);
        jTableResultados.setRowSorter(new TableRowSorter(myModel));

        // Setting the colum width
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jTableResultados.getColumnModel().getColumn(i);
            if (i == 1 || i == 2) {
                column.setPreferredWidth(300);
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

        if (!jTFId.getText().equals("")) {
            String lectura = jTextAreaAutores.getText();
            String autores[] = lectura.split("\n");

            try {
                controladorLibro.guardarLibro(jTFId.getText(),
                        jTFTitulo.getText(),
                        jTFSubTitulo.getText(),
                        autores);
                JOptionPane.showMessageDialog(this, "Libro Registrado Exitosamente");
                limpiarCamposRegistro();
            } catch (PreexistingEntityException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay informacion suficiente para registrar");
        }

        //</editor-fold>
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_jButtonLimpiarRActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int[] selection = jTableResultados.getSelectedRows();
        if (selection.length > 0) {
            String[] idLibros = new String[selection.length];

            for (int i = 0; i < idLibros.length; i++) {
                idLibros[i] = jTableResultados.getValueAt(selection[i], 0).toString();
            }
            try {
                controladorLibro.eliminar(idLibros);
            } catch (NonexistentEntityException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            limpiarCamposConsulta();
            jButtonConsultar.doClick();
        } else {
            JOptionPane.showMessageDialog(this, "Ningun usuario seleccionado para eliminar");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarR1ActionPerformed
        limpiarCamposEdicion();
    }//GEN-LAST:event_jButtonLimpiarR1ActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        String lectura = jTextAreaAutores1.getText();
        String autores[] = lectura.split("\n");

        try {
            controladorLibro.editarLibro(
                    jTFTitulo1.getText(),
                    jTFSubTitulo1.getText(),
                    autores);

        } catch (PreexistingEntityException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }

        jTabbedPane1.setSelectedIndex(1);
        limpiarCamposConsulta();
        jTFCodigo1.setText(jTFId1.getText());
        jButtonConsultar.doClick();
        limpiarCamposEdicion();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed

        new ReportFromJTable(jTableResultados, "Consulta Libros");

    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void limpiarCamposRegistro() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposRegistro()">
        jTFId.setText("");
        jTFTitulo.setText("");
        jTFSubTitulo.setText("");
        jTextAreaAutores.setText("");
        //</editor-fold>
    }

    private void limpiarCamposEdicion() {
        //<editor-fold defaultstate="collapsed" desc="limpiarCamposEdicion()">
        jTFTitulo1.setText("");
        jTFSubTitulo1.setText("");
        jTextAreaAutores1.setText("");
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
    private javax.swing.JLabel jLAutores;
    private javax.swing.JLabel jLAutores1;
    private javax.swing.JLabel jLCodigo1;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLId1;
    private javax.swing.JLabel jLSubtitulo;
    private javax.swing.JLabel jLSubtitulo1;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLabelRegistar;
    private javax.swing.JLabel jLabelRegistar1;
    private javax.swing.JLabel jLabelRegistar2;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelRegistar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFId1;
    private javax.swing.JTextField jTFSubTitulo;
    private javax.swing.JTextField jTFSubTitulo1;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTextField jTFTitulo1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableResultados;
    private javax.swing.JTextArea jTextAreaAutores;
    private javax.swing.JTextArea jTextAreaAutores1;
    // End of variables declaration//GEN-END:variables
}
