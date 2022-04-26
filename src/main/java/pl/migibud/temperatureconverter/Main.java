package pl.migibud.temperatureconverter;

public class Main {

    public static void main(String[] args) {

        //TemperatureConverter temperatureConverter = new TemperatureConverter();

        float convertedTemp = TemperatureConverter.temperatureConverter('C','F',34f);
        System.out.println(convertedTemp);

    }
}
