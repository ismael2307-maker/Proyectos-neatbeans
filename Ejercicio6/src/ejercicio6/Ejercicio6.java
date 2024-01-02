
package ejercicio6;

import java.util.Scanner;
public class Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
      double IngT,InssL,operacion,Ao,porcentaje,pene;
      
   do{
   System.out.println("Digite sus ingresos mensuales");
   IngT=x.nextDouble();
  }while(IngT<=4800 || IngT>500000);

   InssL=IngT*0.07;
   operacion=IngT-InssL;
   Ao=operacion*12;
   
   System.out.println("El valor obtenido al año es de: "+Ao);
   pene=Ao;
   
   
   if(Ao>=100000 && Ao<=200000){
   porcentaje=pene*0.1;
    System.out.println("El 10 porciento del valor obtenido al Año es de: "+porcentaje +" Cordobas");
    
   }else if(Ao>=200001 && Ao<=300000){
    porcentaje=pene*0.15;
    System.out.println("El 15 porciento del valor obtenido al Año es de: "+porcentaje+" Cordobas");
    
   }else{
    porcentaje=pene*0.2;
    System.out.println("El 20 porciento del valor obtenido al Año es de: "+porcentaje +" Cordobas");
   	
    }
   
   
   
    }
    
}
