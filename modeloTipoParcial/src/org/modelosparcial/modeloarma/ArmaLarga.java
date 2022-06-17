package org.modelosparcial.modeloarma;

public class ArmaLarga extends Arma implements Comparable{
    private boolean selloRENAR;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, boolean selloRENAR, String descripcionUso, int nivel) {
        super(cantidadMuniciones, alcance, marca, calibre, estado);
        this.selloRENAR = selloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga arma = (ArmaLarga) o;
        int respuesta = 0;
        if (this.getNivel() > arma.getNivel())
            respuesta = 1;
        if (this.getNivel() < arma.getNivel())
            respuesta = -1;
        return respuesta;
    }
}
