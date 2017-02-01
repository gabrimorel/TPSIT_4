/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finsestre1;
import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class Finsestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner input= new Scanner(System.in);
        
        do{
            System.out.println("numero di finestre");
            n = input.nextInt();
        }while(n<=0);
        
        do{
            Finestra w1;
            w1 = new Finestra();
            w1.setVisible(true);
            n =  n-1;
        }while(n!=0);
    }
}
