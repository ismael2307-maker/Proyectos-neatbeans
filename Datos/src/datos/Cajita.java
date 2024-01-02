
package datos;


import java.io.Serializable;

public class Cajita implements Serializable {
    
    private String producto;
    private String TotalCom;
    private String cantidad;

    public Cajita(String producto, String TotalCom, String cantidad){
        this.producto = producto;
        this.TotalCom = TotalCom;
        this.cantidad = cantidad;
    }
            
    
} 
