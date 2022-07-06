
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        String name = "";
        
         while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }
            
            String[] col = read.split(",");
            int age = Integer.valueOf(col[1]);
            
            if(age > n){
                n = age;
                name = col[0];
            }
         }
         System.out.println("Name of the oldest: " + name);




    }
}
