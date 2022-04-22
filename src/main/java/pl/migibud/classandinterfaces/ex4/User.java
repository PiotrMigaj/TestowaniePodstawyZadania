package pl.migibud.classandinterfaces.ex4;

public class User {

    private String name;
    private String lastName;
    private int age;
    private String login;
    private String password;

    public User() {}



    public void setName(String name){

        Validator<String> validator = (String input)-> {
            if (input.equals("")){
                return false;
            }
            return true;
        };

        if (validator.validate(name)){
            this.name=name;
        }
    }

    public String getName() {
        return name;
    }
}
