package org.clases.clasesincronica.clasedoce.ejerciciomesatrabajo;

import org.clases.clasesincronica.clasedoce.ejerciciomesatrabajo.CajaDeAhorro;

public class Main {
    public static void main(String[] args) {

        CajaDeAhorro ca = new CajaDeAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();

        System.out.println(ca.informarSaldo());

    }

}
