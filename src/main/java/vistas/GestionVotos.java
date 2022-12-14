/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.ClsCanXEle;
import clases.ClsEleccion;
import clases.ClsInscripcion;
import clases.ClsResultado;
import clases.ClsVotante;
import clases.ClsVoto;
import controladores.CtlCandidato;
import controladores.CtlEleccion;
import controladores.CtlVotante;
import controladores.CtlVoto;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class GestionVotos extends javax.swing.JFrame {
    public CtlVotante votante;
    public ClsVotante clsVotante;
     protected LinkedList<ClsEleccion> listaElecciones;
     protected LinkedList<ClsEleccion> listaElecciones1;
     protected LinkedList<ClsCanXEle> listaCanEle;
     protected LinkedList<ClsCanXEle> listaCanEle1;
     public CtlEleccion ctlEleccion;
     public CtlCandidato ctlCandidato;
     public CtlVoto ctlVoto;
     public JFrame ventanaPrincipal;
    /**
     * Creates new form GestionVotos
     */
    public GestionVotos(JFrame menuPrincipal) {
        initComponents();
        this.votante = new CtlVotante();
        this.listaElecciones = new LinkedList<ClsEleccion>();
        this.listaElecciones1 = new LinkedList<ClsEleccion>();
        this.listaCanEle = new LinkedList<ClsCanXEle>();
        this.listaCanEle1 = new LinkedList<ClsCanXEle>();
        this.ctlEleccion = new CtlEleccion();
        this.ctlVoto = new CtlVoto();
        this.ctlCandidato = new CtlCandidato();
        this.ventanaPrincipal = menuPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCandidatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaElecciones = new javax.swing.JTable();
        btnVotar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cedulaVotante = new javax.swing.JTextField();
        btnValidarVotante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaElecciones1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCandidatos1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VOTACIONES");

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel2.setText("ELECCION");

        tablaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Partido Politico", "Mensaje Campa??a"
            }
        ));
        tablaCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCandidatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCandidatos);

        jLabel3.setText("SELECCIONAR CANDIDATO");

        tablaElecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Categoria", "Periodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaElecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEleccionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaElecciones);

        btnVotar.setText("VOTAR");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        jLabel4.setText("IDENTIFICACI??N  VOTANTE");

        cedulaVotante.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cedulaVotanteInputMethodTextChanged(evt);
            }
        });
        cedulaVotante.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cedulaVotantePropertyChange(evt);
            }
        });

        btnValidarVotante.setText("Validar");
        btnValidarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarVotanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cedulaVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnValidarVotante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVotar)
                        .addGap(300, 300, 300))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedulaVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnValidarVotante))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVotar)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("VOTAR", jPanel1);

        tablaElecciones1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Categoria", "Periodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaElecciones1.setGridColor(new java.awt.Color(255, 255, 255));
        tablaElecciones1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaElecciones1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaElecciones1);

        tablaCandidatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Partido Politico", "Mensaje Campa??a", "Votacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCandidatos1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaCandidatos1ComponentAdded(evt);
            }
        });
        tablaCandidatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCandidatos1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCandidatos1);

        jLabel5.setText("ELECCION");

        jLabel6.setText("RESULTADOS POR CANDIDATO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel6)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("REPORTE", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel3);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarVotanteActionPerformed
        // TODO add your handling code here:
        this.clsVotante = this.votante.buscarVotante(this.cedulaVotante.getText());
        if(this.clsVotante!=null)
          {
              this.ObtenerElecciones();
          }
         else
          {
              this.limpiarTablas(this.tablaElecciones);
              this.limpiarTablas(this.tablaCandidatos);
              JOptionPane.showMessageDialog(null, "El n??mero de Identificai??n "+this.cedulaVotante.getText()+" No se encuentra registrado. Favor registrarse");
          }
    }//GEN-LAST:event_btnValidarVotanteActionPerformed

    private void tablaEleccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEleccionesMouseClicked
        // TODO add your handling code here:
        int columna = 0;
        int fila = this.tablaElecciones.getSelectedRow();
        String idEleccion = this.tablaElecciones.getValueAt(fila, columna).toString();
        if(!this.ctlVoto.consultarSiVoto(this.clsVotante.identificacion,Integer.parseInt(idEleccion))){
            this.ObtenerCandidatosPorEleccion(Integer.parseInt(idEleccion));
            this.actualizarTablaCandidatosInscritos(this.listaCanEle);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El usuario con n??mero de c??dula "+ this.clsVotante.identificacion +" ya voto");
        }
    }//GEN-LAST:event_tablaEleccionesMouseClicked

    private void tablaCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCandidatosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaCandidatosMouseClicked

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        // TODO add your handling code here:
        
        int columna = 0;
        int fila = this.tablaCandidatos.getSelectedRow();
        if(fila!=-1){
            String idIns = this.tablaCandidatos.getValueAt(fila, columna).toString();
            int idInscripcion = Integer.parseInt(idIns);
            int estado = 1;
            String idVotante = this.clsVotante.identificacion;
            //JOptionPane.showMessageDialog(null, id);
            ClsVoto clsVoto = new ClsVoto(0, idInscripcion, null, estado, idVotante);
            ClsResultado res = ctlVoto.adicionarVoto(clsVoto);
             res.mostrarMensaje();
            if(res.getTipo() == ClsResultado.OK){
                this.limpiarTablas(this.tablaCandidatos);
                this.tablaElecciones.clearSelection();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No fue posible registrar el voto, intentalo nuevamente");

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un candidato");
        }
        
    }//GEN-LAST:event_btnVotarActionPerformed

    private void cedulaVotanteInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cedulaVotanteInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaVotanteInputMethodTextChanged

    private void cedulaVotantePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cedulaVotantePropertyChange

    }//GEN-LAST:event_cedulaVotantePropertyChange

    private void tablaElecciones1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaElecciones1MouseClicked
        // TODO add your handling code here:
        int columna = 0;
        int fila = this.tablaElecciones1.getSelectedRow();
        String idEleccion = this.tablaElecciones1.getValueAt(fila, columna).toString();
        this.ObtenerCandidatosPorEleccion1(Integer.parseInt(idEleccion));
        this.actualizarTablaCandidatosInscritos1(this.listaCanEle1);

    }//GEN-LAST:event_tablaElecciones1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        ObtenerElecciones1();
        this.limpiarTablas(this.tablaCandidatos1);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void tablaCandidatos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCandidatos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCandidatos1MouseClicked

    private void tablaCandidatos1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaCandidatos1ComponentAdded
        // TODO add your handling code here:
        System.out.println("HOLA");
    }//GEN-LAST:event_tablaCandidatos1ComponentAdded

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

     public void ObtenerElecciones() {
        this.listaElecciones = this.ctlEleccion.ObtenerElecciones();
        this.actualizarTablaElecciones(this.listaElecciones);
    }
     
    public void ObtenerElecciones1() {
        if(this.listaElecciones1 !=null){
            this.listaElecciones1 = this.ctlEleccion.ObtenerElecciones();
            this.actualizarTablaElecciones1(this.listaElecciones1);
        }
    }
     
    public void ObtenerCandidatosPorEleccion(int idEleccion){
        this.listaCanEle = this.ctlCandidato.obtenerCandidatosPorEleccion(idEleccion);
    }
    
        public void ObtenerCandidatosPorEleccion1(int idEleccion){
        this.listaCanEle1 = this.ctlCandidato.obtenerCandidatosPorEleccion(idEleccion);
    }
    
    private void actualizarTablaElecciones(LinkedList<ClsEleccion> elecciones) {
            if(elecciones!=null){
                DefaultTableModel modelo = (DefaultTableModel) this.tablaElecciones.getModel();
                modelo.setRowCount(0);

                for (ClsEleccion c : elecciones) {

                    Object[] fila = {c.idEleccion, c.nombre,c.categoria, c.fechaInicio +"-"+c.fechaFin};

                    modelo.addRow(fila);

                }
            }
    }
        private void actualizarTablaElecciones1(LinkedList<ClsEleccion> elecciones) {
            if(elecciones!=null){
                DefaultTableModel modelo = (DefaultTableModel) this.tablaElecciones1.getModel();
                modelo.setRowCount(0);

                for (ClsEleccion c : elecciones) {

                    Object[] fila = {c.idEleccion, c.nombre,c.categoria, c.fechaInicio +"-"+c.fechaFin};

                    modelo.addRow(fila);

                }
            }
    }
    
     private void actualizarTablaCandidatosInscritos(LinkedList<ClsCanXEle> candidatosInscritos) {
            if(candidatosInscritos!=null){
                DefaultTableModel modelo = (DefaultTableModel) this.tablaCandidatos.getModel();
                modelo.setRowCount(0);
                for (ClsCanXEle c : candidatosInscritos) {
                    Object[] fila = {c.idInscripcion, c.nombres +" "+c.apellidos,c.partidoPolitico, c.partidoPolitico};
                    modelo.addRow(fila);
                }
            }
       }
     
        private void actualizarTablaCandidatosInscritos1(LinkedList<ClsCanXEle> candidatosInscritos) {
              if(candidatosInscritos!=null){
                  DefaultTableModel modelo = (DefaultTableModel) this.tablaCandidatos1.getModel();
                  modelo.setRowCount(0);
                  for (ClsCanXEle c : candidatosInscritos) {
                       int cantidad = this.ctlVoto.obtenerCantidadVotos(c.idInscripcion);
                      Object[] fila = {c.idInscripcion, c.nombres +" "+c.apellidos,c.partidoPolitico, c.partidoPolitico, cantidad};
                      modelo.addRow(fila);
                  }
              }
         }
    
    
    public void limpiarTablas(JTable jTable)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVotos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidarVotante;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVotar;
    private javax.swing.JTextField cedulaVotante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaCandidatos;
    private javax.swing.JTable tablaCandidatos1;
    private javax.swing.JTable tablaElecciones;
    private javax.swing.JTable tablaElecciones1;
    // End of variables declaration//GEN-END:variables
}
