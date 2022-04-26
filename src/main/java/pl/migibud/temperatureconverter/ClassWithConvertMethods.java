package pl.migibud.temperatureconverter;

import java.util.ArrayList;
import java.util.List;

public class ClassWithConvertMethods {

    List<TempConvertible> tempConvertibles;

    public ClassWithConvertMethods(){

        tempConvertibles = new ArrayList<>();
        tempConvertibles.add(temp -> (temp*9/5)+32);
        tempConvertibles.add(temp -> temp+273.15f);
        tempConvertibles.add(temp -> temp-273.15f);
        tempConvertibles.add(new TempConvertible() {
            @Override
            public float convertTemp(float temp) {
                return (temp-32)*5/9;
            }
        });
        tempConvertibles.add(temp -> (temp-32f)*5/9+273.15f);
        tempConvertibles.add(temp -> (temp+273.15f)*9/5+32);

    }

}
