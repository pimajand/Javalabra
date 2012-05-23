/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pimajand
 */
public class Resepti {
    private String resepti;
    private String sijainti;
    private ArrayList<String> hakukriteerit = new ArrayList<String>();
        
   public Resepti(String nimi, String sijainti) {
        this.resepti = nimi;
        this.sijainti = sijainti;
               
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
    return resepti + ", " + sijainti + ", hakukriteeri puuttuu vielä";
}       
  
    
}
