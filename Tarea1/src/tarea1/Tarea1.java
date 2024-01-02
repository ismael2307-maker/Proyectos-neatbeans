
package tarea1;

import java.util.Scanner;
public class Tarea1 {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        double Al,At,Abase,Apo,p,h,Vol;
        
        do{
        System.out.println("Digite la base(p)");
        p=x.nextInt();
        }while(p<=0);   
        
        do{
        System.out.println("Digite la altura(h)");
        h=x.nextInt();
        }while(h<=0);
        
        Al=5*(p)*(h);
        
        System.out.println("El area lateral es: "+Al+ " Cm Cuadrados");
         
         do{
        System.out.println("Digite el apotema de la piramide(Apo)");
        Apo=x.nextDouble();
        }while(Apo<=0);
         
         Abase=5*(p)*(Apo)/2;
         At=Al+2*(Abase);
         
         Vol=Abase*h;
         
         System.out.println("El area total de la piramide es: "+At+ " Cm Cuadrados");
         System.out.println("El volumen de la piramide es: "+Vol+ " Cm cubicos");
         
        
        
      }
    
}
