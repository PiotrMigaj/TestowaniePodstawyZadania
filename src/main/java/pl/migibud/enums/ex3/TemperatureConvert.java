package pl.migibud.enums.ex3;

public enum TemperatureConvert {

    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', tempIn -> tempIn - 273.15f),
    F_C('F', 'C', tempIn -> (tempIn - 32) * 5 / 9),
    F_K('F', 'K', tempIn -> (tempIn - 32f) * 5 / 9 + 273.15f),
    K_F('K', 'F', tempIn -> (tempIn + 273.15f) * 9 / 5 + 32);

    private char tempIn;
    private char tempOut;
    private Converter converter;

    TemperatureConvert(char tempIn, char tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }

    public static float convertTemperature(char tempIn, char tempOut, float temperature){

        for (TemperatureConvert t:TemperatureConvert.values()) {
            if (t.tempIn == tempIn && t.tempOut==tempOut){
                return t.converter.convert(temperature);
            }
        }
        return Integer.MIN_VALUE;
    }


}
