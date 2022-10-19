import java.util.Scanner;

public class Example3322 {
    public static void main(String[] argv) {
        double n, y = 0, x, difference;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        x = n;
        difference = x - y;
        while (difference >= 0.000001 ) {
            y = 0.5 * (x + n / x);
            difference = x - y;
            if (difference < 0) {
                difference = -difference;
            }
            x = y;
        }
        System.out.println("Result " + y);
    }
}
