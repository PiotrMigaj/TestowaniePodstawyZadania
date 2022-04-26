package pl.migibud.temperatureconverter;

public class TemperatureConverter {

    TypeOfConvertion[] typeOfConvertions;
    ClassWithConvertMethods classWithConvertMethods;

    //private static TypeOfConvertion C_F = new TypeOfConvertion('C','F',new ClassWithConvertMethods().tempConvertibles.get(0));

    private TemperatureConverter(){
        this.typeOfConvertions = new TypeOfConvertion[6];
        this.classWithConvertMethods = new ClassWithConvertMethods();
        this.buildTypeOfConvertionsArray();
    }

    private void buildTypeOfConvertionsArray(){

        this.typeOfConvertions[0]=new TypeOfConvertion('C','F',this.classWithConvertMethods.tempConvertibles.get(0));
        this.typeOfConvertions[1]=new TypeOfConvertion('C','K',this.classWithConvertMethods.tempConvertibles.get(1));
        this.typeOfConvertions[2]=new TypeOfConvertion('K','C',this.classWithConvertMethods.tempConvertibles.get(2));
        this.typeOfConvertions[3]=new TypeOfConvertion('F','C',this.classWithConvertMethods.tempConvertibles.get(3));
        this.typeOfConvertions[4]=new TypeOfConvertion('F','K',this.classWithConvertMethods.tempConvertibles.get(4));
        this.typeOfConvertions[5]=new TypeOfConvertion('K','F',this.classWithConvertMethods.tempConvertibles.get(5));
    }

    public static float temperatureConverter(char tempIn, char tempOut, float temp){

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        for (int i=0;i<temperatureConverter.typeOfConvertions.length;i++){
            if (tempIn==temperatureConverter.typeOfConvertions[i].tempIn&&tempOut==temperatureConverter.typeOfConvertions[i].tempOut){
                return temperatureConverter.typeOfConvertions[i].tempConvertible.convertTemp(temp);
            }
        }
        return Integer.MIN_VALUE;
    }

    private static class TypeOfConvertion{

        char tempIn;
        char tempOut;
        TempConvertible tempConvertible;

        public TypeOfConvertion(char tempIn, char tempOut, TempConvertible tempConvertible) {
            this.tempIn = tempIn;
            this.tempOut = tempOut;
            this.tempConvertible = tempConvertible;
        }
    }


}
