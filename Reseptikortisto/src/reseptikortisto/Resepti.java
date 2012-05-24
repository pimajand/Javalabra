/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author pimajand
 */
public class Resepti {
    private String resepti;
    private String sijainti;
    private String ruokalaji;
        
   public Resepti(String nimi, String sijainti, String ruokalaji) {
        this.resepti = nimi;
        this.sijainti = sijainti;
        this.ruokalaji = ruokalaji;     
   }
   
   public void muutaNimea(Resepti resepti, String uusiNimi) {
       this.resepti = uusiNimi;
       return;
   }
     
   public void muutaSijaintia(Resepti resepti, String uusiSijainti) {
       this.sijainti = uusiSijainti;
       return;
   }
    
    @Override
    public String toString() {
        return resepti + ", " + sijainti + ", " + ruokalaji;
    }       
  
    
}

