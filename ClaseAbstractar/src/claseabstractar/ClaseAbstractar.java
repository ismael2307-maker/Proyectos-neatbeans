
package claseabstractar;

import java.util.Scanner;
public class ClaseAbstractar {

   
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo (7.5,5);
        Circulo circulo = new Circulo(6);
        
        System.out.println("Perimetro circulo: "+circulo.getPerimetro()+" Area : " + circulo.getArea());
         System.out.println("Perimetro rectangulo: "+rectangulo.getPerimetro()+" Area : " + rectangulo.getArea());
    }
    
}
