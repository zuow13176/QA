import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JukeBoxTest {
    private JukeBox testJB;
    private Database db;
    private java.util.List songListJB;
    private Song song1,song2;
    private int ccn=123;
    
    public JukeBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      song1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214); 
      song2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
      
      songListJB = new java.util.ArrayList();
      
      songListJB.add(song1);
      songListJB.add(song2);
      
      db = new Database(songListJB);
        
      testJB = new JukeBox(db,ccn);
    }
    
    @After
    public void tearDown() {
        testJB = null;
    }

     @Test
     public void testIsValidCreditCard() {
       assertEquals("Credit card is valid if value is greater than 0",true,testJB.isValidCreditCard());
     }
}

