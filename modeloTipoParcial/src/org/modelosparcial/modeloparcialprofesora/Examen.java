package org.modelosparcial.modeloparcialprofesora;

public abstract class Examen  {
    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen(Alumno alumno) //este es el constructor
    {
        this.alumno = alumno;
    }
    /*public Examen(String nombre, String apellido, String legajo){
        alumno = new Alumno(nombre, apellido,legajo)
    }este es otra forma de realizar el constructor */

    public double getNota() {
        return nota;
    }

    public boolean estaAprobado() //esto es un metodo
    {
       return nota >=4;
    }
}
