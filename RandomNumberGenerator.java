import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        if (lowerBound >= upperBound) {
            System.out.println("Invalid range. The lower bound must be less than the upper bound.");
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println(
                    "Random number within the range [" + lowerBound + ", " + upperBound + "]: " + randomNumber);
        }

        scanner.close();
    }
}
