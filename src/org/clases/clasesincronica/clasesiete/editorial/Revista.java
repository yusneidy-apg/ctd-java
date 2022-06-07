package org.clases.clasesincronica.clasesiete.editorial;

public class Revista {
    private int numero; //creamos esta variable para guardar el contador de las ediciones
    private  String nombre;
    private String codigo;
    private String periodicidad;
    private Edicion ediciones[]; //esto significa que usaremos un array

    public Revista(String nombre, String codigo, String periodicidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        ediciones= new Edicion[100]; //estamos dandole un tamaño al array,
        numero=1;
    }
    public void nuevaEdicion(int cantidad){
        Edicion nueva=new Edicion(numero, cantidad);
        ediciones[numero]=nueva;
        numero++;
    }//
}
