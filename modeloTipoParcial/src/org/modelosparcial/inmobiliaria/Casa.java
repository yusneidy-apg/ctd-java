package org.modelosparcial.inmobiliaria;

public class Casa extends Propiedad implements Comparable<Casa>{
    private int cantidadDeAmbientes;
    private int cantidadMetrosCuadrados;

    public Casa(String fechaDeAdquisicion, Double precio, String direccion, Boolean marcaHipoteca, Duenio duenio, int cantidadDeAmbientes, int cantidadMetrosCuadrados) {
        super(fechaDeAdquisicion, precio, direccion, marcaHipoteca, duenio);
        this.cantidadDeAmbientes = cantidadDeAmbientes;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public int getCantidadDeAmbientes() {
        return cantidadDeAmbientes;
    }

    public void setCantidadDeAmbientes(int cantidadDeAmbientes) {
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }

    @Override
    public int compareTo(Casa o) {
        return this.cantidadDeAmbientes - o.cantidadDeAmbientes;
    }
}
