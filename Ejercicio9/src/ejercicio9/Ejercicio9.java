
package ejercicio9;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner pene=new Scanner(System.in);
        
        int num,in=0;
        
        while(in==0){
       
        System.out.println("Introduce un numero");
        num=pene.nextInt();
        
        if(num%2==0){
            System.out.println("El numero " +num+ " es par");
        }else{
           System.out.println("El numero " +num+ " es impar"); 
           
        }if (num<0) {
            System.out.println("El numero " +num+ " es negativo");
        }else{
            System.out.println("El numero " +num+ " es positivo");
            
        }
       
        }
    }
    
}
