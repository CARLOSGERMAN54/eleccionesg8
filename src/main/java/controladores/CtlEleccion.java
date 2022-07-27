/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.ClsEleccion;
import clases.ClsResultado;
import clases.ClsValidacion;
import java.util.LinkedList;
import modelos.MdlEleccion;

/**
 *
 * @author HP
 */
public class CtlEleccion {
    public MdlEleccion mdlEleccion; 
    public ClsResultado resultado;
    public ClsValidacion validacion;

    public CtlEleccion() {
        this.mdlEleccion = new MdlEleccion();
        this.validacion = new ClsValidacion();
    }
    
    public ClsResultado adicionarEleccion(ClsEleccion eleccion)
    {
        ClsResultado res = mdlEleccion.adicionarEleccion(eleccion);
        return res;
    }
    public LinkedList<ClsEleccion> ObtenerElecciones() {

        LinkedList<ClsEleccion> listaCandidatos = this.mdlEleccion.obtenerElecciones();
        return listaCandidatos;
    }
    
}
