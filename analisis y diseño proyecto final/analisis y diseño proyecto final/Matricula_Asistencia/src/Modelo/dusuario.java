
package Modelo;


public class dusuario {
    

private int idusuario;
private  String usuario;
private  String contraseña;

private String cargos;

private String personal;
private  String direccion;

private String telefono;


private String estado;

public dusuario (){

}

    public dusuario(int idusuario, String usuario, String contraseña, String cargos, String personal, String direccion, String telefono,  String estado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargos = cargos;
        this.personal = personal;
        this.direccion = direccion;
        this.telefono = telefono;
    
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }





}

