/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.io.IOException;

/**
 *
 * @author hkimajanpi
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException{
       
      
       
        Kokkaaja kokkaajat = new Kokkaaja();


        // TODO: kokkaajien lisääminen
        kokkaajat.lisaaKokkaaja("Tiina", "aniit");
        kokkaajat.lisaaKokkaaja("Pekka", "akkep");
        kokkaajat.lisaaKokkaaja("Emma", "amme");
        kokkaajat.lisaaKokkaaja("Joni", "inoj");
       
       
       
       
      
    }
   
}