
package ordenamientoburbujaeje;

import java.util.Scanner;


public class OrdenamientoBurbujaeje {

   
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
       
   System.out.println("digite cuantas ventas realizo en el dia");
        int elemento = sc.nextInt();
        
        int[] arr= new int [elemento];
        
        for (int i= 0; i < elemento; i++) {
            System.out.println("digite la venta "+(i+1));
            arr[i]= sc.nextInt();
        
        
        }
        
      
        for (int i = 0; i < elemento-1; i++) {
            for (int j = 0; j <elemento-i-1 ; j++) {
             if (arr[j]<arr[j+1]){//cambiar a < si es de forma descendente y > ascendete
                 

                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]=temp;
             }   
            }
        }
         System.out.println("arreglo ordenado");
            for (int num : arr) {
                System.out.println( num + "");
        
        
        }
           
            }
    
}

    
    
