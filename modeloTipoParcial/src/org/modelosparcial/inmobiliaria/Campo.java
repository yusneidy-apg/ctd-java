package org.modelosparcial.inmobiliaria;

public class Campo extends Propiedad{
    private Boolean casco;
    private double cantidadHectarias;

    public Campo(String fechaDeAdquisicion, Double precio, String direccion, Boolean marcaHipoteca, Duenio duenio, Boolean casco, double cantidadHectarias) {
        super(fechaDeAdquisicion, precio, direccion, marcaHipoteca, duenio);
        this.casco = casco;
        this.cantidadHectarias = cantidadHectarias;
    }

    public double getCantidadHectarias() {
        return cantidadHectarias;
    }

    public void setCantidadHectarias(double cantidadHectarias) {
        this.cantidadHectarias = cantidadHectarias;
    }

    public boolean aptoParaCultivo(){
        return cantidadHectarias > 10;
    }
}
