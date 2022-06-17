package org.modelosparcial.inmobiliaria;

public abstract class Propiedad {
    private String fechaDeAdquisicion;
    private Double precio;
    private String direccion;
    private Boolean marcaHipoteca;
    private Duenio duenio;

    public Propiedad(String fechaDeAdquisicion, Double precio, String direccion, Boolean marcaHipoteca, Duenio duenio) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
        this.precio = precio;
        this.direccion = direccion;
        this.marcaHipoteca = marcaHipoteca;
        this.duenio = duenio;
    }

    public String getFechaDeAdquisicion() {
        return fechaDeAdquisicion;
    }

    public void setFechaDeAdquisicion(String fechaDeAdquisicion) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getMarcaHipoteca() {
        return marcaHipoteca;
    }

    public void setMarcaHipoteca(Boolean marcaHipoteca) {
        this.marcaHipoteca = marcaHipoteca;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public boolean sePuedeVender(){
       return marcaHipoteca;
    }
}
