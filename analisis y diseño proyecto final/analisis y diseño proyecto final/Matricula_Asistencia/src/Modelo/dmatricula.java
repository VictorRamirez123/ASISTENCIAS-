
package Modelo;

public class dmatricula {
 
private int id;
private  String estudiante;
private String periodo;
private  String  grado;
private String estado;

public dmatricula (){}

    public dmatricula(int id, String estudiante, String periodo, String grado, String estado) {
        this.id = id;
        this.estudiante = estudiante;
        this.periodo = periodo;
        this.grado = grado;
        this.estado = estado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}

