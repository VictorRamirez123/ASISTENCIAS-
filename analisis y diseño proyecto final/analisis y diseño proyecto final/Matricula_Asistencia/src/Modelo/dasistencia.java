//
package Modelo;


public class dasistencia {

  
    
 private int idasistencia;
private  String estudiante;
private  String grado;

private String tarde;
private String falto;
private String justificado;
private String f_asistencia;
private String cod_usuario;

public  dasistencia() {
    
    
}
  public dasistencia(int idasistencia, String estudiante, String grado, String tarde, String falto, String justificado, String f_asistencia, String cod_usuario) {
        this.idasistencia = idasistencia;
        this.estudiante = estudiante;
        this.grado = grado;
        this.tarde = tarde;
        this.falto = falto;
        this.justificado = justificado;
        this.f_asistencia = f_asistencia;
        this.cod_usuario = cod_usuario;
    }

    public int getIdasistencia() {
        return idasistencia;
    }

    public void setIdasistencia(int idasistencia) {
        this.idasistencia = idasistencia;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTarde() {
        return tarde;
    }

    public void setTarde(String tarde) {
        this.tarde = tarde;
    }

    public String getFalto() {
        return falto;
    }

    public void setFalto(String falto) {
        this.falto = falto;
    }

    public String getJustificado() {
        return justificado;
    }

    public void setJustificado(String justificado) {
        this.justificado = justificado;
    }

    public String getF_asistencia() {
        return f_asistencia;
    }

    public void setF_asistencia(String f_asistencia) {
        this.f_asistencia = f_asistencia;
    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }
  
  
  
  
  
  
  
  

}
