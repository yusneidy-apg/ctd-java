package org.clases.clasetres.desafio4;

   /*
            Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
            horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
            trabajo normales. Crear un programa que pueda informar el sueldo semanal de la
            programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
            hora semanal es de 875.
         */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        int horas = scanner.nextInt();
        scanner.nextLine();

        float sueldoSemanal = 0;
        if(horas > 40) {
            sueldoSemanal += (horas - 40) * (875 + (875 * 0.5));
            sueldoSemanal += 40 * 875;
        }
        else {
            sueldoSemanal += horas * 875;
        }
        System.out.println("El sueldo semanal es de: $" +sueldoSemanal);
    }
}
