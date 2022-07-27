/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class ClsPropuesta {
    public String id_propuesta;
    public String tituloPropuesta;
    public String Descripcion;

    public ClsPropuesta(String id_propuesta, String tituloPropuesta, String Descripcion) {
        this.id_propuesta = id_propuesta;
        this.tituloPropuesta = tituloPropuesta;
        this.Descripcion = Descripcion;
    }

    public String getId_propuesta() {
        return id_propuesta;
    }

    public void setId_propuesta(String id_propuesta) {
        this.id_propuesta = id_propuesta;
    }

    public String getTituloPropuesta() {
        return tituloPropuesta;
    }

    public void setTituloPropuesta(String tituloPropuesta) {
        this.tituloPropuesta = tituloPropuesta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
