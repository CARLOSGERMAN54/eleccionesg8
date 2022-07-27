/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class ClsCandidato extends ClsPersona{
    public String ciudadOrigen;
    public String descripcion;
    public String mensajeCampania;
    public String partidoPolitico;
    public int estado;


    
    public ClsCandidato(String ciudadOrigen, String descripcion, String mensajeCampania, String partidoPolitico, int estado, String identificacion, String tipoIdentificacion, String nombres, String apellidos, String correo, String telefono, String direccion) {
        super(identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
        this.mensajeCampania = mensajeCampania;
        this.partidoPolitico = partidoPolitico;
        this.estado = estado;
    }
  
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    
    
    
    
}
