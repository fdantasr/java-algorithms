
public class App {
    public static void main(String[] args) {
        System.out.println("Number    Square   Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d         %d        %d\n", (int) i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}
