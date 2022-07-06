
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String read = scanner.nextLine();
            if (read.equals("")) {
                break;
            }

            String[] peices = read.split(" ");

            for (int i = 0; i < peices.length; i++) {
                if(peices[i].contains("av")){
                    System.out.println(peices[i]);
                }
                
            }

        }


    }
}
