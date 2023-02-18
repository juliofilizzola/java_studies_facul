public class StringTest {

    public String equalsTest(String nameTest)  {
        String name = "Julio";

        if (name.equals(nameTest)) {
            return "São iguais";
        } else {
            return "Não são iguais";
        }
    }

    public String equalsIgnoreCaseTest(String nameTest) {
        String name = "Julio";
        if (name.equalsIgnoreCase(nameTest)) {
            return "São iguais";
        } else {
            return "Não são iguais";
        }
    }
}