
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("First number?");
        int first = scanner.nextInt();
        System.out.println("Second number?");
        int second = scanner.nextInt();

        for (int i = first; i <=second; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
