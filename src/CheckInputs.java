import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInputs {
    public static boolean isValid(String inputEmail)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (inputEmail == null)
            return false;
        return pat.matcher(inputEmail).matches();
    }

    public static boolean isName(String inputName)
    {
        String nameRegex = "[a-zA-Z]+";

        Pattern pat = Pattern.compile(nameRegex);
        if (inputName == null)
            return false;
        return pat.matcher(inputName).matches();
    }

    public static boolean isSurname(String inputSurname)
    {
        String surnameRegex = "[a-zA-Z]+";

        Pattern pat = Pattern.compile(surnameRegex);
        if (inputSurname == null)
            return false;
        return pat.matcher(inputSurname).matches();
    }

    public static boolean isNewStudent(String inputNewStudent)
    {
        String newstudentRegex = "^(?:Yes\\b|No\\b)";
        Pattern pat = Pattern.compile(newstudentRegex);
        if (inputNewStudent == null)
            return false;
        return pat.matcher(inputNewStudent).matches();
    }

    public static boolean isPhone(String inputPhone){
        // 1) remove all space
        // 2)Begins with 6
        // 3) Then contains 8 digits
        String newphoneRegex = "(\"(6)?[0-9]{8}\")";
        while (inputPhone.length() - (inputPhone = inputPhone.replaceAll(" ", "")).length() != 0);
        Pattern pat = Pattern.compile(newphoneRegex);
        if (inputPhone == null)
            return false;
        return pat.matcher(inputPhone).matches();
    }

}
