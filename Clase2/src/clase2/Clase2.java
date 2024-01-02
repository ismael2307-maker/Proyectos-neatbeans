
package clase2;

import java.util.Scanner;
public class Clase2 {

    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a,b,c,d;
        
        do{
          System.out.println("Digite el valor de a");
          a=x.nextInt();
        }while(a<=0);
        
         
        do{
          System.out.println("Digite el valor de b");
          b=x.nextInt();
        }while(b<=0);
        
         
        do{
          System.out.println("Digite el valor de c");
          c=x.nextInt();
        }while(c<=0);
        
         
        
          System.out.println("Digite el valor de a");
          d=x.nextInt();
          
          while(d==0){
              System.out.println("No se puede realizar division entre 0");
              
          }
          
          
        
       
    }
    
}
