/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Equipo;

/**
 *
 * @author Usuario
 */
public class ServicioEquipo {
    
    public static void registrarEquipo(Connection conexion, Equipo equipo) throws SQLException
    {
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Insert into equipo(codigo , nombre,capitan,golesfavor,golescontra,amarrillas,rojas) Values (?,?,?,?,?,?,?)");
            
            consulta.setInt(1, equipo.getCodigo());
            consulta.setString(2, equipo.getNombre());
            consulta.setString(3, equipo.getCapitan());
            consulta.setInt(4, 0);
            consulta.setInt(5, 0);
            consulta.setInt(6, 0);
            consulta.setInt(7, 0);
            consulta.executeUpdate();
            System.out.println("El equipo se han guardado");
        
        
        }catch(SQLException ex){
            System.err.println("Falla al guardar el equipo");
            throw  new SQLException(ex);
        
        }
    }
    public static String verEquipos(Connection conexion) throws SQLException{
        StringBuffer sb=new StringBuffer();
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("SELECT nombre as N , golesfavor as GF ,golescontra as GC,amarrillas as A , rojas as R from equipo");
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
                sb.append("\n Equipo: "+rs.getString("N")+" --> Goles a Favor : "+rs.getInt("GF")+" --> Goles contra: "+rs.getInt("GC")+" -->Tarejetas Amarrilas: "+rs.getInt("A")+" ->Tarjeta Rojas: "+rs.getInt("R")+"\n");
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return sb.toString();
    }
    
    public static ArrayList equipos(Connection conexion) throws SQLException{
        ArrayList equipo=new ArrayList();
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Select codigo as Codigo from equipo ");
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
                equipo.add(rs.getString("Codigo"));
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return equipo;
    }
    
}
