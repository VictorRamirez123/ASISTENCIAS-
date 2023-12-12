
package Vistas;

import Modelo.dusuario;


public class Menu_Principal extends javax.swing.JFrame {

    dusuario ingresar;
    public Menu_Principal() {
        initComponents();
        
            this.setLocationRelativeTo(null);
        
        
        
    }
    public  Menu_Principal(dusuario ingresar)
         
 {
      initComponents();
      
       this.setLocationRelativeTo(null);
      
      this.ingresar=ingresar;
      
      

          
          
 }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu33 = new javax.swing.JMenu();
        btnCerrarSecion = new javax.swing.JMenuItem();

        jMenu11.setText("File");
        jMenuBar2.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar2.add(jMenu12);

        jMenu31.setText("jMenu31");

        jMenu1.setText("jMenu1");

        jMenu7.setText("jMenu7");

        jMenuItem8.setText("jMenuItem8");

        jMenu9.setText("jMenu9");

        jMenu16.setText("jMenu16");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Matricula  & Asistencias");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/CELESTE.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ALUMNOS.jpg"))); // NOI18N
        jMenu3.setText("Alumnos");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Boss.png"))); // NOI18N
        jMenuItem2.setText("Registrar Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Male symbol.png"))); // NOI18N
        jMenuItem17.setText("Registrar Grado");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Message.png"))); // NOI18N
        jMenuItem19.setText("Registrar Asistencia");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuBar1.add(jMenu3);

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/mantenimiento.png"))); // NOI18N
        jMenu21.setText("Matricula");
        jMenu21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Display 16x16.png"))); // NOI18N
        jMenuItem18.setText("Registrar Matricula");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem18);

        jMenuBar1.add(jMenu21);

        jMenu33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/SALIR.png"))); // NOI18N
        jMenu33.setText("Salir");
        jMenu33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCerrarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Erase.png"))); // NOI18N
        btnCerrarSecion.setText("Cerrar Sesion");
        btnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSecionActionPerformed(evt);
            }
        });
        jMenu33.add(btnCerrarSecion);

        jMenuBar1.add(jMenu33);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        
        
           Frm_Estudiante   X = new     Frm_Estudiante ();
      X.setVisible(true);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

        
Frm_Matricula  X = new      Frm_Matricula  ();
      X.setVisible(true);
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed



                
Frm_Grado   X = new    Frm_Grado ();
      X.setVisible(true);
        




        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void btnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSecionActionPerformed



  dispose();
         
       Login  X = new       Login ();
      X.setVisible(true);
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSecionActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

Frm_Asistencias X = new   Frm_Asistencias ();
      X.setVisible(true);



        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCerrarSecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
