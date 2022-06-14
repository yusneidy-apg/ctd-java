package org.clases.clasesincronica.clasedoce.ejercicioclase;

public class CajaAhorro extends Cuenta {

    public static final double INTERES_CAJA_AHORRO = 1.2;


    @Override
    public void extraer(double monto) {
        if(informarSaldo() <= monto)
            setSaldo(informarSaldo() - monto);

    }
    public void depositar(double monto, String moneda)
    {
        double auxiliar;
        if (moneda.equals("dolar"))
            auxiliar=(getSaldo()+(monto*200));
        else
            auxiliar=informarSaldo() +monto;
        setSaldo(auxiliar);
    }

    public void cobrarIntereses() {
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);

    }
}
