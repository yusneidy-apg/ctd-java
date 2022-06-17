package org.modelosparcial.modeloparcialprofesora;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("yus","polanco","1111");
        Final final1 = new Final(alumno,"Objetivo1");
        Final final2 = new Final(alumno,"Testing");
        if(final1.compareTo(final2)==1)
            System.out.println("le fue mejor en Objetos, es mayor");
    }
}
