package lab2.ex8;

import java.util.Arrays;

public class Example {
    private static String[] strings = new String[]{"a", "b", "c", "d", "e"};

    public static void main(String[] args) {
        String temp;
        String temp1;
        for (int i = 0; i < strings.length / 2; i++) {
            temp = strings[i];
            temp1 = strings[strings.length - i - 1];
            strings[i] = temp;
            strings[strings.length - i - 1] = temp;
            strings[i] = temp1;
        }
        System.out.println(Arrays.toString(strings));
    }
}
