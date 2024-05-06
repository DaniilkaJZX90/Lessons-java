package org.example.lesson27;

import org.example.lesson27.forest.Squirell;
import org.example.lesson27.forest.Tree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirell squirell1 = new Squirell();

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        do {
            sum ++;
            String s = scanner.nextLine();
            System.out.println(s);

        }while (sum < 5);

    }
}
