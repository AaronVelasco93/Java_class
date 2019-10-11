/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcion1;

import java.util.Scanner;

/**
 *
 * @author S1PC1
 */
public class FuncionesCompleto {

    public static void main(String[] args) {

        int condicionMenu = 0;

        Scanner miSc = new Scanner(System.in);//Entrada de datos

        System.out.println("----Areas---");

        do {
            double Valor1; 
            double Valor2;
            menuAreas();
            condicionMenu = miSc.nextInt();
            
            switch (condicionMenu) {
                case 1:
                    System.out.print("----------Area de Triangulo------------");
                    
                    System.out.print("Ingresa el Valor 1");
                        Valor1=miSc.nextDouble();
                    System.out.println("Ingresa el Valor 1");
                        Valor2=miSc.nextDouble();
                    System.out.println("Resultado: "+areaTriangulo(Valor1, Valor2));
                    
                    
                    break;
                case 2:
                    System.out.println("----------Area de un Cuadrado------------");
                   
                    System.out.print("Ingresa el Valor 1");
                        Valor1=miSc.nextDouble();
                    System.out.print("Ingresa el Valor 1");
                        Valor2=miSc.nextDouble();
                    System.out.println("Resultado: "+areaCuadrado(Valor1, Valor2));
                    
                    
                    break;
                    
                case 3:
                    System.out.println("----------Area de Rectangulo------------");
                    
                    System.out.print("Ingresa el Valor 1");
                        Valor1=miSc.nextDouble();
                    System.out.print("Ingresa el Valor 1");
                        Valor2=miSc.nextDouble();
                    System.out.println("Resultado: "+areaRectangulo(Valor1, Valor2));
                    
                   break;
                    
                case 4:
                    System.out.println("----------Area de Rombo------------");
                    
                    System.out.print("Ingresa el Valor 1");
                        Valor1=miSc.nextDouble();
                    System.out.print("Ingresa el Valor 1");
                        Valor2=miSc.nextDouble();
                    System.out.println("Resultado: "+areaRombo(Valor1, Valor2));
                   break;    
                default:
                    System.out.println("Saliendo");
            }

        } while (condicionMenu <= 4);

    }

    static void menuAreas() { 
        
        System.out.println("\nIngre la opcion que deses");
        System.out.println("1.- Area Triangulo");
        System.out.println("2.- Area Cuadrado");
        System.out.println("3.- Area Rectangulo");
        System.out.println("4.- Area Rombo");
        System.out.println("5.- Salir");
        System.out.print("Opcion :");
        
        
    }

    //(base * altura)/2

    static double areaTriangulo(double a, double b) {
        double c;
        c = (a + b) / 2;
        return c;
    }

    //Lado*Lado

    static double areaCuadrado(double a, double b) {
        double c;
        c = (a + b) / 2;
        return c;
    }

    //Base*Altura
    static double areaRectangulo(double a, double b) {
        double c;
        c = a * b;
        return c;
    }

    //(Diamero Mayor * diametroMenor)/2

    static double areaRombo(double a, double b) {
        double c;
        c = (a * b) / 2;
        return c;
    }

}
