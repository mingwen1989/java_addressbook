import java.util.ArrayList;


public class Contact{
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private Integer mId;
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();

  public Contact(String firstName, String lastName, String birthDay){
    mFirstName = firstName;
    mLastName = lastName;
    mBirthMonth = birthDay;
    contactList.add(this);
    mId = contactList.size();
  }
  public String getName(){
    return mFirstName + mLastName;
  }
  public ArrayList<Contact> getAll(){
    return contactList;
  }
  public Integer getId(){
    return mId;
  }
  public static Contact find(Integer id){
    try {
      return contactList.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
