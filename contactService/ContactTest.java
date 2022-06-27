// @author Garrett Dunn

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ContactTest {

    static Contact cont;

    public ContactTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        cont = new Contact();
        cont.contact("12345", "abcd", "xyz", "1234567890", "opp xyz");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testFirstName() {
        
        assertEquals(cont.getFirstName(), "abcd");
        assertTrue(cont.getFirstName().length() <= 10);
        assertTrue(cont.getFirstName() != null);
    }

    @Test
    public void testLastName() {
        
        assertEquals(cont.getLastName(), "xyz");
        assertTrue(cont.getLastName().length() <= 10);
        assertTrue(cont.getLastName() != null);
    }

    @Test
    public void testAddress() {
        
        assertEquals(cont.getAddress(), "opp xyz");
        assertTrue(cont.getAddress().length() <= 30);
        assertTrue(cont.getAddress()!= null);

    }

    @Test
    public void testPhone() {
        
        cont.contact("12345", "abcd", "xyz", "1234567890", "opp xyz");
        assertEquals(cont.getPhone(), "1234567890");
        assertTrue(cont.getPhone().length() == 10);
        assertTrue(cont.getPhone() != null);

    }
    
    
     @Test
    public void testContactId() {
        
        cont.contact("12345", "abcd", "xyz", "1234567890", "opp xyz");
        assertEquals(cont.getContactId(), "12345");
        assertTrue(cont.getContactId().length() <= 10);
        assertTrue(cont.getContactId() != null);

    }

}
