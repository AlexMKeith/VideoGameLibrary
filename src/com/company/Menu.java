package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);


    //menu to prompt user for library options
    public void startMenu () {

        System.out.println("Welcome to the video game library, what would you like to do? \n" +
                "1. Add a game to the library \n" +
                "2. Remove a game from the library \n" +
                "3. View what is currently in the library \n" +
                "4. Check a game out \n" +
                "5. Check a game in \n" +
                "6. View checked out games \n" +
                "7. Exit the program");

        try {

            switch (input.nextInt()) {
                case 1:
                    System.out.println("What game would you like to add?");

                    break;
                case 2:
                    //Remove a game
                    break;
                case 3:
                    //Look at library
                    break;
                case 4:
                    //Check out a game
                    break;
                case 5:
                    //Check in a game
                    break;
                case 6:
                    //View checked out games
                    break;
                case 7:
                    //Exit program
                    break;
                default:
                    break;

            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 - 7");
            startMenu();
        }
    }

}
