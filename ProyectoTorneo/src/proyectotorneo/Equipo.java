/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotorneo;

/**
 *
 * @author asus
 */
public class Equipo {
    private String nombre;
    private Integer nummiembros;
    private Double puntaje;
    private Integer posicion;
    private Miembros[] arrmiembros;

    public Equipo(String nombre, Integer nummiembros, Double puntaje, Integer posicion, Miembros[] arrmiembros) {
        this.nombre = nombre;
        this.nummiembros = nummiembros;
        this.puntaje = puntaje;
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

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }
    
}
