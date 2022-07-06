
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            
            String[] column = read.split(" ");
            System.out.println(column[0]);
            
        }
        


    }
}
