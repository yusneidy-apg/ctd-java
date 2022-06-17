package org.modelosparcial.modeloarma;

public class Arma {
    private int cantidadMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado) {
    }

    public double Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        return alcance;// no entiendo el id me recomendo esto
    }
}