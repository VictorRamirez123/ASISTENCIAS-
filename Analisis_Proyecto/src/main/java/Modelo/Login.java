
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Login implements Serializable {
    
  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE) 
  private int nu;  
  private String usuario;
  private String contraseña;

    public Login(int nu, String usuario, String contraseña) {
        this.nu = nu;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Login() {
    }

   
    
    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

 
  
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  
  
  
  
}
