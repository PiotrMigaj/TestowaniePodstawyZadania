package pl.migibud.emailvalidator;

public class UserValidator {

    public static String[] validateEmails(String email, String alternativeEmail){

        return new String[]{new Email(email).email,new Email(alternativeEmail).email};
    }

    private static class Email{

        String email;

        public Email(String email) {
            this.email = this.formatEmail(email);
        }

        private String formatEmail(String email){
            if (email.matches("[\\w]+@[\\w]+(\\.com|\\.pl|)")){
                return email;
            }else{
                return "unknown";
            }
        }
    }

}
