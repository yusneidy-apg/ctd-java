package org.clases.clasesincronica.clasedoce.ejerciciomesatrabajo;

import org.clases.clasesincronica.clasedoce.ejerciciomesatrabajo.Cuenta;

public class CuentaCorriente extends Cuenta {

    private double descubiertoPermitido;



    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }



    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }



    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSaldo(informarSaldo() - monto);


    }

}

