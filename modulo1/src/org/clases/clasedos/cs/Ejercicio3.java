package org.clases.clasedos.cs;
/*
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan.
 */
public class Ejercicio3 {
    public boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.equals(unTextoB);
    }
}
