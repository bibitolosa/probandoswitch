package org.example.ejemplo2;

public class ejjemplo2 {

    public static void main(String[] args) {

        int variableAlaqueleMiroElEstado=10;
        switch (variableAlaqueleMiroElEstado){

            case 0:
                System.out.println("el camino se fue por 0");
                break;

            case 10:
                System.out.println("el camino se fue por 10");
                break;

            case 100:
                System.out.println("el camino se fue por 100");
                break;

            default:
                System.out.println("El camino por defecto");
                System.out.println("no es ni 0, ni 10 ni 100");
                break;

        }
    }
}


