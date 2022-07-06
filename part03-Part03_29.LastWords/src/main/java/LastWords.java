
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            
            String[] column = read.split(" ");
            int last = column.length -1;
            System.out.println(column[last]);
            
        }


    }
}
