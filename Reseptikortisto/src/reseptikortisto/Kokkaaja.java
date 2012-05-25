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
   
    private HashMap<String,String> kokkaajat = new HashMap();
   
    void Kokkaaja() {
    }

    void lisaaKokkaaja(String nimi, String salasana) {
        kokkaajat.put(nimi, salasana);
    }

   
    boolean kirjaudu(String nimi, String salasana) {

       
        if (!kokkaajat.containsKey(nimi))
            return false;
       
        String talletettuSalasana = kokkaajat.get(nimi);

        return talletettuSalasana.equals(salasana);

    }

   
}