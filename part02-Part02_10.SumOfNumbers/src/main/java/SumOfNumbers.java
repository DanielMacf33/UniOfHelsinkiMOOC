
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int input = scanner.nextInt();
            
            sum += input;
            
            if(input ==0){
                break;
            }
        }
        
        System.out.println("Sum of the numbers: " + sum);

    }
}