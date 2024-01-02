
package ejercicio3;

import java.util.Scanner;
class Ejercicio3 {

    public static void main(String[] args) {
      int cantidadPiezas;
      int total = 0;
      Scanner x=new Scanner(System.in);
      
      System.out.println("Digite la cantidad de piezas de penes");
      cantidadPiezas=x.nextInt();
      
      if (cantidadPiezas<=50){
       total= cantidadPiezas*5;
      }
      if (cantidadPiezas>=50 && cantidadPiezas<100){
       total= cantidadPiezas*4;
      }
         if (cantidadPiezas>=100){
        total= cantidadPiezas*3;
         }
         
       System.out.println("La cantidad de piezas es de: "+cantidadPiezas+ "penes");
       System.out.println("La cantidad a pagar es de: "+total);
    }
    
}
