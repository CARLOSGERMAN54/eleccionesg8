/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class ClsCanXEle {
    public int idInscripcion;
    public String  nombres;
    public String  apellidos;
    public String partidoPolitico;
    public String mensajeCampania;
    public int estadoInscripcion;

    public ClsCanXEle(int idInscripcion, String nombres, String apellidos, String partidoPolitico, String mensajeCampania, int estadoInscripcion) {
        this.idInscripcion = idInscripcion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.partidoPolitico = partidoPolitico;
        this.mensajeCampania = mensajeCampania;
        this.estadoInscripcion = estadoInscripcion;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public int getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(int estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }
    
    
}
