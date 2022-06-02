/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Jugador;

/**
 *
 * @author Usuario
 */
public class ServicioJugador {
    
    public static void registrar(Connection conexion , Jugador j) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Insert into jugador(id,nombre,dorsal,posicion,codequipo) Values(?,?,?,?,?)");
            consulta.setInt(1, j.getId());
            consulta.setString(2, j.getNombre());
            consulta.setInt(3, j.getDorsal());
            consulta.setString(4, j.getPosicion());
            consulta.setInt(5, j.getCodequipo());
            consulta.executeUpdate();
            System.out.println("Guarda Jugador");
        }catch(SQLException e){
            System.out.println("E guardar Jugador");
            throw new SQLException(e);
        }
    }
    public static Jugador buscarJugador(Connection conexion ,String id) throws SQLException{
        Jugador j=new Jugador();
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Select nombre as Nombre , dorsal as Dorsal , posicion as Posicion , codequipo as Equipo from jugador where id='"+id+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                j.setNombre(rs.getString("Nombre"));
                j.setDorsal(rs.getInt("Dorsal"));
                j.setPosicion(rs.getString("Posicion"));
                j.setNombreEquipo(rs.getInt("Equipo"));
            }
            System.out.println("BUSCA");
        }catch(SQLException e){
            System.out.println("E buscar");
            throw new SQLException(e);
        }
        return j;
    }
    public static void actualizarJugador(Connection conexion ,int id, String nombre, int dorsal, String posicion, int  codEquipo) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("UPDATE jugador set nombre='"+nombre+"' , dorsal='"+dorsal+"' , posicion='"+posicion+"' , codequipo='"+codEquipo+"' where id='"+id+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    public static void eliminarJugador(Connection conexion,String id) throws SQLException{
        try{
           PreparedStatement consulta;
           consulta=conexion.prepareStatement("Delete from jugador where id='"+id+"'");
           consulta.executeUpdate();
            System.out.println("Elimino "+id);
        }catch(SQLException e){
            System.out.println("E eliminar");
            throw new SQLException(e);
        }
    }
    public static  String verJugadores(Connection conexion) throws SQLException{
        StringBuffer sb=new StringBuffer();
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("SELECT nombre as Nombre ,dorsal as Dorsal ,codequipo from jugador ORDER BY codequipo");
            ResultSet rs=consulta.executeQuery();
            while(rs.next()){
                sb.append("\n Nombre: "+rs.getString("Nombre")+" --> Dorsal: "+rs.getString("Dorsal")+" --> Codigo Equipo:"+rs.getString("codequipo")+" \n");
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return sb.toString();
    }
    
}
