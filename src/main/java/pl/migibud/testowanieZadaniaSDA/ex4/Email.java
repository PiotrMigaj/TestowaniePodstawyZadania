package pl.migibud.testowanieZadaniaSDA.ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    private String emailAddress;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isEmailAddressCorrect(String emailAddress){

        String regEx = "[\\w._-]+@[\\w]+(\\.[a-zA-Z]+)?";

        Pattern pattern = Pattern.compile(regEx);

        return pattern.matcher(emailAddress).matches();
    }
}
