
package clase1;

import java.util.Scanner;
public class Clase1 {

    
    public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     
        double C,R;
        int N;
        double Resultado,base1,base2,base3,Total;
        
        do{
          System.out.println("Introduzca el Capital");
          C=x.nextDouble();
        }while(C<=0 || C>500000);
        
        
        do{
          System.out.println("Introduzca el interes anual");
          R=x.nextDouble();
        }while(R<=0 || R>500000);
        
        do{
          System.out.println("Introduzca el numeros de años");
          N=x.nextInt();
        }while(N<=0 || N>500000);
        
        base1=R*C;
        //base2=(1/1+R);
        base3=Math.pow((1/1+R),N);
        
        Resultado=base1/1-base3;
        
        System.out.println("La cuota mensual es de: "+Resultado+ " Cordobas");
        
        
         
        
        
    }
    
}
    