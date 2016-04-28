import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void createsContact_instantiatesContactClass_true() {
    Contact contact = new Contact("Justin", "Fokes", "February");
    assertEquals(true, contact instanceof Contact);
  }  
}
