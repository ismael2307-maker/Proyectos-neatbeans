
package semaforos;
import static java.lang.Thread.sleep;
import  java.awt.Color;
import javax.swing.*;

public class Proceso implements Runnable{
    public boolean iterar;
    public JButton Rojo;
    public JButton Amarrillo;
    public JButton Verde;
    public JTextField Texto;
    public int contador=0, temp=0, temp2=0, temp3=0,temp4=0;
    
    public Proceso(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4){
     this.Rojo=entrada1;
     this.Amarrillo=entrada2;
     this.Verde=entrada3;
     this.Texto=entrada4;
    }

    @Override
    public void run() {
       while(iterar){
        contador++;
        if(contador>=1 && contador<=30){
          temp++;
          Texto.setText(" "+temp);
        }
        if(contador==1){
          Rojo.setBackground(Color.red);
          Amarrillo.setBackground(Color.gray);
          Verde.setBackground(Color.gray);
        }
        if(contador>=30 && contador<=33){
        temp2++;
        Texto.setText(" "+temp2);
        }
        if(contador==30){
          Rojo.setBackground(Color.gray);
          Amarrillo.setBackground(Color.yellow);
          Verde.setBackground(Color.gray);
        }
        if(contador>=33 && contador<=63){
        temp3++;
        Texto.setText(" "+temp3);
        }
        if(contador==33){
          Rojo.setBackground(Color.gray);
          Amarrillo.setBackground(Color.gray);
          Verde.setBackground(Color.green);
        }
        if(contador>=63 && contador<=66){
        temp4++;
        Texto.setText(" "+temp4);
        }
        if(contador==63){
          Rojo.setBackground(Color.gray);
          Amarrillo.setBackground(Color.yellow);
          Verde.setBackground(Color.green);
        }
        if(contador==65){
         contador=0;
         temp=0;
         temp2=0;
         temp4=0;
        }
        try {
            sleep(1000);
         }catch (Exception e){
         }
        
        }
    } 
    public void start(){
     iterar=true;
      new Thread(this).start();
    }
    public void detener(){
     iterar=false;
     }
    public void reiniciar(){
     contador=0;
     temp=0;
     temp2=0;
     temp3=0;
     temp4=0;
     Texto.setText("");
    }
}
   
   