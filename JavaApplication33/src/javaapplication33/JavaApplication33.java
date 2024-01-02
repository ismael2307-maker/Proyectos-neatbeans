
package javaapplication33;

import java.util.*;
import java.util.Scanner;
import javax.swing.*;
public class JavaApplication33 {
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
      
        /*String clave="Pene";
        String pass="";
        
        while(clave.equals(pass)==false){
            
            System.out.println("Introduzca la contraseña, porfavor");
            pass=x.next();
            
            if(clave.equals(pass)==false){
            
            System.out.println("La contraseña es incorrecta");
            
            }
        }
        System.out.println("La contraseña es correcta. Acceso permitido");
            
       */
        
        int aleatorio=(int)(Math.random()*100);
        
        
        Scanner z=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        
        while(numero!=aleatorio){
            intentos++;
           System.out.println("introduzca un numero porfavor");
           numero=z.nextInt();
           
           if(aleatorio<numero){
             System.out.println("El numero es bajo"); 
               
           }
           else if(aleatorio>numero){
               System.out.println("El numero es alto");
               
           }
            
        }
        System.out.println("Correcto");
        System.out.println("Lo has conseguido en: "+intentos+ " Intentos");
    }
    
}
