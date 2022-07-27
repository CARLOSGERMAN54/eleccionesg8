/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import clases.ClsResultado;
import clases.ClsValidacion;
import clases.ClsVoto;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author HP
 */
public class MdlVoto {
   public ClsResultado resultado;
   public Conexion con;
   public ClsValidacion val;
    public MdlVoto() {
        this.con= new Conexion();
        ClsValidacion val = new ClsValidacion();
        this.val = new ClsValidacion();
    }
   
 public int obtenerCantidadVotos(int idInscripcion){
         try {
            String consulta = "select count(*) as cantidad from votos where id_inscripcion  = "+idInscripcion+"";
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            if(resultados.next()) {
                int cantidad = resultados.getInt("cantidad");
                return cantidad;
            }
            } catch (Exception e) {

                return -1;
            }
         return -1;
 }   
    
 public boolean consultarSiVoto(String cedula,int idEleccion){
    try {
       String consulta = "select * from votos vo inner join inscripciones ins on vo.id_inscripcion = ins.id_inscripcion "
               + "inner join elecciones ele on ele.id_eleccion = ins.id_eleccion "
               + "where vo.id_votante = '"+cedula+"' and ins.id_eleccion = "+idEleccion+"";
       PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
       ResultSet resultados = sentencia.executeQuery();
       if(resultados.next()) {
           return true;
       }
       else
       {
           return false;
       }
   } catch (Exception e) {

       return false;
   }
 }
 public ClsResultado adicionarVoto(ClsVoto voto)
    {
        PreparedStatement ps = null;
        try
        {    
            
            Date da = this.val.LocaldateTimeAdate(LocalDateTime.now());
            String sql = "insert into votos(id_inscripcion, fecha_voto, estado,"
                    + " id_votante)"
                    + " values(?,?,?,?)";
            ps = con.conectar().prepareStatement(sql);
            ps.setInt(1, voto.idInscripcion);
            ps.setTimestamp(2, this.val.DateUtilATimeStamp(da));
            ps.setInt(3, voto.estado);
            ps.setString(4, voto.idVotante);
            int res = ps.executeUpdate();
            if(res>=1)
            {
                this.resultado = new ClsResultado(ClsResultado.OK,"Voto Registrado");
            }
            else if(res ==0)
            {
                this.resultado = new ClsResultado(ClsResultado.ADVERTENCIA,"El voto no se registro, Intentalo nuevamente");
            }
            else
            {
                this.resultado = new ClsResultado(ClsResultado.ERROR,"Hubo un problema en el proceso de votacion");
            }
        }
        catch(Exception ex)
        {
            this.resultado = new ClsResultado(ClsResultado.ERROR,ex.getMessage());
        }
        return this.resultado;  
    }
    public static void main(String[] args) {
        MdlVoto vo = new MdlVoto();
        System.out.print(vo.obtenerCantidadVotos(1));
    }
}
