/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import clases.ClsCandidato;
import clases.ClsResultado;
import clases.ClsVotante;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class MdlVotante {
   public ClsResultado resultado;
   public Conexion con;

    public MdlVotante() {
        this.con= new Conexion();
    }
   
   public ClsResultado adicionarVotante(ClsVotante votante)
    {
        PreparedStatement ps = null;
        try
        {         
            String sql = "insert into votantes(id_votante, tipo_documento, nombres,"
                    + "apellidos,telefono,correo, direccion_votacion, "
                    + "mesa_votacion,estado_votacion,direccion) values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.conectar().prepareStatement(sql);
            ps.setString(1, votante.identificacion);
            ps.setString(2, votante.tipoIdentificacion);
            ps.setString(3, votante.nombres);
            ps.setString(4, votante.apellidos);
            ps.setString(5, votante.telefono);
            ps.setString(6, votante.correo);
            ps.setString(7, votante.direccionVotacion);
            ps.setString(8, votante.mesaVotacion);
            ps.setInt(9, votante.estadoVotacion);
            ps.setString(10, votante.direccion);  
            int res = ps.executeUpdate();
            if(res>=1)
            {
                this.resultado = new ClsResultado(ClsResultado.OK,"El votante ha sido almacenado con éxito");
            }
            else if(res ==0)
            {
                this.resultado = new ClsResultado(ClsResultado.ADVERTENCIA,"El votante no fue posible registrarse, Intentalo nuevamente");
            }
            else
            {
                this.resultado = new ClsResultado(ClsResultado.ERROR,"Hubo un problema en el proceso de Registro");
            }
        }
        catch(Exception ex)
        {
            this.resultado = new ClsResultado(ClsResultado.ERROR,ex.getMessage());
        }
        return this.resultado;  
    }
   
   
    public LinkedList<ClsVotante> ObtenerVotantes() {
        try {
            LinkedList<ClsVotante> lista = new LinkedList<>();
            String consulta = "SELECT * FROM votantes";
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                String identificacion = resultados.getString("id_votante");
                String tipoIdentificacion = resultados.getString("tipo_documento");
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccionVotacion = resultados.getString("direccion_votacion");
                String mesaVotacion = resultados.getString("mesa_votacion");
                String direccion = resultados.getString("direccion");
                int estado = 1;
               
                ClsVotante votante = new ClsVotante(direccionVotacion, mesaVotacion, estado, identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
                lista.add(votante);
            }

            return lista;

        } catch (Exception e) {

            return null;
        }

    }
    public ClsResultado eliminarvotante(String id) {
        ClsResultado mensaje;
        try {
            String sql = "DELETE FROM votantes WHERE id_votante = ?";
             PreparedStatement sentencia = this.con.conectar().prepareStatement(sql);
            sentencia.setString(1, id);

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsResultado(ClsResultado.OK, "Se ha  eliminado un votante exitosamente");
                return mensaje;
            }
            mensaje = new ClsResultado(ClsResultado.ERROR, "Ocurrió un error");
            return mensaje;
        } catch (Exception excepcion) {
            mensaje = new ClsResultado(ClsResultado.ERROR, "Error: " + excepcion.getMessage());
            return mensaje;
        }
    }
    
    public ClsResultado actualizarVotante(ClsVotante votante) {
        ClsResultado mensaje;
        try {
            String sql = "UPDATE votantes SET nombres = ?,apellidos = ?, telefono = ?, correo = ?, " +
                    " direccion_votacion = ?, mesa_votacion = ?, estado_votacion = ? ," +
                    " tipo_documento=?,direccion=? WHERE id_votante = ?";
            
            PreparedStatement sentencia = this.con.conectar().prepareStatement(sql);
            sentencia.setString(1, votante.getNombres());
            sentencia.setString(2, votante.getApellidos());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
            sentencia.setString(5, votante.getDireccionVotacion());
            sentencia.setString(6, votante.getMesaVotacion());
            sentencia.setInt(7, 1);
            sentencia.setString(8, votante.getTipoIdentificacion());
            sentencia.setString(9, votante.getDireccion());
            sentencia.setString(10, votante.getIdentificacion());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1)
            {
                mensaje = new ClsResultado(ClsResultado.OK, "Has actualizado el votante exitosamente");
                return mensaje;
            }
            mensaje = new ClsResultado(ClsResultado.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsResultado(ClsResultado.ERROR, "Uy ocurrió un error: " + excepcion.getMessage());
            return mensaje;
        }

    }
    
   
       public ClsVotante buscarVotante(String cedula){
        try{
            
            String consulta = "SELECT * FROM votantes where id_votante = '"+cedula+"'" ;
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next())
            {
                String identificacion = resultados.getString("id_votante");
                String tipoIdentificacion = resultados.getString("tipo_documento");
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccionVotacion = resultados.getString("direccion_votacion");
                String mesaVotacion = resultados.getString("mesa_votacion");
                String direccion = resultados.getString("direccion");
                int estado = resultados.getInt("estado_votacion");
                ClsVotante votante = new ClsVotante(direccionVotacion, mesaVotacion, estado, identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
                return votante;
            }
            else
            {
                return null;
            }

        } catch (Exception e) {

            return null;
        }


    }
    
    
    public static void main(String[] args) {
        MdlVotante vo = new MdlVotante();
        System.out.println(vo.ObtenerVotantes().get(0).nombres);
    }
}
