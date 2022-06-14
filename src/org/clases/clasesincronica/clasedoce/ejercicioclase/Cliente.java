package org.clases.clasesincronica.clasedoce.ejercicioclase;

public class Cliente {
    private String nombre;
    private CajaAhorro caja;

    public Cliente(String nombre, CajaAhorro caja)
    {
        this.nombre=nombre;
        this.caja=caja;
    }
    public String consultarSaldo()
    {
        return "Saldo: "  + caja.informarSaldo();
    }


}