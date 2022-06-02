/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ServiciosPartido {
    
    public static void registrarPartidoLocal(Connection conexion,int codequipo,int golesfavor,int golescontra,int amarrilla,int roja ) throws SQLException{
       
        try{
           //UPDATE equipo set golesfavor=(golesfavor+2),golescontra=(golesfavor+2) where id='1'
            PreparedStatement consulta;                                                                                                             
            consulta=conexion.prepareStatement("UPDATE equipo set golesfavor=(golesfavor+"+golesfavor+") ,golescontra=(golescontra+"+golescontra+") ,rojas=(rojas+"+roja+"),amarrillas=(amarrillas+"+amarrilla+") where codigo='"+codequipo+"'");
            consulta.executeUpdate();
            System.out.println("PARTIDO");
        }catch(SQLException e){
            System.out.println("E partido");
            throw new SQLException(e);
        }
    }
        public static void registrarPartidoVisitante(Connection conexion,int codequipo,int golesFavor,int golesContra,int amarrilla,int roja ) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("UPDATE equipo set golesfavor=(golesfavor+"+golesFavor+") ,golescontra=(golescontra+"+golesContra+") , amarrillas=(amarrillas+"+amarrilla+") ,rojas=(rojas+"+roja+") where codigo='"+codequipo+"'");
            consulta.executeUpdate();
            System.out.println("PARTIDO");
        }catch(SQLException e){
            System.out.println("E partido");
            throw new SQLException(e);
        }
    }
    
}
