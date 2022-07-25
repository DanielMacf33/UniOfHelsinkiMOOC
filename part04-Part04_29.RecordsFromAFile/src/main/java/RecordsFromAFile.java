
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String nameFile = scanner.nextLine();
        
        try (Scanner sc = new Scanner(Paths.get(nameFile))) {

    while (sc.hasNextLine()) {
        String line = sc.nextLine();

        String[] parts = line.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        System.out.println(name + ", " + "age: " + age + " years");
       
    }
}

    }
}
