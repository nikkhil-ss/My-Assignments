package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question4_student {
    public static void main(String[] args) {
        try {
            
            String fileContent = Files.readString(Path.of("/Users/nikhilsingh/My Assignments/java11/StudentList.txt")); //java11 features readString

          
            String[] lines = fileContent.split("\\R");

            int count = 0;

            for (String line : lines) {
                String data= line.trim();
                if (!data.isEmpty()) {
                    System.out.println(data);
                    count++;
                }
            }

            System.out.println("Total count " + count);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
