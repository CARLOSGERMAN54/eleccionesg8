/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class ClsValidacion {
    public SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
    public ClsValidacion() {
    
    }
    public boolean validarCorreo(String valor){
        String regex = "[A-Za-z]+@[a-z]+\\.[a-z]+";
        Pattern patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(valor);
        boolean esCoincidente = emparejador.find();
        return esCoincidente;
    }
    public boolean validarNombresPersonas(String valor){
        String regex = "^[a-zA-Z]*$";
        Pattern patron = Pattern.compile(regex);
        Matcher emparejador = patron.matcher(valor);
        boolean esCoincidente = emparejador.find();
        return esCoincidente;
    }
    public  String getFecha(JDateChooser jd){
        if(jd.getDate()!=null && jd.getDateFormatString()!=""){
            return this.Formato.format(jd.getDate());
        }
        else
        {
            return ""; 
        }  
    }
    public java.util.Date StringADate(String fecha){
        SimpleDateFormat formato_del_texto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaE = null;
        try{
            fechaE = formato_del_texto.parse(fecha);
            return fechaE;
        }
        catch(ParseException ex){
            return null;
        }
    }
    
    public java.sql.Date UtilDateToSqlDate(Date date)
    {
        long timeInMilliSeconds = date.getTime();
        java.sql.Date date1 = new java.sql.Date(timeInMilliSeconds);
        return date1;
    }
    
    public Date LocaldateAdate(LocalDate localDate){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        
        return date;
    }
    
        public Date LocaldateTimeAdate(LocalDateTime localDateTime){
            Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
    
    public int numeroAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max + min)+ min;
    }
    
    public java.sql.Timestamp DateUtilATimeStamp(Date date){
        java.sql.Timestamp sqlTimeStamp = convert(date);
        return sqlTimeStamp;
    
    }
    
    private java.sql.Timestamp convert(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }
    
    
    public boolean validarCadenaNumerica(String entrada){
       try
        {
            if(entrada != null && !entrada.isBlank())
            {
                if(esCadenaNumerica(entrada))
                { 
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }    
                
        }
        catch(Exception err)
        {
            return false;
        } 
    }
        
     public boolean esCadenaNumerica(String valor){
        if(valor!=null)
        {
            return valor.matches("[+-]?\\d*(\\.\\d+)?");
        }
        else
        {
            return false;
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        ClsValidacion vs = new ClsValidacion();
        Date da = vs.LocaldateTimeAdate(LocalDateTime.now());
        System.out.print(vs.DateUtilATimeStamp(da));
        
         try {
            SimpleDateFormat dateFormat = new 
                SimpleDateFormat ("yyyy-MM-dd");
            Date date1 = dateFormat.parse("2019-09-16");
            Date date2 = dateFormat.parse("2020-01-25");
            System.out.println("Date-1: " + 
                               dateFormat.format(date1));
            System.out.println("Date-2: " +
                               dateFormat.format(date2));
            if(date1.before(date2)){
                System.out.println(
                    "Date-1 is before Date-2");
            } 
        } catch (ParseException ex) {
        }
        
        
    }
    
    
    
}
