
package Controladores;

import java.sql.PreparedStatement;
import Modelo.dalumno;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nalumno {
  
    private conexion mysql=new conexion();
    
    private  Connection  cn= mysql.Connectar(); 
    
    private  String  sql;
    
    
    public DefaultTableModel mostrar (String buscar){
        
       DefaultTableModel modelo;
       
       String[] titulos = {"Codigo" , "Identificacion","Nombres","Apellidos","Fecha Nacimiento","Lugar de Nacimiento","Madre","Padre" ,"Domicilio","Documentos Presentados" };
        
       String[] registros =new String [10];
                 
       
       modelo= new DefaultTableModel (null,titulos);
       
       sql= "select  * from estudiante where   nombres  like '" + buscar + "%'";
       
       try {
       
       Statement st =cn.createStatement();
       
       ResultSet rs= st.executeQuery(sql);
       
           
           while  (rs.next ()) {
               
               registros [0]=rs.getString("idEstudiante");
               
                 registros [1]=rs.getString("identificacion");
                 
                  registros [2]=rs.getString("Nombres");
                  
                   registros [3]=rs.getString("Apellidos");
               
                      registros [4]=rs.getString("fecha_nacimiento");
                  
                   registros [5]=rs.getString("Lugar_de_nacimiento");
                   
                    registros [6]=rs.getString("Madre");
                  
                   registros [7]=rs.getString("Padre");
                   
                   
                      registros [8]=rs.getString("Domicilio");
                  
                   registros [9]=rs.getString("Documento_Presentados");
                   
                   
                   
                 modelo.addRow(registros);
                 
                  }
           
           return  modelo;
           
           
            } catch (Exception e)  {
                
                
                JOptionPane.showConfirmDialog(null,e);
                
                return null;
                
            }
                 
                 
                 
    }
    
    
    
    public boolean insertar (dalumno v) {
    
    sql= " insert into estudiante (identificacion,nombres,apellidos,fecha_nacimiento,lugar_de_nacimiento,madre,padre,domicilio,documento_presentados) values (?,?,?,?,?,?,?,?,?)";
    
    try {
        
        PreparedStatement pst = cn.prepareStatement(sql);
         
        pst.setString (1, v.getcedula());
          
          pst.setString (2, v.getnombres());
              pst.setString (3, v.getapellidos());
              
                  pst.setString (4, v.getfecha());
                  
                  
          pst.setString (5, v.getlugar());
            
           pst.setString (6, v.getmadre());
           
          pst.setString (7, v.getpadre());
          
           pst.setString (8, v.getdireccion());
           
          pst.setString (9, v.getdocumento());
          
        
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
         

    
  
    public boolean editar (dalumno  v) {
    
    sql="update estudiante set  identificacion=? ,nombres=?, apellidos=? ,fecha_nacimiento=?,lugar_de_nacimiento=?, madre=? ,padre=?,domicilio=?,documento_presentados=? where idestudiante=?";
    
    try {

        
        PreparedStatement pst= cn.prepareStatement(sql);
        
        
        //------ empieza  0  es codigo    1 el siguiente campo   sucesidamente
        
         pst.setString (1, v.getcedula());
          
          pst.setString (2, v.getnombres());
              pst.setString (3, v.getapellidos());
              
                  pst.setString (4, v.getfecha());
                  
                  
          pst.setString (5, v.getlugar());
            
           pst.setString (6, v.getmadre());
           
          pst.setString (7, v.getpadre());
          
           pst.setString (8, v.getdireccion());
           
          pst.setString (9, v.getdocumento());
                  
          //----- valor   6 campos
           
        pst.setInt (10, v.getid_codigo());
        
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
    
    
    
    
    public boolean eliminar (dalumno  v) {
    
    sql="delete from  estudiante  where idestudiante=?";
    try {
        PreparedStatement pst= cn.prepareStatement(sql);
          pst.setInt (1, v.getid_codigo());
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
