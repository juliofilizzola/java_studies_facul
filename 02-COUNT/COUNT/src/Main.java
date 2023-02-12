public class Main {
    public static void main(String[] args) {
        double noteFirst = 9.0;
        double noteSecond = 10;
        double count = count(noteFirst, noteSecond);
        double percent = percent(count);
        System.out.println(percent);
        System.out.println(count);
        loop();
    }

    public static double count(double noteFirst, double noteSecond) {
        return (noteFirst + noteSecond) / 2;
    }

    public static double percent(double note) {
        return note % 2;
    }

    public static void loop() {
        for (int init = 0; init <= 10000; init++) {
            System.out.println(init);
            System.out.print("FOR");
        }
    }
}