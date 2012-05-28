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
   
   public String getNimi(){
       return nimi;
   }
    
   public void muutaSijaintia(String uusiSijainti) {
       this.sijainti = uusiSijainti;
   }
   
   public String getSijainti(){
       return sijainti;
   }
  
   public void lisaaReseptilleHakukriteeri(String hakukriteeri) {
       int koko = hakukriteerit.size();
        if (hakukriteerit.contains(hakukriteeri) || hakukriteerit.size() == koko )
            return;
        hakukriteerit.add(hakukriteeri);
    }
  
   public ArrayList<String> getHakukriteerit() {
        return hakukriteerit;
    }
     
    @Override
    public String toString() {
        return nimi + ", " + sijainti;
    }      
   
}