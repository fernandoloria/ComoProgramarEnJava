/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class TareaCapitulo4 {

    public static void main(String[] args) {
        
        //TareaCapitulo3 tarea2 = new TareaCapitulo3("Tarea 2 bis", false,3);

        //System.out.println("CAPITULO:" + tarea2.obtenerCapitulo());
        Scanner entrada = new Scanner(System.in);
        /*
        int numeroAdivinado = -1; 
        Random rand = new Random();
        int adivina = rand.nextInt(10 - 1 + 1) + 1;
        System.out.println("trampa:" + adivina);

        System.out.print("Adivina un numero del 1 al 10:");
        numeroAdivinado = entrada.nextInt();
        while (adivina != numeroAdivinado) {
            System.out.print("Fallaste intenta de nuevo:");
            numeroAdivinado = entrada.nextInt();
        }
        System.out.println("Adivinaste!!!");
        */
        
        System.out.print("Cuantos estudiantes va a evaluar:");
        int cantidadEstudiantes = entrada.nextInt();
        int i = 1;
        double notaPromedio = 0,notasTotales = 0;

        while (cantidadEstudiantes >= i) {  
            System.out.println("Nota del Estudiante " + i);
            int notaEstudiante = entrada.nextInt();
            notasTotales += notaEstudiante;
            System.out.println(evaluarEsdudiante(notaEstudiante));
            i++;
        }
        
        notaPromedio = notasTotales / i;
        //System.out.println("El promedio de nota para " + i + " estudiantes es de: " + notaPromedio);
        System.out.printf("El promedio de nota para %d estudiantes es de: %f\n", i ,notaPromedio);
        
    }

    public static String evaluarEsdudiante(double nota) {
        String mensaje = "";
        if (nota == 100) {
            mensaje = "Excelente";
        } else if (nota < 100 && nota >= 90) {
            mensaje = "Muy Bueno";
        } else if (nota < 90 && nota >= 80) {
            mensaje = "Bueno";
        } else if (nota < 80 && nota > 70) {
            mensaje = "Regular";
        } else if (nota == 70) {
            mensaje = "Paso";
        } else {
            mensaje = "Mejor suerte... \n no, no,no \n la suerte no existe, estudie";
        }

        return mensaje;
    }

}
