import java.util.ArrayList;
import java.util.*;

public class Phone{
  private String mPhone;
  private Integer mId;
  private static ArrayList<Phone> phoneList = new ArrayList<Phone>();

public Phone(String phone) {
  mPhone = phone;
  }
public String getPhone() {
  return mPhone;
  }
public Integer getId(){
  return mId;
  }
public static ArrayList<Phone> all() {
  return phoneList;
  }
}
