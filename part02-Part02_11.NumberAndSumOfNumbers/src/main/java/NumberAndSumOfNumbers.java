
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int amount = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int input = scanner.nextInt();
            
            amount += 1;
            
            sum += input;
            
            if(input == 0){
                break;
            }
        }
        
        System.out.println("Number of numbers: " + (amount -1));
        System.out.println("Sum of the numbers: " + sum);

    }
}
