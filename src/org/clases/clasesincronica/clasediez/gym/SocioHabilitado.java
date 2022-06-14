package org.clases.clasesincronica.clasediez.gym;

import org.clases.clasesincronica.clasediez.gym.Socio;

public class SocioHabilitado extends Socio{

    private Double costoPileta;
    private Boolean habilitado;

    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoPileta )
    {
        super(numero, nombre, actividad,cuota);
        this.costoPileta=costoPileta;
    }
    @Override
    public Double calcularCostoMensual()
    {
        //return getCuotaMensual()+costoPileta;
        return super.calcularCostoMensual() +costoPileta;
    }

}