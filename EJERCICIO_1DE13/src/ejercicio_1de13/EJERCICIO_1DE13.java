
package ejercicio_1de13;

import java.util.Scanner;


public class EJERCICIO_1DE13 {

  
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Ingrese los valores para la matriz A:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el numero de la matriz A " + ": ");
                matrizA[i][j] = sc.nextInt();
            }
        }
        int [][] matrizB= new int[3][3];
        System.out.println("\nIngrese los valores para la matriz B:\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el numero de la matriz B " + ": ");
                matrizB[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("Matriz A ingresada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B ingresada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("Matriz C ingresada:");

        
        int [][] matrizC = new int[3][3];    
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizC[i][j] = matrizA[i][j]+matrizB[i][j];
                
                System.out.print(matrizC[i][j] + "  ");
        
        }
            System.out.println();
        }
    }
}

