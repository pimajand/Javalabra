/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.util.*;
import java.io.*;

/**
 *
 * @author hkimajanpi
 */
public class Reseptikortisto {private static Scanner lukija = new Scanner(System.in);

/**
 * Reseptien tietoja ylläpidetään Reseptikortistossa, jonka tiedot talletetaan tekstitiedostoksi.
 */
    private static String tiedostonNimi = "Reseptikortisto.txt";
    private String kokkaaja;
    private static ArrayList<Resepti> reseptit = new ArrayList();
   
    Reseptikortisto() {
       
    }
           
    public void kokkaajaKirjautui(String nimi) {
        this.kokkaaja = nimi;
    }

    public String getKokkaaja() {
        return this.kokkaaja;
    }

    ArrayList<Resepti> getReseptit() {
        return reseptit;
    }
   
    void lisaaResepti(String nimi, String sijainti) throws FileNotFoundException {

        Resepti r = new Resepti(nimi, sijainti);
//        r.lataa(); Tee tähän toiminto!
        reseptit.add(r);


    }
       
    private static void talletaReseptit() throws IOException {
       PrintWriter tiedosto = new PrintWriter(new File(tiedostonNimi));
        int reseptienMaara = reseptit.size();
        tiedosto.println(reseptienMaara);
        for (Resepti nimi : reseptit) {
            tiedosto.println(nimi);
        }
        tiedosto.close();
    }


}