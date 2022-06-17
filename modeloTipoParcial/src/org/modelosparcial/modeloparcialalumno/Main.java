package org.modelosparcial.modeloparcialalumno;

public class Main {
    public static void main(String[] args) {

            Capitan capitanAbraham = new Capitan("Abraham","Montenegro","A111");
            Capitan capitanJose = new Capitan("Jose","Fusil","J111");

            Capitan capitanVacio = new Capitan();
            capitanVacio.setNombre("Angel");
            capitanVacio.setApellido("Fusil");
            capitanVacio.setNumeroMatricula("G111");

            Yate yate1 = new Yate(1000., 500., 2019, 34, capitanAbraham, 4);
            Yate yate2 = new Yate(1500., 1000., 2021, 50, capitanVacio, 8);

            Velero velero1 = new Velero(900., 200., 1999, 10, capitanJose, 6);

            Velero velero2 = new Velero(200., 100., 2000, 5, new Capitan("Angelis","Fusil","F111") , 6);

            System.out.println("El velero1 es grande: " + velero1.evaluarTamanio());

            if(yate1.compareTo(yate2) > 0){
                System.out.println("Yate1 es mayor que Yate2");
            }else if(yate1.compareTo(yate2) < 0){
                System.out.println("Yate1 es menor que Yate2");
            }else{
                System.out.println("Yate1 y Yate2 son iguales");
            }

            System.out.println("El alquiler del yate1 es de: " + yate1.calcularAlquiler());
            System.out.println("El alquiler del yate2 es de: " + yate2.calcularAlquiler());
            System.out.println("El alquiler del velero1 es de: " + velero1.calcularAlquiler());
            System.out.println("El alquiler del velero2 es de: " + velero2.calcularAlquiler());
            System.out.println("El capitan de velero2 es: " + velero2.getCapitan());

            System.out.println(yate1);

        }
    }
