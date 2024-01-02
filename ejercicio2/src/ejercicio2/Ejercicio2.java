/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {

    
    
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
    
       System.out.print("Digite la cantidad del arreglo: ");
       int n=x.nextInt();
       int array[]=new int[n];
       
       for(int i=0;i<array.length;i++){
         System.out.print("Ingrese los numeros" +(i+1)+". ");
         array[i]=x.nextInt();        
       }
       int mayor,menor;
       mayor=menor=array[0];
       
        for(int i=0;i<array.length;i++){
        if(array[i]>mayor){
           mayor=array[i];
           }
        if(array[i]<menor){
           menor=array[i];
        }
        
        }
        System.out.println("El mayor numero es: "+mayor);
        System.out.println("El menor numero es: "+menor);
       
    }
    
}
