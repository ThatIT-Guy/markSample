package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            do {
                int marks = sc.nextInt();
                if (marks > 90) {
                    System.out.println("This is good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                }
            } while (input == 1);
        }else {
            System.out.println("program stopped");
        }
    }
}