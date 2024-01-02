
package arreglo;

import java.util.Scanner;
public class Arreglo {


    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int sumaPrecios=0;
        double promedio;
        
       String[]nombres = {"Enchiladasmaynor", "Empanadascamacho", "irving", "Steven", "Ismael"};
       
       for(int i=0;i<nombres.length;i++){
          System.out.println( nombres[i]);
       
       }
      
       
       int[]precios = new int[3];
       
       for(int i=0;i<precios.length;i++){
          System.out.println("Digite el precio");
          precios[i]=x.nextInt();
       }
       
       for(int i=0;i<precios.length;i++){
          System.out.println(precios[i]);
          
       }
       for(int i=0;i<precios.length;i++){
          sumaPrecios=sumaPrecios + precios[i];
       
       }
       System.out.println("La suma de los precios es de : " +sumaPrecios);
       
       promedio=sumaPrecios/precios.length;
       System.out.println("El promedio es de : " +promedio);
       
    }
    
}
