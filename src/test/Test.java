/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ferna
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int solin = 20;
        float nube = 40034342;
        boolean cuestion = false;
        double control = 3.14;
        String carton = "Esto es un texto";
        System.out.println(solin);
        System.out.println(nube);
        System.out.println(cuestion);
        System.out.println(control);
        System.out.println(carton);
        System.out.print("Esto es un tercer mensaje: " + carton);

        mostrarEnteros(70, 50);
    }

    public static void mostrarEnteros(int numA, int numB) {
        System.out.println(numA);
        System.out.println(numB);
    }

}
