package org.clases.clasesincronica.clasediez;

public class SocioHabilitado extends Socio
{

    private  Double costoPileta;
    private  Boolean habilitado;

    public SocioHabilitado(String numeroSocio, String nombre, Double cuotaMensual, String actividad,Double costoPileta){
        super (numeroSocio,nombre,cuotaMensual,actividad);
    }
   @Override
    public Double calcularCostoMensual(){

        return  super.calculoCostoMensual() + costoPileta;
    }


}
