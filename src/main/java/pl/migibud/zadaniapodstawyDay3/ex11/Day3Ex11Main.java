package pl.migibud.zadaniapodstawyDay3.ex11;

public class Day3Ex11Main {

    public static void main(String[] args) {

        Email email = new Email.Builder()
                                    .receiver("sda")
                                    .title("New JAVA course")
                                    .bodyMsg("Hello!")
                                    .attachment("introduction.pdf")
                                    .build();

        System.out.println(email);

        Email email2 = new Email.Builder()
                                    .receiver("sda")
                                    .build();

        System.out.println(email2);
    }
}
