/*
Próxima semana: realizar el siguiente programa con la estructura for:
Mostrar los números pares he impares según el rango que usted delimite.
Utilizar la estructura anidada del for.
 */
package javaapplication23;

import java.util.Scanner;
public class JavaApplication23 {

  
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
          
      for(int i=1;i<=20;i++){
      
           if(i%2==0){
             System.out.println("El numero par es :" +i);
           }     
      }//for 1    
        for(int j=1;j<=20;j+=2){
           if(j%2 !=0){
            System.out.println( " El impar es : "+j);
           }
             
         }
      
      
      
      
     }
         
   }  
 
 
