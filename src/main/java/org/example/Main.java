package org.example;

import java.util.*;

class Guessing {

    private int rightNumber;
    Scanner scanner;

    public Guessing() {
        rightNumber = this.randomNumber();
        scanner = new Scanner(System.in);
    }

    private int randomNumber() {
        Random rand = new Random();
        int Number = rand.nextInt(100) + 1;
        System.out.println(Number);
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

            switch (Math.abs(guess - rightNumber)) {
                case 1:
                case 2:
                case 3:
                    System.out.println("You're almost there");
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println("You're close");
                    break;
                default:
                    System.out.println("You're far");
                    break;
            }

        }

    }
}

public class Main {
    public static void main(String[] args) {

        Guessing guessing=new Guessing();
        guessing.play();


    }
}