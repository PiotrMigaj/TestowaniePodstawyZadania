package pl.migibud.javaadvanced.ex3;

public class Car {

    private String name;
    private String type;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String name, String type, Engine engine) {
        this.name = name;
        this.type = type;
        this.engine = engine;
        this.engine.setEngineType(this.type);
    }

    public Engine getEngine() {
        return engine;
    }

//    private class Engine{
//        private String engineType;
//
//        public void setEngineType(){
//            switch (type){
//                case "economy":
//                    this.engineType = "diesel";
//                    break;
//                case "luxury":
//                    this.engineType="electric";
//                    break;
//                default:
//                    this.engineType = "petrol";
//                    break;
//            }
//        }

//        @Override
//        public String toString() {
//            return "Engine{" +
//                    "engineType='" + engineType + '\'' +
//                    '}';
//        }
//    }
}
