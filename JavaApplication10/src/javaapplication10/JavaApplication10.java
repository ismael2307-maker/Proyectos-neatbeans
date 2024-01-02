
package javaapplication10;
import java.util.Scanner;
import java.io.*;

public class JavaApplication10 {

     static RandomAccessFile archivo;
    
    static void escribir(String nombre, int total) throws IOException {
        archivo.seek(archivo.length());
        archivo.writeUTF(nombre);
        archivo.writeInt(total);
       
    }
    
    static boolean buscarProducto(String nombre) throws IOException { 
        archivo.seek(0);
        while(archivo.getFilePointer() < archivo.length()) {
            if(archivo.readUTF().equals(nombre))
                return true;
            archivo.skipBytes(6);
        }
        return false;
    }
    
    static void imprimir() throws IOException {
        archivo.seek(0);
        while(archivo.getFilePointer() < archivo.length()) {
            System.out.println(archivo.readUTF());
            System.out.println(archivo.readInt());
            
        }
    }
    
    public static void main(String[] args) {
                       
        try {
            
            archivo = new RandomAccessFile("Personas.dat", "rw");
        } catch(IOException e) {
           
        }
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("1. Escribir en el archivo binario\n"
                    + "2. Buscar producto en el archivo\n"
                    + "3. Mostrar todos los datos guardados\n"
                    + "4. Salir\n"
                    + "Escriba la opcion aqui: ");
            opcion = scanner.nextInt();
            System.out.println();
            switch(opcion) {
                case 1: {
                    String nombre;
                    int total;
                    
                    System.out.print("Escriba el nombre del producto: ");
                    nombre = scanner.next();
                    System.out.print("Escriba el total de la compra: ");
                    total = scanner.nextInt();
                    
                    try {
                        escribir(nombre, total);
                    } catch(IOException e) {
                        
                    }
                    System.out.println("Se han ingresado los datos correctamente!");
                    break;
                }
                case 2: {
                    String nombre;
                    System.out.print("Escriba el nombre del producto que desea buscar: ");
                    nombre = scanner.next();
                    try {
                        if(buscarProducto(nombre))
                            System.out.println("Se ha encontrado el nombre en el archivo");
                        else
                            System.out.println("No se ha encontrado el nombre en el archivo");
                    } catch(IOException e) {
                        
                    }
                    
                    break;
                }
                case 3: {
                    try {
                        imprimir();
                    } catch(IOException e) {
                        
                    }
                    break;
                }
                default: {
                    if(opcion != 4)
                        System.out.println("Opcion no valida");
                }
            }
            System.out.println();
        } while(opcion != 4);
    }
}
   
