package pl.migibud.javazaawansowanazadania.electronics;

public class Phone extends Device implements EmailSender{

    String number;

    public Phone(String model, String number) {
        super(model);
        this.number = number;
    }

    @Override
    public void turnOn() {
        System.out.printf("Phone of model: %s turns on \n",this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Phone of model: %s turns off \n",this.model);
    }

    public void makeCall(String number){
        System.out.printf("Phone of model: %s is calling from number: %s to number %s",this.model,this.number,number);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending message: "+message);
        System.out.printf("Message was sent from: %s \n",this.model);
    }
}
