
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        } System.out.println(sum);

    }
}
