
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = null;
        int sum = 0;
        int count = 0;
        int nameLength =0;
        int longest = 0;

        while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }

            String[] parts = read.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            nameLength = parts[0].length();
            
            if(nameLength > longest){
                longest = nameLength;
                name = parts[0];
            }
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum/count));

    }
}
