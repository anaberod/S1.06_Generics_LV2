public class GenericMethods {

    public < T, U> void displayArguments(String fixedArg,T arg1,U arg2) {
        System.out.println("Fixed String: " + fixedArg);
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println();
    }
}
