package ejercicio.pkg1;

import java.util.Scanner;
public class Ejercicio1 {
static Scanner x=new Scanner(System.in);

public static int suma(int num1, int num2){
 System.out.println("Digite el valor de num1");
 num1=x.nextInt();
 System.out.println("Digite el valor de num2");
 num2=x.nextInt();
 int Sumar=num1+num2;
  return Sumar;
}
  public static int resta(int num1, int num2){
 System.out.println("Digite el valor de num1");
 num1=x.nextInt();
 System.out.println("Digite el valor de num2");
 num2=x.nextInt();
 int Restar=num1-num2;
  return Restar;
  }
  public static int multiplicacion(int num1,int num2){
  System.out.println("Digite el valor de num1");
 num1=x.nextInt();
 System.out.println("Digite el valor de num2");
 num2=x.nextInt();
 int Multiplicar=num1*num2;
 return Multiplicar;
  }
  
  public static int dividir(int num1, int num2){
 System.out.println("Digite el valor de num1");
 num1=x.nextInt();
 System.out.println("Digite el valor de num2");
 num2=x.nextInt();
 int Division=num1/num2;
 return Division;
  }
  
  public boolean Menu(int opcion){
      boolean Retorno = true;
      
      switch(opcion){
          case 1:{
             suma();
            break;
          }
          case 2:{
              resta();
            break;
          }
              
      }
   return Retorno;   
  }
          

    
    public static void main(String[] args) {
       
    }

    private void suma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
