
package javaapplication24;

import java.util.Scanner;
public class JavaApplication24 {

    
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      int contador;
      
      do{
      System.out.println("Digite la cantidad de terminos");
      contador=x.nextInt();
      }while(contador<=0 || contador>50);
      
      for(int i=1;i<contador;i++){
         if(i%2==0){
           System.out.println("\t El numero par es: "+i);
         }
          
        for(int j=1;j<contador;j+=2){
           System.out.println("El numero impar es: "+j);
       
          }
        }
    }
    
}
