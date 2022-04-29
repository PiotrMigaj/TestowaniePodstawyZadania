package pl.migibud.javazaawansowanazadania.electronics;

public class Tablet extends Device implements EmailSender{

    public Tablet(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.printf("Tablet of model: %s turns on \n",this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Tablet of model: %s turns off \n",this.model);
    }

    public void sendMessage(String type, String message){
        System.out.println("Sending message: "+message);
        System.out.printf("Message of type: %s was sent from: %s \n",type,this.model);
    }

    @Override
    public void sendEmail(String message) {
        this.sendMessage("E-mail",message);
    }
}
