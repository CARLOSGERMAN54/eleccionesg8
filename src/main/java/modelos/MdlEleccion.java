/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import clases.ClsEleccion;
import clases.ClsResultado;
import clases.ClsValidacion;
import clases.Conexion;
import com.mysql.cj.xdevapi.Schema;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class MdlEleccion {
   public ClsResultado resultado;
   public Conexion con;
   public ClsValidacion val;

    public MdlEleccion() {
        this.con = new Conexion();
        this.val = new ClsValidacion();
    }
   
    public ClsResultado adicionarEleccion(ClsEleccion eleccion)
    {
        PreparedStatement ps = null;
        try
        {         
            String sql = "insert into elecciones( codigo, descripcion,"
                    + "categoria,fecha_inicio,fecha_fin, fecha_inscripcion, "
                    + "estado,nombre) values(?,?,?,?,?,?,?,?)";
            ps = con.conectar().prepareStatement(sql);
            ps.setString(1, eleccion.codigo);
            ps.setString(2, eleccion.descripcion);
            ps.setString(3, eleccion.categoria);
            ps.setDate(4,val.UtilDateToSqlDate(eleccion.fechaInicio));
            ps.setDate(5,val.UtilDateToSqlDate(eleccion.fechaFin));
            ps.setDate(6,val.UtilDateToSqlDate(eleccion.fechaInscripcion));
            ps.setInt(7,eleccion.estado);
            ps.setString(8,eleccion.descripcion);
            int res = ps.executeUpdate();
            if(res>=1)
            {
                this.resultado = new ClsResultado(ClsResultado.OK,"La elección ha sido almacenada con éxito");
            }
            else if(res ==0)
            {
                this.resultado = new ClsResultado(ClsResultado.ADVERTENCIA,"La elección no fue posible registrarse, Intentalo nuevamente");
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
    
          public LinkedList<ClsEleccion> obtenerElecciones() {

        try {
            LinkedList<ClsEleccion> lista = new LinkedList<>();
            String consulta = "SELECT * FROM elecciones where estado = 1";
            PreparedStatement sentencia = this.con.conectar().prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {

                int idEleccion = resultados.getInt("id_eleccion");
                String codigo = resultados.getString("codigo");
                String descripcion = resultados.getString("descripcion");
                String categoria = resultados.getString("categoria");
                Date fechaInicio = resultados.getDate("fecha_inicio");
                Date fechaFin = resultados.getDate("fecha_fin");
                Date fechaInscripcion = resultados.getDate("fecha_inscripcion");
                int  estado = resultados.getInt("estado");
                String nombre = resultados.getString("nombre");
                ClsEleccion ele = new ClsEleccion(idEleccion, codigo, descripcion, categoria, fechaInicio, fechaFin, fechaInscripcion, estado, nombre);
                lista.add(ele);
            }

            return lista;

        } catch (Exception e) {

            return null;
        }

    }
          
    public static void main(String[] args) {
        MdlEleccion mod = new MdlEleccion();
        System.out.print(mod.obtenerElecciones());
    }
    
}
