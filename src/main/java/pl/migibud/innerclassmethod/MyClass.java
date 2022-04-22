package pl.migibud.innerclassmethod;

public class MyClass {

    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String validateName(){

        class StringValidator{

            String innerName;

            public StringValidator() {}

            public String getInnerName() {

                if (name==""||name==null){
                    this.innerName="Piotr";
                    return this.innerName;
                }
                this.innerName = name;
                return this.innerName;
            }
        }

        StringValidator stringValidator = new StringValidator();

        return stringValidator.getInnerName();

    }

}
