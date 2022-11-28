package lab2.ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowMany {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split("(\\s* )");
        System.out.println(words.length);
    }
}
