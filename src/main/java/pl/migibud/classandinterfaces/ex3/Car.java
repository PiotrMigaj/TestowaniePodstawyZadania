package pl.migibud.classandinterfaces.ex3;

public class Car {

    private String type;
    private String name;
    private Engine engine;

    public Car(String type, String name) {
        this.type = type;
        this.name = name;
        this.engine = new Engine();
        this.engine.setEngine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Engine createEngine(){
        return new Engine();
    }

    class Engine{

        private String typeOfEngine;

        private Engine() {
            this.setEngine();
        }

        private void setEngine(){

            switch (type){
                case "economy":
                    this.typeOfEngine="diesel";
                    break;
                case "luxury":
                    this.typeOfEngine="electric";
                    break;
                default:
                    this.typeOfEngine="petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "typeOfEngine='" + typeOfEngine + '\'' +
                    '}';
        }
    }

}
