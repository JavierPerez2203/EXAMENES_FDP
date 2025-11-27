/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25560656_exa2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
        int numero;
        int opcion;
        int repetir = 1;

        while (repetir == 1) {

            System.out.print("Ingrese un numero entero: ");
            numero = captu.nextInt();

            System.out.println("¿Qué desea imprimir?");
            System.out.println("1. Numeros primos");
            System.out.println("2. Numeros no primos");
            System.out.print("Opcion: ");
            opcion = captu.nextInt();

            System.out.println("--------------------------------");

            if (opcion == 1) {
                System.out.println("Numeros primos entre 2 y " + numero + ":");
                
                for (int i = 2; i <= numero; i++) {
                    if (esPrimo(i)) {
                        System.out.print(i + " = ");
                        asterisco(i);
                    }
                }

            } else if (opcion == 2) {
                System.out.println("Números NO primos entre 2 y " + numero + ":");

                for (int i = 2; i <= numero; i++) {
                    if (esPrimo(i)) {
                        System.out.print(i + " = ");
                        asterisco(i);
                    }
                }

            } else {
                System.out.println("Opción invalida.");
            }

            System.out.println("--------------------------------");
            System.out.print("¿Desea repetir el proceso? (1 = Sí, 0 = No): ");
            repetir = captu.nextInt();
        }

        System.out.println("Programa finalizado.");
    }

    
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    
    public static void asterisco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
        
        


    
    

