/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57310
 */
public class Conexion {
    private static Connection cn;
    public static Connection obtener() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/campeonato","root","");
            System.out.println("Conecta");
        }catch(SQLException e){
            System.out.println("E1 ");
            throw new SQLException(e);
        }catch(ClassNotFoundException e){
            System.out.println("E2");
            throw new ClassNotFoundException(e.getMessage());
        }
        return cn;
    }
}
