package org.clases.clasetres.ejercicioboolean;

public class Main {
    public static boolean esDivisible(int num1, int num2)
    {
       // return  num1%num2==0; esta es una forma de resolverlo
        if (num1%num2==0){  //esta es otra forma de resolver
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String [] args){
        int num1=5;
        int num2=2;
        if (esDivisible(num1,num2)){
            System.out.println(num1 + "es divisible por " + num2);
        }
        else {
            System.out.println(num1 + "no es divisible por " + num2);
        }

    }
}

