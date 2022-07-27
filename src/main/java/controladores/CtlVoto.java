/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.ClsResultado;
import clases.ClsVoto;
import modelos.MdlVoto;

/**
 *
 * @author HP
 */
public class CtlVoto {
    public MdlVoto mdlVoto;
    public CtlVoto() {
        this.mdlVoto = new MdlVoto();
    }
    public ClsResultado adicionarVoto(ClsVoto voto)
    {
        ClsResultado res = mdlVoto.adicionarVoto(voto);
        return res;
    }
    public boolean consultarSiVoto(String cedula,int idEleccion){
    
        return this.mdlVoto.consultarSiVoto(cedula, idEleccion);
    }
    public int obtenerCantidadVotos(int idInscripcion){
    
        return this.mdlVoto.obtenerCantidadVotos(idInscripcion);
    }
}
