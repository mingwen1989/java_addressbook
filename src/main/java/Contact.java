import java.util.ArrayList;
import java.util.*;

public class Contact{
  private String mName;
  private String mBirthMonth;
  private Integer mId;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();
  private ArrayList<Phone> mPhone;
  private ArrayList<Email> mEmail;

  public Contact(String name, String birthDay){
    mName = name;
    mBirthMonth = birthDay;
    contactList.add(this);
    mId = contactList.size();
    mPhone = new ArrayList<Phone>();
    mEmail = new ArrayList<Email>();
  }
  public String getName(){
    return mName;
  }
  public static ArrayList<Contact> getAll(){
    return contactList;
  }
  public static void clear() {
    contactList.clear();
  }
  public Integer getId(){
    return mId;
  }
  public static Contact find(int id){
    try {
      return contactList.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
    public ArrayList<Phone> getPhone() {
      return mPhone;
    }
    public ArrayList<Email> getEmail() {
      return mEmail;
    }
    public void addPhone(Phone phone) {
      mPhone.add(phone);
    }
    public void addEmail(Email email) {
      mEmail.add(email);
    }
}
