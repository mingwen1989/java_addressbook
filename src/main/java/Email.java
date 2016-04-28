import java.util.ArrayList;
import java.util.*;

public class Email{
  private String mEmail;
  private Integer mId;
  private static ArrayList<Email> emailList = new ArrayList<Email>();

public Email(String email) {
  mEmail = email;
  }
public String getEmail() {
  return mEmail;
  }
public Integer getId(){
  return mId;
  }
public static ArrayList<Email> all() {
  return emailList;
  }
}
