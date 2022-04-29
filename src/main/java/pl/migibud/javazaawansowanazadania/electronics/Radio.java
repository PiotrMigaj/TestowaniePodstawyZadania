package pl.migibud.javazaawansowanazadania.electronics;

public class Radio extends Device {

    public Radio(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.printf("Radio of model: %s turns on \n",this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Radio of model: %s turns off \n",this.model);
    }

    public void changeChannel(String chanel){
        System.out.printf("Radio of model: %s changes channel to: %s \n",this.model,chanel);
    }
}
