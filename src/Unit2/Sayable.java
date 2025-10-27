package Unit2;
@FunctionalInterface
public interface Sayable {
    void say();
    default void saySomething() {
        System.out.println("Hi I am in Default Method");
    }
}
