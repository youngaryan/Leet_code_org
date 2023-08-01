import java.util.regex.Pattern;

public class SecureTester{
  
  public static boolean alphanumeric(String s){
    if(s.equals(""))return false;

    String regexPattern = "^[a-zA-Z0-9]+$";
    Pattern pattern = Pattern.compile(regexPattern);

    return pattern.matcher(s).matches();
  }
}