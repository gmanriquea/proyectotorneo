/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;

/**
 *
 * @author Acer
 */
public class Enfrentamientos {
    private Integer numequipo1;
    private Integer numequipo2;
    private String nomequipo1;
    private String nomequipo2;
    private Integer asesinatosequipo1;
    private Integer asesinatosequipo2;
    private String[] duracionpartida;
    private Integer numganador;

    public Enfrentamientos(Integer numequipo1, Integer numequipo2, String nomequipo1, String nomequipo2, Integer asesinatosequipo1, Integer asesinatosequipo2, String[] duracionpartida, Integer numganador) {
        this.numequipo1 = numequipo1;
        this.numequipo2 = numequipo2;
        this.nomequipo1 = nomequipo1;
        this.nomequipo2 = nomequipo2;
        this.asesinatosequipo1 = asesinatosequipo1;
        this.asesinatosequipo2 = asesinatosequipo2;
        this.duracionpartida = duracionpartida;
        this.numganador = numganador;
    }

    public Integer getNumequipo2() {
        return numequipo2;
    }

    public void setNumequipo2(Integer numequipo2) {
        this.numequipo2 = numequipo2;
    }

    public Integer getNumequipo1() {
        return numequipo1;
    }

    public void setNumequipo1(Integer numequipo1) {
        this.numequipo1 = numequipo1;
    }

    public String getNomequipo1() {
        return nomequipo1;
    }

    public void setNomequipo1(String nomequipo1) {
        this.nomequipo1 = nomequipo1;
    }

    public String getNomequipo2() {
        return nomequipo2;
    }

    public void setNomequipo2(String nomequipo2) {
        this.nomequipo2 = nomequipo2;
    }

    public Integer getAsesinatosequipo1() {
        return asesinatosequipo1;
    }

    public void setAsesinatosequipo1(Integer asesinatosequipo1) {
        this.asesinatosequipo1 = asesinatosequipo1;
    }

    public Integer getAsesinatosequipo2() {
        return asesinatosequipo2;
    }

    public void setAsesinatosequipo2(Integer asesinatosequipo2) {
        this.asesinatosequipo2 = asesinatosequipo2;
    }

    public String[] getDuracionpartida() {
        return duracionpartida;
    }

    public void setDuracionpartida(String[] duracionpartida) {
        this.duracionpartida = duracionpartida;
    }

    public Integer getNumganador() {
        return numganador;
    }

    public void setNumganador(Integer numganador) {
        this.numganador = numganador;
    }
}

