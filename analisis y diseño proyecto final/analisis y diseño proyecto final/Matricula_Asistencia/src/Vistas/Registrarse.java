
package Vistas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import Controladores.conexion;
import Controladores.nusuario;
import Modelo.dusuario;

public class Registrarse extends javax.swing.JFrame {

 
    public Registrarse() {
        initComponents();
                       this.setLocationRelativeTo(null);
        mostrar("");
        
          btnguardar.setEnabled(true);
            jButton4.setEnabled(false);
             jButton5.setEnabled(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtpersonal = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 690, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevo_1.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 40));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Grabar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/modificcar_4.png"))); // NOI18N
        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Delete.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Exit.png"))); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 620, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jLabel4.setText("Estado");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 60, -1));

        jLabel3.setText("Cargo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel6.setText("Usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, -1));

        jLabel7.setText("Contraseña");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, -1));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        txtpersonal.setBackground(new java.awt.Color(255, 255, 255));
        txtpersonal.setForeground(new java.awt.Color(0, 0, 0));
        txtpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpersonalActionPerformed(evt);
            }
        });
        txtpersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpersonalKeyTyped(evt);
            }
        });
        jPanel2.add(txtpersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, -1));

        txtcargo.setBackground(new java.awt.Color(255, 255, 255));
        txtcargo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, -1));

        jLabel5.setText("Personal");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        txtestado.setBackground(new java.awt.Color(255, 255, 255));
        txtestado.setForeground(new java.awt.Color(0, 0, 0));
        txtestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtestadoKeyTyped(evt);
            }
        });
        jPanel2.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 220, -1));

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtcodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));

        jLabel9.setText("Direccion");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, -1));

        jLabel10.setText("Telefono");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 60, -1));

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 220, -1));

        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        txttelefono.setForeground(new java.awt.Color(0, 0, 0));
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 630, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrate");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoMouseClicked

        int fila =listado.rowAtPoint(evt.getPoint());

        txtcodigo.setText(listado.getValueAt(fila,0).toString());
        txtusuario.setText(listado.getValueAt(fila,1).toString());
        txtcontraseña.setText(listado.getValueAt(fila,2).toString());
        txtcargo.setText(listado.getValueAt(fila,3).toString());

        txtpersonal.setText(listado.getValueAt(fila,4).toString());
        txtdireccion.setText(listado.getValueAt(fila,5).toString());
        txttelefono.setText(listado.getValueAt(fila,6).toString());
        txtestado.setText(listado.getValueAt(fila,7).toString());

        btnguardar.setEnabled(false);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);

        
    }//GEN-LAST:event_listadoMouseClicked
void mostrar (String buscar){
            
        
        try  {
        
            DefaultTableModel modelo;
            nusuario f = new nusuario();
            
            modelo = f.mostrar (buscar);
            

            listado.setModel(modelo);
            
             }catch(Exception e){
               
    JOptionPane.showMessageDialog(rootPane,e);
       
           }
           
      }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JOptionPane.showMessageDialog(this, "Ingrese los Datos","Aviso",JOptionPane.INFORMATION_MESSAGE);

        this.txtcodigo.setText("");
        this.txtcontraseña.setText("");
        this.txtcargo.setText("");
        this.txtpersonal.setText("");
        txtestado.setText("");
        this.txtusuario.setText("");
        this.txtdireccion.setText("");
        this.txttelefono.setText("");
    

        mostrar("");
        btnguardar.setEnabled(true);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(txtcontraseña.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Contraseña","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else if (txtcargo.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Cargo","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else if (txtpersonal.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Persona","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else if (txttelefono.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Telefono","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else if (txtusuario.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Usuario","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else if (txtestado.getText().isEmpty())

        {
            JOptionPane.showMessageDialog(this, "Ingrese Estado","Aviso",JOptionPane.ERROR_MESSAGE);

        }

        else  {

            dusuario  v = new  dusuario();

            nusuario  f = new nusuario ();

            v.setUsuario(txtusuario.getText());
            v.setContraseña(txtcontraseña.getText());
            v.setCargos(txtcargo.getText());

            v.setPersonal(txtpersonal.getText());

            v.setDireccion(txtdireccion.getText());

            v.setTelefono(txttelefono.getText());

            v.setEstado(txtestado.getText());

            f.insertar(v);

            JOptionPane.showMessageDialog(this, "Asido Guardado los Datos","Aviso",JOptionPane.INFORMATION_MESSAGE);

            mostrar("");

            this.txtcodigo.setText("");
            this.txtcontraseña.setText("");
            this.txtcargo.setText("");
            this.txtpersonal.setText("");
            this.txtusuario.setText("");
            this.txtestado.setText("");

            this.txtdireccion.setText("");
            this.txttelefono.setText("");

            btnguardar.setEnabled(true);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dusuario v = new  dusuario();

        nusuario f = new nusuario ();

        v.setIdusuario(Integer.parseInt(txtcodigo.getText()));

        v.setUsuario(txtusuario.getText());

        v.setContraseña(txtcontraseña.getText());
        v.setCargos(txtcargo.getText());

        v.setPersonal(txtpersonal.getText());

        v.setDireccion(txtdireccion.getText());

        v.setTelefono(txttelefono.getText());

        v.setEstado(txtestado.getText());

        ///

        f.editar(v);

        JOptionPane.showMessageDialog(this, "Asido Modificado los Datos","Aviso",JOptionPane.INFORMATION_MESSAGE);

        mostrar("");
        this.txtdireccion.setText("");
        this.txttelefono.setText("");
        this.txtcodigo.setText("");
        this.txtcontraseña.setText("");
        this.txtcargo.setText("");
        this.txtpersonal.setText("");
        this.txtusuario.setText("");
        this.txtestado.setText("");
        btnguardar.setEnabled(true);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!txtcodigo.getText().equals("")){

            int con=  JOptionPane.showConfirmDialog(rootPane, "Asido Eliminado los Dato");

            if (con ==0 ){

                dusuario  v = new dusuario  ();
                nusuario  f=  new nusuario ();

                v.setIdusuario(Integer.parseInt(txtcodigo.getText()));

                f.eliminar(v);

                mostrar("");
                this.txtdireccion.setText("");
                this.txttelefono.setText("");
                this.txtcodigo.setText("");
                this.txtcontraseña.setText("");
                this.txtcargo.setText("");
                this.txtpersonal.setText("");
                this.txtestado.setText("");
                this.txtusuario.setText("");
                btnguardar.setEnabled(true);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);

            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Login L =new Login();
        this.dispose();
        L.setVisible(true);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpersonalActionPerformed

    private void txtpersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpersonalKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_txtpersonalKeyTyped

    private void txtestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped

        char c =evt.getKeyChar();

        if(c<'0' || c> '9' ) evt.consume();

        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtpersonal;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
