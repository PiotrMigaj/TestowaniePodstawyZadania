package pl.migibud.classandinterfaces.ex1;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String EMAIL_REGEX = "[a-zA-Z0-9]+@[a-z]+(\\.com)?";

    public static String[] validateEmails(String email, String alternativeEmail){

        class Email{

            private String email;

            public Email(String email){
                if (email==null||email==""||!isEmailCorrect(email)){
                    this.email="unknown";
                }else {
                    this.email=email;
                }
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);

        return new String[]{email1.email,email2.email};
    }

    private static boolean isEmailCorrect(String email){

        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();

    }

}
