
package ejercicio5;


import java.util.Scanner;
public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        int num1,num2,Resultado;
        int operacion;
        int in=0;
        
        while(in==0){
        
        System.out.println("1.-Suma 2.-Resta 3.-Multiplicacion 4.-Division 5.-Modulo 6.-Exponenciacion");
        
        do{
        System.out.println("Seleccione su opcion");
        operacion=x.nextInt();
        }while(operacion<=0 || operacion>6);
        
        switch(operacion){
        
        case 1 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
        Resultado=num1+num2;
        System.out.println("El resultado de la suma es de : "+Resultado);
        
         break;
         }
        
        
        case 2 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
        Resultado=num1-num2;
        System.out.println("El resultado de la resta es de : "+Resultado);
        
         break;
         }
        
        case 3 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
        Resultado=num1*num2;
        System.out.println("El resultado de la multiplicacion es de : "+Resultado);
        
         break;
         }
        
         case 4 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
        Resultado=num1/num2;
        System.out.println("El resultado de la division es de : "+Resultado);
        
         break;
         }
         
         case 5 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
        System.out.println(Math.floorMod(num1, num2)); //para sacar el modulo
        
         break;
         }
         
         
        case 6 -> {
           
        do{
        System.out.println("Digite el primer valor");
        num1=x.nextInt();
        }while(num1<=0 || num1>10);
        
        do{
        System.out.println("Digite el segundo valor");
        num2=x.nextInt();
        }while(num2<=0 || num2>10);
        
         Resultado=(int) Math.pow(num1, num2);
         System.out.println("El resultado de la exponenciacion es : "+Resultado);
         break;
         }
           
           
           
           
           
           
           
            
        }
        
        
        
        
        }
    }
    
}
