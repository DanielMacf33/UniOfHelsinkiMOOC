
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        
        
         while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            
            String[] col = read.split(",");
            int age = Integer.valueOf(col[1]);
            
            if(age > n){
                n = age;
            }
         }
         System.out.println("Age of the oldest: " + n);


    }
}
