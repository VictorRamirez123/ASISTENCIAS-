
package Controladores;


import java.sql.PreparedStatement;
import Modelo.dgrado;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ngrado{
  
    private conexion mysql=new conexion();
    
    private  Connection  cn= mysql.Connectar(); 
    
    private  String  sql;
    

    
    public DefaultTableModel mostrar (String buscar){
        
       DefaultTableModel modelo;
       
       String[] titulos = {"Codigo","Grado", "Nivel", "Descripcion" };
        
       String[] registros =new String [4];
                 
       
       modelo= new DefaultTableModel (null,titulos);
       
       sql= "SELECT  * from  grado where   nombre like '" + buscar + "%'";
       
       try {
       
       Statement st =cn.createStatement();
       
       ResultSet rs= st.executeQuery(sql);
       
           
           while  (rs.next ()) {
               
               registros [0]=rs.getString("idgrado");
               
                 registros [1]=rs.getString("nombre");
                 
          
                  
                   registros [2]=rs.getString("nivel");
               
                      registros [3]=rs.getString("descripcion");
                  
                 
                   
                   
                
                      
                     
                   
                 modelo.addRow(registros);
                 
                  }
           
           return  modelo;
           
           
            } catch (Exception e)  {
                
                
                JOptionPane.showConfirmDialog(null,e);
                
                return null;
                
            }
                 
                 
                 
    }
    
    
    
    public boolean insertar (dgrado v) {
    
    sql= " insert into grado (nombre,nivel,descripcion) values (?,?,?)";
    
    try {
        
        PreparedStatement pst = cn.prepareStatement(sql);
        
        pst.setString (1, v.getNombre());
          
          pst.setString (2, v.getNivel());
              pst.setString (3, v.getDescripcion());
              
        
          
        
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
         

    
  
    public boolean editar (dgrado  v) {
    
    sql="update grado set  nombre=?,nivel=?,descripcion=?  where idgrado=?";
    
    try {

        
        PreparedStatement pst= cn.prepareStatement(sql);
        
        
        //------ empieza  0  es codigo    1 el siguiente campo   sucesidamente
        
    pst.setString (1, v.getNombre());
          
          pst.setString (2, v.getNivel());
          
        pst.setString (3, v.getDescripcion());
                  
       
           
        pst.setInt (4, v.getIdgrado());
        
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
    
    
    
    
    public boolean eliminar (dgrado  v) {
    
    sql="delete from  grado where idgrado=?";
    
    try {

        
        PreparedStatement pst= cn.prepareStatement(sql);
        
          pst.setInt (1, v.getIdgrado());
        
   
        
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

