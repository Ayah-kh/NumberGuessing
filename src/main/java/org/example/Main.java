package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rightNumber = 5;
        int guess=0;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("enter you guess: ");
            guess= scanner.nextInt();
            if (guess==rightNumber){
                System.out.println("your guess are right");
                break;
            }
        }
    }
}