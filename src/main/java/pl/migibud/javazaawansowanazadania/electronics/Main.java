package pl.migibud.javazaawansowanazadania.electronics;

public class Main {

    public static void main(String[] args) {

        Device device = new Radio("RAM");
        device.turnOn();
        device.turnOn();

        Radio radio = (Radio) device;
        radio.changeChannel("RMF");

        Phone phone = new Phone("XAOMI","322-12-45");
        phone.makeCall("000-00-00");

        Tablet tablet = new Tablet("Lenovo");
        tablet.sendMessage("sms","Hello world!");

        System.out.println("*************************************");

        MailMachine mailMachine = new MailMachine();

        mailMachine.addEmailSenderDevice(new Phone("REDMI","321-66-12"));
        mailMachine.addEmailSenderDevice(new Phone("iPhone","321-66-11"));
        mailMachine.addEmailSenderDevice(new Tablet("Lenovo"));

        mailMachine.sendEmail("Super nowa wiadomość !");

    }

}
