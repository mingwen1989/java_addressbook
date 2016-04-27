import java.util.ArrayList;


public class ClassApp{
  private String mVariable;
  private Integer mIntVar;
  private static ArrayList<Cd> cdInfo = new ArrayList<Cd>();

  public ConstructorApp(String variable){
    mVariable = variable;
  }
  public String getVariable(){
    return mVariable;
  }
}
