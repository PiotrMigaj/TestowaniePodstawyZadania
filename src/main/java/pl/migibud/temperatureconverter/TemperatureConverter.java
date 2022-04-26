package pl.migibud.temperatureconverter;

public class TemperatureConverter {

    TypeOfConvertion[] typeOfConvertions;
    ClassWithConvertMethods classWithConvertMethods;

    private static final TypeOfConvertion C_F = new TypeOfConvertion('C','F',new ClassWithConvertMethods().tempConvertibles.get(0));
    private static final TypeOfConvertion C_K = new TypeOfConvertion('C','K',new ClassWithConvertMethods().tempConvertibles.get(1));
    private static final TypeOfConvertion K_C = new TypeOfConvertion('K','C',new ClassWithConvertMethods().tempConvertibles.get(2));
    private static final TypeOfConvertion F_C = new TypeOfConvertion('F','C',new ClassWithConvertMethods().tempConvertibles.get(3));
    private static final TypeOfConvertion F_K = new TypeOfConvertion('F','K',new ClassWithConvertMethods().tempConvertibles.get(4));
    private static final TypeOfConvertion K_F = new TypeOfConvertion('K','F',new ClassWithConvertMethods().tempConvertibles.get(5));

    private static final TypeOfConvertion[] typeOfConvertionsArray = new TypeOfConvertion[]{C_F,C_K,K_C,F_C,F_K,K_F};

    public static float temperatureConverter(char tempIn, char tempOut, float temp){

        for (int i=0;i<typeOfConvertionsArray.length;i++){
            if (tempIn==typeOfConvertionsArray[i].tempIn&&tempOut==typeOfConvertionsArray[i].tempOut){
                return typeOfConvertionsArray[i].tempConvertible.convertTemp(temp);
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
