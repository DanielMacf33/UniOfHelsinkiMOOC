
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int one = Integer.valueOf(scanner.nextLine());
        int two = Integer.valueOf(scanner.nextLine());
        
        int sum = one+two;
        
        double sqrt = Math.sqrt(sum);
        
        System.out.println(sqrt);
        
       

    }
}
