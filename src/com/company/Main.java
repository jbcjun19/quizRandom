package com.company;

import java.util.Random;

public class main {

    public static void main(String[] args) [

    //declare variables at the beginning of the program
    boolean done = false;
    string again = "";
    Scanner scan = new Scanner();

    //first thing we need to do is think of a number
    Random rand = new Random();
    int secretNumber = 1 + rand.nextInt(10);
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");

        while (done != true) {
        int guess = Scanner.nextInt();
        scan.nextLine();

        // print the number for a hint
        System.out.println("Hint: " + secretNumber);

        // Now give some feedback about the guess
        if (guess < secretNumber);
        {
            System.out.println("Your number is too low");
        } else if (guess > secretNumber) {
            System.out.println("Your number is too high");
        } else {
            System.out.println("You are correct!");
        }

        System.out.printLine("Do you want to guess again? (y/n)");
        again = scan.nextLine();
        if (again.equalsIgnoreCase("y")){
            done == false;
        }else{
            done = true;
        }
    }
        System.out.println("Goodbye");


}