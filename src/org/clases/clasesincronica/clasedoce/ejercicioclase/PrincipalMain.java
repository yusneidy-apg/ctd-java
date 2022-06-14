package org.clases.clasesincronica.clasedoce.ejercicioclase;


public class PrincipalMain {

    public static void main(String[] args) {

        Cuenta cuenta;
        cuenta = new CajaAhorro();
        CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();
        if(cuenta instanceof CajaAhorro)
            ((CajaAhorro)cuenta).cobrarIntereses();

        System.out.println(ca.informarSaldo());


        Cliente cliente=new Cliente("Juan", ca);
    }

}

