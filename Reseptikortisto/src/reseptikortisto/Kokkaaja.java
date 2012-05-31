/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reseptikortisto;

import java.util.HashMap;

/**
 *
 * @author hkimajanpi
 */
public class Kokkaaja {
    
    /** 
     * Kartta käyttäjien tietojen ylläpitämiseksi.
     */
    private HashMap<String,String> kokkaajat = new HashMap();
   
    /**
     * Konstruktori kokkaaja-käyttäjän luomiseksi.
     */
    public void Kokkaaja() {
    }
    
    /**
     * Uuden kokkaaja-käyttäjän lisääminen karttaan.
     * @param nimi
     * @param salasana 
     */
    void lisaaKokkaaja(String nimi, String salasana) {
        kokkaajat.put(nimi, salasana);
    }

    /**
     * Käyttäjä kirjautuu järjestelmään.
     * @param nimi
     * @param salasana
     * @return 
     */
    public boolean kirjaudu(String nimi, String salasana) {
        if (!kokkaajat.containsKey(nimi))
            return false;       
        String talletettuSalasana = kokkaajat.get(nimi);
        return talletettuSalasana.equals(salasana);
    }

}