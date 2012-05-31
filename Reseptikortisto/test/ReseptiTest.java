/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import reseptikortisto.Resepti;

/**
 *
 * @author pimajand
 */
public class ReseptiTest {
    
    Resepti resepti;
    
    public ReseptiTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        resepti = new Resepti("Lasagne", "ruutuvihko");
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void hello() {
         assertTrue(true);
     }
     
     @Test
     public void konstruktoriLuoReseptin(){
         assertEquals("Lasagne, ruutuvihko", resepti.toString());
     }
     
     @Test
     public void nimenmuuttaminenMuutaNimea(){
         resepti.muutaNimea("Pihvi");
         assertEquals("Pihvi", resepti.getNimi());
     }
     
     @Test
     public void sijainninmuuttaminenMuutaSijaintia(){
         resepti.muutaSijaintia("Maku 6/2006 sivu 5");
         assertEquals("Maku 6/2006 sivu 5", resepti.getSijainti());
     }
     
     @Test
     public void hakukriteerinLisaaminenLisaaReseptilleHakukriteeri(){
         resepti.lisaaReseptilleHakukriteeri("Pääruoka");
         assertEquals("Pääruoka", resepti.getHakukriteerit());
         
     }
     
}