package org.example;

import java.util.*;

class Guessing {

    private final int rightNumber;
    private final Scanner scanner;

    public Guessing() {
        rightNumber = this.randomNumber();
        scanner = new Scanner(System.in);
    }

    private int randomNumber() {
        Random rand = new Random();
        int Number = rand.nextInt(100) + 1;
//        System.out.println(Number);
        return Number;
    }

    public void play() {
        int guess;
        while (true) {
            System.out.println("enter you guess: ");
            guess = scanner.nextInt();
            if (guess == rightNumber) {
                System.out.println("your guess are right");
                break;
            }

            int diff = Math.abs(guess - rightNumber);

            if (diff <= 3)
                System.out.println("You're almost there");
            else if (diff > 3 && diff <= 9)
                System.out.println("You're close");
            else if (diff > 9 && diff <= 15)
                System.out.println("Not close enough");
            else
                System.out.println("You're far");
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Guessing guessing = new Guessing();
        guessing.play();


    }
}