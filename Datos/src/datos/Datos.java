
package datos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

    
    public static void main(String[] args) {
        
      Cajita guardardetalles = new Cajita("CocaCola", "setenta y seis", "Veinticuatro");
      FileOutputStream fichero = null;
      
      try{
      fichero = new FileOutputStream("datos.txt");
      ObjectOutputStream pasar = new ObjectOutputStream(fichero);
      pasar.writeObject(guardardetalles);
      }catch(FileNotFoundException ex){ 
        ex.printStackTrace();
      }catch(IOException ex){
       ex.printStackTrace();
       
      }finally{
         try{
            fichero.close();
         }catch(IOException ex){
            ex.printStackTrace();
         }
      }
        
    }
    
}
