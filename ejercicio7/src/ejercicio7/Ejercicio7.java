
package ejercicio7;

import java.util.Scanner;
public class Ejercicio7 {

 
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
       double MontoF,operacion,porcentaje;
       
       do{
         System.out.println("Digite el monto de la factura");
         MontoF=z.nextDouble();
        }while(MontoF<=0);
       
       if(MontoF>5000){
          operacion=MontoF*0.1;
          porcentaje=MontoF-operacion;
          System.out.println("El descuento del 10 por ciento es de: "+operacion);
          System.out.println("El total es : "+porcentaje);
          
       }else if(MontoF>=2500 && MontoF<=4999){
          operacion=MontoF*0.05;
          porcentaje=MontoF-operacion;
          System.out.println("El descuento del 5 por ciento es de: "+operacion);
          System.out.println("El total es : "+porcentaje);
       
       
       }else if(MontoF>=1000 && MontoF<2500){
          operacion=MontoF*0.03;
          porcentaje=MontoF-operacion;
          System.out.println("El descuento del 3 por ciento es de: "+operacion);
          System.out.println("El total es : "+porcentaje);
          
         }else{
           System.out.println("No se aplica descuento");
           System.out.println("El total es : "+MontoF);
          }
    
         
    
    
    
    }
    
}
