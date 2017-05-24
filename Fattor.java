/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattor;

/**
 *
 * @author Studente
 */
public class Fattor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        n=10;
        
        while(n!=0){
            
            fattoriale f=new fattoriale(n);
            f.start();
            n--;
            
        }
    }
    
}
    
    

