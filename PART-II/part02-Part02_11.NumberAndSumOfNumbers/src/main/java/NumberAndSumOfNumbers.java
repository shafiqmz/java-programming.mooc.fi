
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            
            if (number != 0) {
                count = count + 1;
                sum = sum + number;

            }
        }

        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
