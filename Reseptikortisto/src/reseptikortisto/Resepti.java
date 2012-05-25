/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hkimajanpi
 */
public class Resepti {
    private String nimi;
    private String sijainti;
    ArrayList<String> hakukriteerit = new ArrayList();
   
       
   public Resepti(String nimi, String sijainti) {
        this.nimi = nimi;
        this.sijainti = sijainti; 
   }
  
   public void muutaNimea(String uusiNimi) {
       this.nimi = uusiNimi;
   }
    
   public void muutaSijaintia(String uusiSijainti) {
       this.sijainti = uusiSijainti;
   }
  
   void lisaaHakukriteeri(String hakukriteeri) {
       int koko = hakukriteerit.size();
        if (hakukriteerit.contains(hakukriteeri) || hakukriteerit.size() == koko )
            return;
        hakukriteerit.add(hakukriteeri);
    }
  
   ArrayList<String> getHakukriteerit() {
        return hakukriteerit;
    }
  
    @Override
    public String toString() {
        return nimi + ", " + sijainti;
    }      
   
}