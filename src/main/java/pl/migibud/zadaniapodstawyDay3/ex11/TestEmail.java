package pl.migibud.zadaniapodstawyDay3.ex11;

public class TestEmail {

    private String testName;

    @Override
    public String toString() {
        return "TestEmail{" +
                "testName='" + testName + '\'' +
                '}';
    }

    public TestEmail setTestName(String testName){
        this.testName = testName;
        return this;


    }

}
