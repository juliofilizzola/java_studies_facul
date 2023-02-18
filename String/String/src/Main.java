public class Main {
    public static void main(String[] args) {
        String name = "julio";
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.equalsTest(name));
        System.out.println(stringTest.equalsIgnoreCaseTest(name));
    }
}