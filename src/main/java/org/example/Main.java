package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Double temperaturaAmbiebte;

        System.out.println("Digite la temperatura");
        temperaturaAmbiebte = teclado.nextDouble();

        if (temperaturaAmbiebte == 20.0) {
            temperaturaAmbiebte = 25.0;
            System.out.println("apreciado usuario");


        } else if (temperaturaAmbiebte == 30.0) {
            temperaturaAmbiebte = 20.0;


        } else if (temperaturaAmbiebte == 40.0) {
            temperaturaAmbiebte = 20.0;


        } else {
            System.out.println("señor usuario ingrese temperatura");


        }
    }
}





