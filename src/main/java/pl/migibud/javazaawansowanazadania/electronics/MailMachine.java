package pl.migibud.javazaawansowanazadania.electronics;

import java.util.ArrayList;
import java.util.List;

public class MailMachine implements EmailSender{

    List<EmailSender> emailSenderList = new ArrayList<>();

    public void addEmailSenderDevice(EmailSender emailSender){
        emailSenderList.add(emailSender);
    }

    @Override
    public void sendEmail(String message) {
        emailSenderList.forEach(emailSender -> emailSender.sendEmail(message));
    }
}
