
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int one = Integer.valueOf(scanner.nextLine());
        
        if (one < 0){
            System.out.println(one * -1);
        }else {
            System.out.println(one);
        }
        

    }
}
