/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private int dorsal;
    private String posicion;
    private int codequipo;

    public Jugador() {
    }

    public Jugador(int id, String nombre, int dorsal, String posicion, int codequipo) {
        this.id = id;
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.codequipo = codequipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCodequipo() {
        return codequipo;
    }

    public void setNombreEquipo(int codEquipo) {
        this.codequipo = codEquipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", dorsal=" + dorsal + ", posicion=" + posicion + ", codequipo=" + codequipo + '}';
    }
    
    
    
}
