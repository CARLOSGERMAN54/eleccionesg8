/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ClsResultado {
    public final static String OK = "OK";
    public final static String ERROR = "ERROR";
    public final static String ADVERTENCIA = "ADVERTENCIA";

    private String tipo;
    private String texto;

    public ClsResultado(String tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void mostrarMensaje() {

        JOptionPane.showMessageDialog(null, this.getTexto());

    }
}
