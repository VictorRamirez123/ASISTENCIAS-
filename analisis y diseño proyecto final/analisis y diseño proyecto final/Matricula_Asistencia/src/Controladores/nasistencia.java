
package Controladores;

import java.sql.PreparedStatement;
import Modelo.dasistencia;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nasistencia {
  
    private conexion mysql=new conexion();
    
    private  Connection  cn= mysql.Connectar(); 
    
    private  String  sql;
    
    ///************************----------------------------------------
    
    public DefaultTableModel mostrar (String buscar){
        
       DefaultTableModel modelo;
       
       String[] titulos = {"Numero" ,"Codigo", "Dni","Nombres","Apellidos","N","Grado","Nivel","Tarde" ,"Falto","Justificado","Fecha Asistencia" };
        
       String[] registros =new String [12];
                 
       
       modelo= new DefaultTableModel (null,titulos);
       
       sql= "SELECT asistencia.idasistencia,estudiante.idEstudiante, estudiante.identificacion, estudiante.Nombres, estudiante.Apellidos,grado.idgrado, grado.nombre AS grado, grado.nivel, Asistencia.Tarde, Asistencia.Falto, Asistencia.Justificado, Asistencia.F_Asistencia FROM estudiante INNER JOIN Asistencia ON estudiante.idEstudiante = Asistencia.idestudiante INNER JOIN grado ON Asistencia.idgrado = grado.idgrado  where  estudiante.apellidos like '" + buscar + "%'";
       
       try {
       
       Statement st =cn.createStatement();
       
       ResultSet rs= st.executeQuery(sql);
       
           
           while  (rs.next ()) {
               
                registros [0]=rs.getString("idasistencia");
                
               registros [1]=rs.getString("idEstudiante");
               
                 registros [2]=rs.getString("identificacion");
                 
                  registros [3]=rs.getString("Nombres");
                  
                   registros [4]=rs.getString("Apellidos");
               
                      registros [5]=rs.getString("idgrado");
                  
                   registros [6]=rs.getString("grado");
                   
                    registros [7]=rs.getString("nivel");
                  
                   registros [8]=rs.getString("tarde");
                   
                   
                      registros [9]=rs.getString("Falto");
                  
                   registros [10]=rs.getString("Justificado");
                   
                   registros [11]=rs.getString("F_Asistencia");
                   
                   
                 modelo.addRow(registros);
                 
                  }
           
           return  modelo;
           
           
            } catch (Exception e)  {
                
                
                JOptionPane.showConfirmDialog(null,e);
                
                return null;
                
            }
                 
                 
                 
    }
    
    
    
    public boolean insertar (dasistencia v) {
    
    sql= " insert into asistencia (idestudiante,idgrado,tarde,falto,justificado,f_asistencia,cod_usuario) values (?,?,?,?,?,?,?)";
    
    try {
        
        PreparedStatement pst = cn.prepareStatement(sql);
         
        pst.setString (1, v.getEstudiante());
          
          pst.setString (2, v.getGrado());
              pst.setString (3, v.getTarde());
              
                  pst.setString (4, v.getFalto());
                  
                  
          pst.setString (5, v.getJustificado());
            
       
           
          pst.setString (6, v.getF_asistencia());
          
            pst.setString (7, v.getCod_usuario());
          
        
        int n = pst.executeUpdate ();        
        if (n != 0) {       
        return  true ;        
         } else {   
        return  false ;      
      }
  } catch (Exception e)  {

JOptionPane.showMessageDialog(null,e);

      return false;

          } 
       
        
      }   
         

    
  
    public boolean editar (dasistencia v) {
    
    sql="update asistencia set  idestudiante=?,idgrado=?,tarde=?,falto=?,justificado=?,f_asistencia=? where idasistencia=?";
    
    try {

        
        PreparedStatement pst= cn.prepareStatement(sql);
        
        
   
        pst.setString (1, v.getEstudiante());
          
          pst.setString (2, v.getGrado());
              pst.setString (3, v.getTarde());
              
                  pst.setString (4, v.getFalto());
                  
                  
          pst.setString (5, v.getJustificado());
            
       
           
          pst.setString (6, v.getF_asistencia());
          
           
         pst.setInt (7, v.getIdasistencia());
        
         int n= pst.executeUpdate ();
        
        if (n != 0) {
        
        return  true ;
        
         } else {
    
        return  false ;
    
    
}
         
         } catch (Exception e)  {

JOptionPane.showMessageDialog(null,e);

return false;



 
    } 
       
        
      }     
    
    
    
    
    public boolean eliminar (dasistencia  v) {
    
    sql="delete from  asistencia  where idasistencia=?";
    
    try {

        
        PreparedStatement pst= cn.prepareStatement(sql);
        
          pst.setInt (1, v.getIdasistencia());
        
   
        
         int n= pst.executeUpdate ();
        
        if (n != 0) {
        
        return  true ;
        
         } else {
    
        return  false ;
    
    
}
         
         } catch (Exception e)  {

JOptionPane.showMessageDialog(null,e);

return false;



 
    } 
       
        
      }     
    
    
    
    
    
    

}

