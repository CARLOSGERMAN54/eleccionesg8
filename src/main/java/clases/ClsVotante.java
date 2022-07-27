/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author HP
 */
public class ClsVotante extends ClsPersona{
    public String direccionVotacion;
    public String mesaVotacion;
    public int estadoVotacion;

    public ClsVotante(String direccionVotacion, String mesaVotacion, int estadoVotacion, String identificacion, String tipoIdentificacion, String nombres, String apellidos, String correo, String telefono, String direccion) {
        super(identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
        this.direccionVotacion = direccionVotacion;
        this.mesaVotacion = mesaVotacion;
        this.estadoVotacion = estadoVotacion;
    }

    public int getEstadoVotacion() {
        return estadoVotacion;
    }

    public void setEstadoVotacion(int estadoVotacion) {
        this.estadoVotacion = estadoVotacion;
    }

    public String getDireccionVotacion() {
        return direccionVotacion;
    }

    public void setDireccionVotacion(String direccionVotacion) {
        this.direccionVotacion = direccionVotacion;
    }

    public String getMesaVotacion() {
        return mesaVotacion;
    }

    public void setMesaVotacion(String mesaVotacion) {
        this.mesaVotacion = mesaVotacion;
    }


    
    
}
