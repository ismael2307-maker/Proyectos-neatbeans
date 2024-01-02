

import java.util.Scanner;
import java.io.*;


public class Almacenamiento {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        File archivo;//manipulamos el archivo
        FileWriter Escribir; //para escribir en el arhivo
        PrintWriter linea; //para escribir en el archivo 

        String nombre;
        int total;
        int vuelto;

        archivo = new File("productos.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("Ingrese el nombre del producto");
                nombre = s.next();

                do {
                    System.out.println("Ingrese el total de la compra");
                    total = s.nextInt();
                } while (total <= 0);

                System.out.println("Digite el vuelto");
                vuelto = s.nextInt();

                Escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(Escribir);
                //Escribimos en el arcivo

                linea.println(nombre);
                linea.println(total);
                linea.println(vuelto);

                linea.close();
                Escribir.close();
            } catch (IOException ex) {

            }
        } else {

            try {
               
                System.out.println("Ingrese el nombre del producto");
                nombre = s.next();

                do {
                    System.out.println("Ingrese el total de la compra");
                    total = s.nextInt();
                } while (total <= 0);

                System.out.println("Digite el vuelto");
                vuelto = s.nextInt();

                Escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(Escribir);
                //Escribimos en el arcivo

                linea.println(nombre);
                linea.println(total);
                linea.println(vuelto);

                linea.close();
                Escribir.close();
            } catch (IOException ex) {

            }

        }
    }

}
