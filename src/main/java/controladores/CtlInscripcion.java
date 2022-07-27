/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import clases.ClsInscripcion;
import clases.ClsResultado;
import modelos.MdlInscripcion;

/**
 *
 * @author HP
 */
public class CtlInscripcion {
    public MdlInscripcion inscripcion;
    public CtlInscripcion() {
        this.inscripcion = new MdlInscripcion();
    }
    
    
    public ClsResultado adicionarCandidato(ClsInscripcion inscripcion)
    {
        ClsResultado res = this.inscripcion.adicionarInscripcion(inscripcion);
        return res;
    }
    
    public ClsInscripcion buscarInscrito(String cedula,int idEleccion)
    {
        ClsInscripcion ins = this.inscripcion.buscarInscrito(cedula, idEleccion);
        return ins;
    }
    
}
