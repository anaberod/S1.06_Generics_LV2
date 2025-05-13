


public class GenericMethods {

    public static <T> void displayArguments(T...args) {
        for (T arg : args) {
            System.out.println("- " + arg);
        }
    }
}
