
package arreglos;

import java.util.Scanner;


public class Arreglos {

   
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
   final int MAX=10;
   int edad[]= new int [MAX];
        for (int i = 0; i < MAX; i++) {
            System.out.println("\n digite una edad");    
        edad[i]= sc.nextInt();
        
        }
        System.out.println("\nlas edades son: ");
        for (int i = 0; i < edad.length; i++) {
           
            System.out.println("\t"+edad+i);    
        }

}
}
    