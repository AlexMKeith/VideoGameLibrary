package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Library library = new Library(this);


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
                    System.out.println("You have chosen to add a game. \n" +
                            "What is the title of this new game?");
                    input.nextLine();
                    Game game = new Game(input.nextLine());
                    System.out.println("You have added " + game.getTitle() + " to your library, this game can now be checked out.");
                    library.addGame(game);
                    break;
                case 2:
                    //Remove a game
                    System.out.println("You have chosen to remove a game from your library. \n" +
                            "Here is a list of games, type the number of the one you want to remove.");
                    library.viewGameLibrary();
                    library.removeGame(input.nextInt() - 1);
                    break;
                case 3:
                    //Look at library
                    library.viewGameLibrary();
                    startMenu();
                    break;
                case 4:
                    //Check out a game
                    System.out.println("You have chosen to checkout a game from your library. \n" +
                            "Here is a list of games, type the number of the one you want to checkout.");
                            library.viewGameLibrary();
                    library.checkoutGame();
                    break;
                case 5:
                    //Check in a game
                    break;
                case 6:
                    //View checked out games
                    break;
                case 7:
                    //Exit program
                    System.exit(0);
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
