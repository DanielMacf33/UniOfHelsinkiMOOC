
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double amount = 0;
        
        while(true){
            System.out.println("Give a number: ");
            double input = scanner.nextDouble();
            
            amount += 1;
            
            sum += input;
            
            if(input == 0){
                break;
            }
        }
        
        System.out.println("Average of the numbers: " + sum/(amount-1));

    }
}
