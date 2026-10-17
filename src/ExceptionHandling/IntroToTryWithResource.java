package JavaPractice.src.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IntroToTryWithResource {

    static void main() throws IOException {

        // BufferedReader is created within the try, guaranteeing it closes automatically
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            System.out.println("File content: " + reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Without try-with-resource
        BufferedReader reader = null;

        try{
             reader = new BufferedReader(new FileReader("input.txt"));
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
