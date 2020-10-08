/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class TareaCapitulo2 {

    public static void main(String[] args) {
        
        //System.out.print("Hello ");
        /*
        System.out.print("World \n");
        System.out.println("Salut monde!! \"Idioma \\Frances\\ \"");
        Date dia = new Date();
        System.out.printf("%s %tB %<td\n", "Today is ", dia);
        */   
        double numero1, numero2, resultadoOperacion;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero:");
        numero1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo numero:");
        numero2 = entrada.nextDouble();
       // System.out.println(numero2);
        
        if(numero1 == numero2)
        {
            resultadoOperacion = numero1 * 2;
            System.out.println("La multiplicacion por 2 es igual a sumar dos numero iguales");
        }
        else if (numero1 > numero2)
        {
            resultadoOperacion = numero1 / numero2;
            System.out.println("El primer numero es mayor que el numero 2");
        }
        else if (numero1 % 2 == 0)
        {
            resultadoOperacion = (numero2 * 3) + numero1;
            System.out.println("El primer numero es par");
        }
        else
        {
            resultadoOperacion = numero1 + numero2;
        }
       
        System.out.println(resultadoOperacion);
    }

}
