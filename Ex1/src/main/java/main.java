public class main {
    public static void main(String[] args) {

        GenericMethods gm = new GenericMethods();

        Person person1 = new Person("Charlie","Smith",30);
        Person person2 = new Person("Rachel", "LLoyd", 47);

        gm.displayArguments("Fixed message", person2, true);

        gm.displayArguments("Another string", 3.14, 'A');

        gm.displayArguments("Final text", person1, 999);

    }
}
