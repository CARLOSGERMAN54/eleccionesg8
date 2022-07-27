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
public class ClsVoto {
    public int idVoto;
    public int idInscripcion;
    public Date fechaVoto;
    public int estado;
    public String idVotante;

    public ClsVoto(int idVoto, int idInscripcion, Date fechaVoto, int estado, String idVotante) {
        this.idVoto = idVoto;
        this.idInscripcion = idInscripcion;
        this.fechaVoto = fechaVoto;
        this.estado = estado;
        this.idVotante = idVotante;
    }

    public int getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(int idVoto) {
        this.idVoto = idVoto;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Date getFechaVoto() {
        return fechaVoto;
    }

    public void setFechaVoto(Date fechaVoto) {
        this.fechaVoto = fechaVoto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getIdVotante() {
        return idVotante;
    }

    public void setIdVotante(String idVotante) {
        this.idVotante = idVotante;
    }
    
    
}

