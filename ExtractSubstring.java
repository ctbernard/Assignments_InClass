package org.example;

import java.util.Scanner;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a full sentence");

        String sentence = scanner.nextLine();
        System.out.println("What two index points would you like to create a substring?");
        int p1 = scanner.nextInt();
        System.out.println("and");
        int p2 = scanner.nextInt();
        System.out.println(sentence.substring(p1,p2));



    }
}
