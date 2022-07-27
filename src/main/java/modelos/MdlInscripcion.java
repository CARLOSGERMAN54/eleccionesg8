/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import clases.ClsInscripcion;
import clases.ClsResultado;
import clases.ClsValidacion;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author HP
 */
public class MdlInscripcion {
   public ClsResultado resultado;
   public Conexion con;
   public ClsValidacion val;

    public MdlInscripcion() {
        this.con = new Conexion();
        this.val = new ClsValidacion();
    }
    public ClsResultado adicionarInscripcion(ClsInscripcion ins)
    {
        PreparedStatement ps = null;
        try
        {         
            String sql = "insert into inscripciones(id_eleccion,id_candidato,fecha_inscripcion,estado"
                    + ") values(?,?,?,?)";
            ps = con.conectar().prepareStatement(sql);
            ps.setInt(1, ins.idEleccion);
            ps.setString(2, ins.idCandidato);
            ps.setDate(3, val.UtilDateToSqlDate(ins.fechaInscripcion));
            ps.setInt(4, 1);
            int res = ps.executeUpdate();
            if(res>=1)
            {
                this.resultado = new ClsResultado(ClsResultado.OK,"La Inscripción se ha registrado con éxito");
            }
            else if(res ==0)
            {
                this.resultado = new ClsResultado(ClsResultado.ADVERTENCIA,"La no fue posible inscribirse, Intentalo nuevamente");
            }
            else
            {
                this.resultado = new ClsResultado(ClsResultado.ERROR,"Hubo un problema en el proceso de Inscripcion");
            }
        }
        catch(Exception ex)
        {
            this.resultado = new ClsResultado(ClsResultado.ERROR,ex.getMessage());
        }
        return this.resultado;  
    }
    
        public ClsInscripcion buscarInscrito(String cedula,int idEleccion1){
        try{
            
            String consulta = "SELECT * FROM inscripciones where id_candidato = '"+cedula+"' and id_eleccion = "+idEleccion1+"" ;
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next())
            {
                int idInscripcion = resultados.getInt("id_inscripcion");
                int idEleccion = resultados.getInt("id_eleccion");
                String idCandidato = resultados.getString("id_candidato");
                Date fechaInscripcion = this.val.StringADate(resultados.getDate("fecha_inscripcion").toString());
                int estado = resultados.getInt("estado");
                ClsInscripcion ins = new ClsInscripcion(idInscripcion, idEleccion, idCandidato, fechaInscripcion, estado);
                return ins;
            }
            else
            {
                return null;
            }

        } catch (Exception e) {

            return null;
        }

        }
  
}
