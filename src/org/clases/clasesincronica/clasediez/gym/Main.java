package org.clases.clasesincronica.clasediez.gym;

public class Main {

    public static void main(String[] args) {

        Socio socio= new Socio("1111", "Juan","Pesas",5000.0 );
        Socio otroSocio= new Socio("1111", "Rita","Pesas",5000.0 );
        SocioHabilitado socioPileta= new SocioHabilitado("1112", "Ana", "Pileta",5000.0,1500.00);

        System.out.println("Cuota socio con pileta " +socioPileta.calcularCostoMensual());
        System.out.println("Cuota socio comun " +socio.calcularCostoMensual());
        if (socio.equals(otroSocio))
            System.out.println("Son el mismo socio");
        else
            System.out.println("No es el mismo socio");



    }
}
