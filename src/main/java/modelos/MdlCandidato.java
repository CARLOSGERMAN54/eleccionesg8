/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import clases.ClsCanXEle;
import clases.ClsCandidato;
import clases.ClsResultado;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class MdlCandidato{
    public ClsResultado resultado;
    public Conexion con;

    public MdlCandidato() {
        this.con= new Conexion();
    }

    
        public LinkedList<ClsCanXEle> obtenerCandidatosPorEleccion(int idEleccion) {

        try {
            LinkedList<ClsCanXEle> lista = new LinkedList<>();
            String consulta = "select ins.id_inscripcion,can.nombres,can.apellidos,can.partido_politico, can.mensaje_campania,ins.estado"
                    + " from elecciones ele inner join inscripciones ins"
                    + " on ele.id_eleccion = ins.id_eleccion inner join candidatos"
                    + " can on ins.id_candidato = can.id_candidato where ins.id_eleccion = "+idEleccion+"";
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {

                int idInscripcion = resultados.getInt("id_inscripcion");
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String partidoPolitico = resultados.getString("partido_politico");
                String mensajeCampania = resultados.getString("mensaje_campania");
                int estado = resultados.getInt("estado");
                ClsCanXEle rep = new ClsCanXEle(idInscripcion, nombres, apellidos, partidoPolitico, mensajeCampania, estado);    
                lista.add(rep);
            }

            return lista;

        } catch (Exception e) {

            return null;
        }

    }
    
    
    public ClsResultado adicionarCandidato(ClsCandidato candidato)
    {
        PreparedStatement ps = null;
        try
        {         
            String sql = "insert into candidatos(id_candidato, tipo_documento, nombres,"
                    + "apellidos,partido_politico,ciudad_origen, descripcion, "
                    + "mensaje_campania,estado,correo,telefono,direccion) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.conectar().prepareStatement(sql);
            ps.setString(1, candidato.identificacion);
            ps.setString(2, candidato.tipoIdentificacion);
            ps.setString(3, candidato.nombres);
            ps.setString(4, candidato.apellidos);
            ps.setString(5, candidato.partidoPolitico);
            ps.setString(6, candidato.ciudadOrigen);
            ps.setString(7, candidato.descripcion);
            ps.setString(8, candidato.mensajeCampania);
            ps.setInt(9, candidato.estado);
            ps.setString(10, candidato.correo);
            ps.setString(11, candidato.telefono);
            ps.setString(12, candidato.direccion);
            
           
            int res = ps.executeUpdate();
            if(res>=1)
            {
                this.resultado = new ClsResultado(ClsResultado.OK,"El Candidato ha sido almacenado con éxito");
            }
            else if(res ==0)
            {
                this.resultado = new ClsResultado(ClsResultado.ADVERTENCIA,"El Candidato no fue posible registrarse, Intentalo nuevamente");
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
    
    public LinkedList<ClsCandidato> ObtenerCandidatos() {

        try {
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            String consulta = "SELECT * FROM candidatos";
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {

                String identificacion = resultados.getString("id_candidato");
                String nombres = resultados.getString("nombres");
                String tipoIdentificacion = resultados.getString("tipo_documento");
                String apellidos = resultados.getString("apellidos");
                String partido_politico = resultados.getString("partido_politico");
                String ciudadOrigen = resultados.getString("ciudad_origen");
                String descripcion = resultados.getString("descripcion");
                String mensajeCampania = resultados.getString("mensaje_campania");
                String correo = resultados.getString("correo");
                String telefono = resultados.getString("telefono");
                String direccion = resultados.getString("direccion");
                int estado = 1;
               
                ClsCandidato candidato = new ClsCandidato(ciudadOrigen,descripcion,mensajeCampania,partido_politico,estado,identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
                lista.add(candidato);
            }

            return lista;

        } catch (Exception e) {

            return null;
        }

    }
    
        public ClsCandidato buscarCandidato(String cedula){
        try{
            
            String consulta = "SELECT * FROM candidatos where id_candidato = '"+cedula+"'" ;
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next())
            {
                String ciudadOrigen = resultados.getString("ciudad_origen");
                String descripcion = resultados.getString("descripcion");
                String mensajeCampania= resultados.getString("mensaje_campania");
                String partidoPolitico = resultados.getString("partido_politico");
                int estado = 1;
                String identificacion = resultados.getString("id_candidato");
                String tipoIdentificacion = resultados.getString("tipo_documento");
                String nombres = resultados.getString("nombres");
                String apellidos = resultados.getString("apellidos");
                String correo = resultados.getString("correo");
                String telefono = resultados.getString("telefono");
                String direccion = resultados.getString("direccion");

                ClsCandidato can = new ClsCandidato(ciudadOrigen, descripcion, mensajeCampania, partidoPolitico, estado, identificacion, tipoIdentificacion, nombres, apellidos, correo, telefono, direccion);
                 
                return can;
            }
            else
            {
                return null;
            }

        } catch (Exception e) {

            return null;
        }


    }
    
    public ClsResultado eliminarCandidato(String id) {

        ClsResultado mensaje;

        try {
            String sql = "DELETE FROM candidatos WHERE id_candidato = ?";
            
            
            PreparedStatement sentencia = this.con.conectar().prepareStatement(sql);
            sentencia.setString(1, id);

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                mensaje = new ClsResultado(ClsResultado.OK, "Se ha  eliminado un cadidato exitosamente");
                return mensaje;
            }

            mensaje = new ClsResultado(ClsResultado.ERROR, "Ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsResultado(ClsResultado.ERROR, "Error: " + excepcion.getMessage());
            return mensaje;
        }

    }
        public ClsResultado actualizarCandidato(ClsCandidato candidato) {
        ClsResultado mensaje;
        try {
            String sql = "UPDATE candidatos SET nombres = ?,apellidos = ?, partido_politico = ?, ciudad_origen = ?, " +
                    " descripcion = ?, mensaje_campania = ?, estado = ? ," +
                    " correo = ?, telefono = ?, direccion = ? , tipo_documento=? WHERE id_candidato = ?";
            
            PreparedStatement sentencia = this.con.conectar().prepareStatement(sql);
            sentencia.setString(1, candidato.getNombres());
            sentencia.setString(2, candidato.getApellidos());
            sentencia.setString(3, candidato.getPartidoPolitico());
            sentencia.setString(4, candidato.getCiudadOrigen());
            sentencia.setString(5, candidato.getDescripcion());
            sentencia.setString(6, candidato.getMensajeCampania());
            sentencia.setInt(7, 1);
            sentencia.setString(8, candidato.getCorreo());
            sentencia.setString(9, candidato.getTelefono());
            sentencia.setString(10, candidato.getDireccion());
            sentencia.setString(11, candidato.getTipoIdentificacion());
            sentencia.setString(12, candidato.getIdentificacion());
            int resultado = sentencia.executeUpdate();

            if (resultado >= 1)
            {
                mensaje = new ClsResultado(ClsResultado.OK, "Has actualizado el cadidato exitosamente");
                return mensaje;
            }
            mensaje = new ClsResultado(ClsResultado.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsResultado(ClsResultado.ERROR, "Uy ocurrió un error: " + excepcion.getMessage());
            return mensaje;
        }

    }
    
    public static void main(String[] args) {
        
    }
}
