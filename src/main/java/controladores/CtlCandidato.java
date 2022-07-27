/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.ClsCanXEle;
import clases.ClsCandidato;
import clases.ClsResultado;
import java.util.LinkedList;
import modelos.MdlCandidato;

/**
 *
 * @author HP
 */
public class CtlCandidato {
    public ClsCandidato candidato;
    public ClsResultado resultado;
    public MdlCandidato mdlCandidato;

    public CtlCandidato() {
        mdlCandidato = new MdlCandidato();
    }

    public ClsResultado adicionarCandidato(ClsCandidato candidato)
    {
        ClsResultado res = mdlCandidato.adicionarCandidato(candidato);
        return res;
    }
    public LinkedList<ClsCandidato> ObtenerCandidatos() {

        LinkedList<ClsCandidato> listaCandidatos = this.mdlCandidato.ObtenerCandidatos();
        return listaCandidatos;
    }
    public ClsResultado eliminarCandidato(String id) {

        ClsResultado mensaje = this.mdlCandidato.eliminarCandidato(id);

        return mensaje;
    }
    public ClsResultado actualizarCandidato(ClsCandidato candidato) {

        ClsResultado mensaje = this.mdlCandidato.actualizarCandidato(candidato);

        return mensaje;
    }
    
    public ClsCandidato buscarCandidato(String cedula) {
        
        ClsCandidato can = this.mdlCandidato.buscarCandidato(cedula);

        return can;
    }
    
    public LinkedList<ClsCanXEle> obtenerCandidatosPorEleccion(int idEleccion) {
        
       LinkedList<ClsCanXEle> can = this.mdlCandidato.obtenerCandidatosPorEleccion(idEleccion);

        return can;
    }
}
//