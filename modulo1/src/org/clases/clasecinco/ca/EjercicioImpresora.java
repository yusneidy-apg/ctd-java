package org.clases.clasecinco.ca;

public class EjercicioImpresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int cantidadHojas;

    public EjercicioImpresora(String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }
    private boolean tieneHojas()
    {
        /*if (cantidadHojas>0)
            return  true;
        else
            return false;*/
        return cantidadHojas>0;
    }

    public void imprimir(String texto)
    {
        if (tieneHojas()) {
            System.out.println(texto);
            cantidadHojas--;
        }
    }
    public void imprimir(String texto, int copias)
    {
        for (int i=copias; i>0; i--) {
            imprimir(texto);
        }

    }
    public void agregarHojas(int hojas)
    {
        cantidadHojas+=hojas;
    }
    public  String toString()
    {
        return "Cantidad de hojas: " + cantidadHojas;
    }

}
