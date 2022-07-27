/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import clases.ClsResultado;
import clases.ClsVotante;
import modelos.MdlVotante;
import clases.ClsValidacion;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class CtlVotante {
    public MdlVotante mdlVotante; 
    public ClsResultado resultado;
    public ClsValidacion validacion;
    public CtlVotante() {
        this.mdlVotante = new MdlVotante();
        this.validacion = new ClsValidacion();
    }

    public ClsResultado adicionarVotante(ClsVotante votante)
    {
        if(this.validacion.validarCorreo(votante.correo))
        {
            if(this.validacion.validarNombresPersonas(votante.nombres) && this.validacion.validarNombresPersonas(votante.apellidos))
            {
                this.resultado = mdlVotante.adicionarVotante(votante);
            }
            else
            {
                this.resultado = new ClsResultado(ClsResultado.ERROR, "Los Nombres y apellidos solo deben contener caracteres alfabéticos");
            }    
        }
        else
        {
            this.resultado = new ClsResultado(ClsResultado.ERROR, "Correo Inválido");
        }
        return resultado;
    }
    public LinkedList<ClsVotante> ObtenerVotantes() {

        LinkedList<ClsVotante> listaVotantes = this.mdlVotante.ObtenerVotantes();
        return listaVotantes;
    }
    public ClsResultado eliminarVotante(String id) {

        ClsResultado mensaje = this.mdlVotante.eliminarvotante(id);

        return mensaje;
    }
    public ClsResultado actualizarVotante(ClsVotante votante) {

        ClsResultado mensaje = this.mdlVotante.actualizarVotante(votante);

        return mensaje;
    }
    
    public ClsVotante buscarVotante(String cedula) {

        ClsVotante  votante = this.mdlVotante.buscarVotante(cedula);

        return votante;
    }
    
    public static void main(String[] args) {
        CtlVotante vo = new CtlVotante();
        System.out.println("holaaa"+vo.ObtenerVotantes());
    }
}
