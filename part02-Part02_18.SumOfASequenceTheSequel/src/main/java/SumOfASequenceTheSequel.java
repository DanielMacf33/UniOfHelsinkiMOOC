
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("first number? ");
        int first = scanner.nextInt();
        
        System.out.println("last number? ");
        int last = scanner.nextInt();
        
        int sum = 0;
        
        for(int i = first; i <= last; i++){
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
