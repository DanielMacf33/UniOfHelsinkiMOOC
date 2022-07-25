
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
   
      

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int count = 0;

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());

                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for (String item : list){
            int number = Integer.valueOf(item);
            
            if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
        }
        
        System.out.println("Numbers: " + count);

    }

}
