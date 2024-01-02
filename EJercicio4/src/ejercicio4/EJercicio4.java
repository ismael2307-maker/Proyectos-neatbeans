
package ejercicio4;

import java.util.Scanner;
public class EJercicio4 {
    
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       
       int in=0;
       final double PI= 3.1415926536;
       double a,b; //para la elipse
       double D,d; // para el rombo
       double Abase,Acaras,A,base1,base2,h,total;
       int operacion;
       double Resultado;
       
       while (in==0){
       System.out.println("1.-Elipse, 2.-Rombo 3.-Piramide");
       
       do{
       System.out.println("Digite su opcion ");
       operacion=x.nextInt();
       }while(operacion<=0 || operacion>3);
       
       switch(operacion){
           
           
           case 1 -> {
              do{
              System.out.println("Digite el valor de a");
              a=x.nextDouble();
              }while(a<=0);
              
              do{
              System.out.println("Digite el valor de b");
              b=x.nextDouble();
              }while(b<=0);
              
              Resultado=(PI)*a*b;
              System.out.println("El area de la elipse es : "+Resultado);
              
             break; 
            }
           
             case 2 -> {
              do{
              System.out.println("Digite el valor de la diagonal mayor");
              D=x.nextDouble();
              }while(D<=0);
              
              do{
              System.out.println("Digite el valor de diagonal menor");
              d=x.nextDouble();
              }while(d<=0);
              
              Resultado=D*d/2;
              System.out.println("El area del rombo es de : "+Resultado);
              
             break; 
            }   
             
             case 3 -> {
              do{
              System.out.println("Digite el valor la base 1");
              base1=x.nextDouble();
              }while(base1<=0);
              
              do{
              System.out.println("Digite el valor de la base 2");
              base2=x.nextDouble();
              }while(base2<=0);
              
              Abase=base1*base2;
              
              do{
              System.out.println("Digite el valor de la altura");
              h=x.nextDouble();
              }while(h<=0);
              
              A=base1*h/2;
              Acaras=4*A;
              
              total=Abase+Acaras;
              
               System.out.println("El area de un triangulo es de : "+total);
            
             break; 
            }  
        }
       
       }
    }
}
