import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void createsContact_instantiatesContactClass_true() {
    Contact contact = new Contact("Justin Fokes", "February");
    assertEquals(true, contact instanceof Contact);
  }
  @Test
  public void getName_contactInstantiatesWithName_Home() {
    Contact contact = new Contact("Justin Fokes", "February");
    assertEquals("Justin Fokes", contact.getName());
  }
  @Test
    public void all_returnsAllPhones_true() {
    Contact contact = new Contact("Justin Fokes", "February");
    Contact contact2 = new Contact("J", "March");
    assertTrue(Contact.getAll().contains(contact));
    assertTrue(Contact.getAll().contains(contact2));
  }

  @Test
  public void clear_emptiesAllContactsFromList_0() {
    Contact contact = new Contact("J", "March");
    Contact.clear();
    assertEquals(Contact.getAll().size(), 0);
  }
  @Test
  public void getId_contactInstantiateWithAnId_1() {
    Contact.clear();
    Contact contact = new Contact("J", "March");
    assertEquals((Integer)1, contact.getId());
  }
  @Test
  public void find_returnsContactsWithSameId_secondCategory() {
    Contact contact = new Contact("Justin Fokes", "February");
    Contact contact2 = new Contact("J", "March");
    assertEquals(Contact.find(contact2.getId()), contact2);
  }
  @Test
  public void find_returnsNullWhenNoContactFound_null() {
    assertTrue(Contact.find(999) == null);
   }

   @Test
   public void getContacts_initiallyReturnsEmptyListWithPhone_ArrayList() {
     Contact contact = new Contact("J", "March");
     assertEquals(0, contact.getPhone().size());
    }
    @Test
    public void getContacts_initiallyReturnsEmptyListWithEmail_ArrayList() {
      Contact contact = new Contact("J", "March");
      assertEquals(0, contact.getEmail().size());
     }
     @Test
     public void addTask_addsPhoneToContact_true() {
       Contact contact = new Contact("J", "March");
       Phone phone = new Phone("253-448-1364");
       contact.addPhone(phone);
       assertTrue(contact.getPhone().contains(phone));
     }
     @Test
     public void addTask_addsEmailToContact_true() {
       Contact contact = new Contact("J", "March");
       Email email = new Email("j.k.fokes@gmail.com");
       contact.addEmail(email);
       assertTrue(contact.getEmail().contains(email));
     }

}
