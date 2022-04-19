/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;

/**
 *
 * @author asus
 */
public class Equipo {
    private String nombre;
    private Integer nummiembros;
    private Integer posicion;
    private Miembros[] arrmiembros;

    public Equipo(String nombre, Integer nummiembros, Integer posicion, Miembros[] arrmiembros) {
        this.nombre = nombre;
        this.nummiembros = nummiembros;
        this.posicion = posicion;
        this.arrmiembros = arrmiembros;
    }

    public Miembros[] getArrmiembros() {
        return arrmiembros;
    }
    
    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNummiembros() {
        return nummiembros;
    }

    public void setNummiembros(Integer nummiembros) {
        this.nummiembros = nummiembros;
    }
    
}
