package org.clases.clasedos.clasesincronica;

import java.util.Scanner;

public class Main {
    public  static String ingresarFechaNacimieto() //esto es una funsion
    {   int dia,mes,anio;
        Scanner scanner = new Scanner(System.in);
        //vamos a ingresar la fecha de nacimiento
        System.out.println("Ingrese su dia de nacimiento");
        dia = scanner.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes = scanner.nextInt();// el metodo nextint es para ingresar numero entero
        System.out.println("Ingrese su anio de nacimiento");
        anio = scanner.nextInt();//los metodos son funciones que nos permiten reutilizar codigo
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
        return dia + "/" + mes + "/" + anio;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido;
        String iniciales;
        String fecha;
        int dia, mes, anio;

        System.out.println("Ingrese su nombre");
        nombre= scanner.nextLine();

        System.out.println("Ingrese su apellido");
        apellido= scanner.nextLine();//nextline nos permite ingresar informacion por la consola

        iniciales= ""+ nombre.charAt(0) + apellido.charAt(0); //el operador mas que se coloca al inicio es para que se puedan convertir todo a String
        System.out.println(iniciales);//en esta se imprime las iniciales de arriba

        iniciales  = nombre.substring(0, 1)+ apellido.substring(0,1);
        System.out.println(iniciales);

        fecha = ingresarFechaNacimieto();//estoy llamando a una fusion que esta al inicio
    }

}
