/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import modelo.Equipo;
import modelo.Jugador;
import servicios.Conexion;
import servicios.ServicioEquipo;
import servicios.ServicioJugador;
import servicios.ServiciosPartido;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    public void registrar(Jugador j){
        try{
            ServicioJugador rj=new ServicioJugador();
            rj.registrar(Conexion.obtener(), j);
        }catch(Exception e){
            
        }
    }
    public Jugador buscarJugador(String id){

        try{
            ServicioJugador rj=new ServicioJugador();
            return rj.buscarJugador(Conexion.obtener(), id);
        }catch(Exception e){
            
        }
        return null;
    }
    public void eliminarJugador(String id){
        try{
            ServicioJugador rj=new ServicioJugador();
            rj.eliminarJugador(Conexion.obtener(), id);
        }catch(Exception e){
            
        }
    }
    public void actualizarJugador(int id, String nombre, int dorsal, String posicion, int  codEquipo){
        try{
            ServicioJugador rj=new ServicioJugador();
            rj.actualizarJugador(Conexion.obtener(), id, nombre, dorsal, posicion, codEquipo);
        }catch(Exception e){
            
        }
    }
    public void registrarEquipo(Equipo e){
        try{
            ServicioEquipo re=new ServicioEquipo();
            re.registrarEquipo(Conexion.obtener(), e);
        }catch(Exception ex){
            
        }
    }
    
    public ArrayList equipos(){
        try{
            ServicioEquipo re=new ServicioEquipo();
            return re.equipos(Conexion.obtener());
            
        }catch(Exception e){
            
        }
        return null;
    }
    public String printJugadores() {
        try{
            ServicioJugador rj=new ServicioJugador();
            return rj.verJugadores(Conexion.obtener());
        }catch(Exception e){
          
        }
        return null;
    }
    public String prinEquipos(){
        try{
            ServicioEquipo re=new ServicioEquipo();
            return re.verEquipos(Conexion.obtener());
        }catch(Exception e){
            
        }
        return null;
    }
    public void partidoLocal(int codequipo,int golesFavor,int golesContra,int amarrilla,int roja){
        try{
        ServiciosPartido sp=new ServiciosPartido();
     
        sp.registrarPartidoLocal(Conexion.obtener(), codequipo, golesFavor, golesContra, amarrilla, roja);
        }catch(Exception e){
            
        }
    }
      public void partidoVisitante(int codequipo,int golesFavor,int golesContra,int amarrilla,int roja){
        try{
        ServiciosPartido sp=new ServiciosPartido();
        sp.registrarPartidoLocal(Conexion.obtener(), codequipo, golesFavor, golesContra, amarrilla, roja);
        }catch(Exception e){
            
        }
    }
    
}
