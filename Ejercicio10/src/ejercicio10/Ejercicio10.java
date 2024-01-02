
package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {
  
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        int num1,num2,in=0;
        
        while(in==0){
        
        System.out.println("Introduzca el primer numero");
        num1=x.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2=x.nextInt();
        
        if(num1==num2){
            System.out.println("Ambos numeros son iguales");
        }else if(num1>num2){
            System.out.println("El mayor es: "+num1);
        }else {
            System.out.println("El mayor es: "+num2);
        }
       }
    }
    
}
