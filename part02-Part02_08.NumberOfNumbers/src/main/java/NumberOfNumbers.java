
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        

        while (true) {
            numbers += 1;

            System.out.println("Give a number: ");
            int input= scanner.nextInt();

            if (input == 0) {
                System.out.println("Thx! Bye!");
                break;
            }

        }
        
        System.out.println("Number of numbers: " + (numbers -1));

    }
}
