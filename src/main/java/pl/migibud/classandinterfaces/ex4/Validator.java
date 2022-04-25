package pl.migibud.classandinterfaces.ex4;

@FunctionalInterface
public interface Validator<T> {

    boolean validate(T input);

}
