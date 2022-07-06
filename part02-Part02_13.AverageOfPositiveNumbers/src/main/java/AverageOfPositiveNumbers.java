
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double pos = 0;

        while (true) {

            double input = scanner.nextDouble();

            if (input == 0) {
                break;
            }

            if (input > 0) {
                pos += 1;
                sum += input;
            }

        }// end of loop 
        
        if (pos == 0) {
            System.out.println("Cannot calculate the average");;
        }

        System.out.println(sum / pos);

    }
}
