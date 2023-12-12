
package Modelo;

public class dalumno{
private int idcliente;
private  String cedula;
private  String nombres;
private  String apellidos;
private String fecha;
private String lugar;
private String madre;
private String padre;
private String direccion;
private String documento;

public dalumno (){}

public dalumno(int idcliente,String cedula, String nombres,String apellidos,String fecha,String Direccion,String madre,String padre,String lugar,String  documento)  {
this.idcliente= idcliente;
this.cedula=cedula;
this.nombres = nombres;
this.apellidos = apellidos;
this.direccion = direccion;
this.lugar=lugar;
this.fecha=fecha;
this.madre=madre;
this.padre=padre;
this.documento=documento;

}

public int  getid_codigo ()  {return idcliente;}

public void setid_codigo(int idcliente)  { this.idcliente = idcliente;}

public String  getcedula()  { return cedula;}

public void setcedula(String cedula)  {this.cedula=cedula;}

public String  getnombres()  { return nombres;}

public void setnombres(String nombres)  { this.nombres =nombres;}

public String  getapellidos ()  { return apellidos;}

public void setapellidos(String apellidos)  { this.apellidos = apellidos;}


public String  getfecha()  {return fecha;}

public void setfecha(String fecha)  {this.fecha= fecha;}

public String  getdireccion ()  {return direccion;}

public void setdireccion(String direccion)  {this.direccion = direccion;}

public String  getlugar ()  { return lugar;}

public void setlugar(String lugar)  {this.lugar= lugar; }

public String  getmadre ()  { return madre;}

public void setmadre(String madre)  { this.madre= madre;}

public String  getpadre ()  {return padre;}

public void setpadre(String padre)  {this.padre= padre; }

public String  getdocumento ()  { return documento;}

public void setdocumento(String documento)  {this.documento=documento;}









}

