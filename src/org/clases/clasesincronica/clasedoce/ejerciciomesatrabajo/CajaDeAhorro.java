package org.clases.clasesincronica.clasedoce.ejerciciomesatrabajo;

public class CajaDeAhorro extends Cuenta {

    public static final double INTERES_CAJA_AHORRO = 1.2;


    @Override
    public void extraer(double monto) {
        if(informarSaldo() <= monto)
            setSaldo(informarSaldo() - monto);

    }

    public void cobrarIntereses() {
        setSaldo(informarSaldo() * CajaDeAhorro.INTERES_CAJA_AHORRO);

    }
}
