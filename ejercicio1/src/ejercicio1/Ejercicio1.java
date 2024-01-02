
package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
      
        double ventas[]=new double[30];
        
        System.out.println("Digite las ventas");
        for(int i=0;i<ventas.length;i++){
          
         System.out.println("ventas : " +(i+1));
         ventas[i]=x.nextDouble();
        }
        int k=0;
        int total=0;
        
        while(k<30){
            
            if(ventas[k]>2000){
               System.out.println(ventas[k]);
               total++;
            }
           k++;
        }
    }
    
}
