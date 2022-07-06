
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String read = scanner.nextLine();
        
        String[] peices = read.split(" ");
        
        for(int i = 0; i < peices.length; i++){
            System.out.println(peices[i]);
        }
        


    }
}
