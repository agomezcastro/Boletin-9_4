

package boletin94;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin94 {

    
    public static void main(String[] args) {
        int i, num;
        int resul = 0;
        do{
        num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero:"));
        if (num==0){
            JOptionPane.showMessageDialog(null, "Error 404: data not found");
        }
        else
        for (i=0; i<=10; i++){
            resul= num*i;
        JOptionPane.showMessageDialog(null, num+"*"+i+"="+resul);
        }   
    } while (num!=0);
    }
}
