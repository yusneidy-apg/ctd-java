package org.modelosparcial.modeloarma;

public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantidadMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

}
