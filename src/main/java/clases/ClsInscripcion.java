/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author HP
 */
public class ClsInscripcion {
    public int idInscripcion;
    public int idEleccion;
    public String idCandidato;
    public Date fechaInscripcion;
    public int estado;

    public ClsInscripcion(int idInscripcion, int idEleccion, String idCandidato, Date fechaInscripcion, int estado) {
        this.idInscripcion = idInscripcion;
        this.idEleccion = idEleccion;
        this.idCandidato = idCandidato;
        this.fechaInscripcion = fechaInscripcion;
        this.estado = estado;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(int idEleccion) {
        this.idEleccion = idEleccion;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
