package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rightNumber = rand.nextInt(10) + 1;
        System.out.println(rightNumber);
        int guess;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("enter you guess: ");
            guess= scanner.nextInt();
            if (guess==rightNumber){
                System.out.println("your guess are right");
                break;
            }

            switch (Math.abs(guess-rightNumber)){
                case 1:
                    System.out.println("You're almost there");
                    break;
                case 2:
                case 3:
                    System.out.println("You're close");
                    break;
                default:
                    System.out.println("You're far");
                    break;
            }

        }
    }
}