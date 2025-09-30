/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550656_examen1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {
    final static String ACCESO_USUARIO = "USUARIO";
    final static String ACCESO_PIN = "1234";

    
    public static void main(String[] args) {
        // TODO code application logic here
        String USUARIO, PIN;
     Scanner captu = new Scanner(System.in);
     System.out.println("*******CONTROL DE ACCESO******");
     System.out.println("CAJERO");
     System.out.println("Usuario: ");
     USUARIO = captu.nextLine();
     System.out.println("Contraseña: ");
        PIN = captu.nextLine();
     if(USUARIO.equals(ACCESO_USUARIO)){
        if(PIN.equals(ACCESO_PIN )){
            System.out.println("ACCESO CONCEDIDO!!");
     }else{
            System.out.println("ACCESO DENEGADO!!");
        }
     }else{
         System.out.println("INCORRECTO");
         
         System.out.println("CONSULTAR SALDO");
         System.out.println("RETIRAR DINERO");
         System.out.println("DEPOSITAR DINERO");
     

   }
    }
    
}
