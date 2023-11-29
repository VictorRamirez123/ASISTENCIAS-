
package Vistas;
import Modelo.Estudiantes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormDesignarEstudiante extends javax.swing.JInternalFrame {
DefaultTableModel modelo=new DefaultTableModel();
    int num=1;
    public FormDesignarEstudiante() {
        initComponents();
        modelo.addColumn("N");
        modelo.addColumn("Cod matricula");
        modelo.addColumn("Nombre completo");
        modelo.addColumn("Aula");
        modelo.addColumn("Dni");
        this.tblMostrar.setModel(modelo);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomApe = new javax.swing.JTextField();
        txtCodMatricula = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbAula = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Estudiante");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Designe Aula :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo de Matricula");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        txtNomApe.setBackground(new java.awt.Color(204, 204, 204));
        txtNomApe.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtNomApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 30));

        txtCodMatricula.setBackground(new java.awt.Color(204, 204, 204));
        txtCodMatricula.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtCodMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 30));

        txtDni.setBackground(new java.awt.Color(204, 204, 204));
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 30));

        cmbAula.setBackground(new java.awt.Color(204, 204, 204));
        cmbAula.setForeground(new java.awt.Color(0, 0, 0));
        cmbAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--" }));
        jPanel2.add(cmbAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres y Apellidos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        tblMostrar.setBackground(new java.awt.Color(255, 255, 255));
        tblMostrar.setForeground(new java.awt.Color(0, 0, 0));
        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMostrar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 410, 130));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(0, 255, 0));
        jButton3.setText("CREAR AULA");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DNI");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 350));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 180, 40));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String OpcionAula=JOptionPane.showInputDialog("ESCRIBA EL AULA Q DESEA AGREGAR",null);
   cmbAula.addItem(OpcionAula);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String[] info=new String[5];
        
        info[0]=Integer.toString(num);
        info[1]=txtCodMatricula.getText();
        info[2]=txtNomApe.getText();
        info[3]=cmbAula.getSelectedItem().toString();
        info[4]=txtDni.getText();
        
        modelo.addRow(info);
        
        num++;
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbAula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtCodMatricula;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNomApe;
    // End of variables declaration//GEN-END:variables
}
