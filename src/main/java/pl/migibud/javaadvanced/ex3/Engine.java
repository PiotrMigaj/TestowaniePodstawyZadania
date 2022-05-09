package pl.migibud.javaadvanced.ex3;

public class Engine {

    private String engineType;

    public void setEngineType(String type){
        switch (type){
            case "economy":
                this.engineType = "diesel";
                break;
            case "luxury":
                this.engineType="electric";
                break;
            default:
                this.engineType = "petrol";
                break;
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
