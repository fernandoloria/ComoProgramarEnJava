/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Suma {

    public static void main(String[] args) {
        int elNumUsuarioDigita1, elNumUsuarioDigita2, sumaTotal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la primer variable:");
        elNumUsuarioDigita1 = entrada.nextInt();
        
        System.out.print("Digite la segunda variable:");
        elNumUsuarioDigita2 = entrada.nextInt();

        sumaTotal = elNumUsuarioDigita1 + elNumUsuarioDigita2;
        
        String mensaje = elNumUsuarioDigita1 == elNumUsuarioDigita2 ? "Iguales" : "Diferentes.";
        System.out.println(mensaje);
        
        if(elNumUsuarioDigita1 > elNumUsuarioDigita2)
        {
            System.out.println("condicion 1");
        }
        else if (elNumUsuarioDigita1 < elNumUsuarioDigita2)
        {
            System.out.println("Condicion 2");
        }
        else
        {
            System.out.println("Los numeros son iguales");
        }
        System.out.println("La suma es " + sumaTotal);
        
    }

}
