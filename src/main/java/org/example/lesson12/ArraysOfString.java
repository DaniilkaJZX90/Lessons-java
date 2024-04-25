package org.example.lesson12;

public class ArraysOfString {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "ttt";
        s[1] = "yyy";
        s[2] = "yyu";

        for (String string : s) {
            System.out.println(string);
        }

        int[] n = {1,2,3};
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
