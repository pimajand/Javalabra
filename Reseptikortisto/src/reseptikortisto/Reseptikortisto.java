/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.util.Scanner;

/**
 *
 * @author pimajand
 */
public class Reseptikortisto {
    private static Scanner lukija = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kortisto reseptikortisto = new Kortisto();
        
        System.out.println(reseptikortisto);
     


        
        
        
        
       Resepti resepti = new Resepti("Tonnikalalasagne", "Ruutuvihko", "Pääruoka");
       resepti.TiedostoonTallennus();
        
        
        
        
        
        // TODO code application logic here
    }
}
