
package caja2;
import java.io.*;
import java.util.Scanner;

public class Caja2 {
    public static int op;
    
    static RandomAccessFile archivo;
       
    static void escribir(String producto, int TotalCompra, int vuelto, int cantidad) throws IOException{
      archivo.seek(archivo.length());
      archivo.writeUTF(producto );
      archivo.writeInt(TotalCompra);
      archivo.writeInt(vuelto); 
    }
    
    static void imprimir()throws IOException{
     archivo.seek(0);
     while(archivo.getFilePointer()< archivo.length()){
        System.out.println(archivo.readUTF()); //Nombre del producto
        System.out.println(archivo.readInt());//Total compraa
        System.out.println(archivo.readInt());//vuelto
        System.out.println(archivo.readInt());
        
     } 
    }
   
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    try{
      archivo = new RandomAccessFile("Caja", "r");    
     }catch(IOException e){
     
     }
    
    int opcion;
    String producto;
    int TotalCompra;
    int vuelto;
    int cantidad = 0;
    
   while(op==0){
    System.out.println("1.-Escribir en el archivo 2.-Mostrar los datos");
       do{
      System.out.println("Seleccione su opcion");
      opcion=s.nextInt();
      }while(opcion<=0 || opcion>2);
    
     switch(opcion){
         case 1 -> {
             
             System.out.println("Escriba su producto");
             producto=s.next();
        
             do{
             System.out.println("Escriba el total de la compra");
             TotalCompra=s.nextInt();
             }while(TotalCompra<=0);
             
             do{
             System.out.println("Digite el vuelto");
             vuelto=s.nextInt();
             }while(vuelto<=0);
             
             try{
                 escribir(producto, TotalCompra, vuelto, cantidad);
               }catch(IOException e){
               
               }
               System.out.println("Se han ingresado los datos correspodientes");
             
             
          break;
          }
         
         case 2 ->{
             op=1;
               try{
                 imprimir();
               }catch(IOException e){
               
               }
          break;
         }
     
     }
    
    
     } 
    }
}
