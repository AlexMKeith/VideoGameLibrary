package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Library {

    public final Menu menu;
    private List<Game> gameLibrary = new ArrayList<Game>();
    private List<Game> checkedoutGames = new ArrayList<Game>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:mm");
    private int position;

    public Library(Menu menu, Menu home) {
        this.menu = menu;

    }

    protected void addGame () {

    }



    public Library(Menu menu) {
        this.menu = menu;
    }

    protected void addGame (Game game) {
        gameLibrary.add(game);
        menu.startMenu();

    }
    //Code goes here to add game to where ever we are saving game things to
    protected void removeGame(int gameIndex) {
        gameLibrary.remove(gameIndex);
        gameIndex -= gameIndex;
        System.out.println("This game has been removed from your library.");
        menu.startMenu();
    }

    protected void checkoutGame(int gameIndex) {
        gameIndex -= gameIndex;
        Game game = gameLibrary.get(gameIndex);

        checkedoutGames.add(game);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked this game out on: " + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR,7);
        System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));

        gameLibrary.remove(game);
        menu.startMenu();

    }

    protected void checkInGame(int gameIndex) {

        Game game = checkedoutGames.get(gameIndex);

        gameLibrary.add(game);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked this game in on: " + dateFormat.format(calendar.getTime()));

//        if (game.getDueDate().compareTo(dateFormat.format(calendar.getTime())) = 0) {
//            System.out.println("Your game is late, you must pay a fine of 99.99$");
//        }


        checkedoutGames.remove(game);
        menu.startMenu();

    }
    protected void viewGameLibrary() {

        int position = 1;

        for (int i = 0; i < gameLibrary.size(); i++) {
            System.out.println(position + ". " + gameLibrary.get(i).getTitle());
            position++;

        }
    }
    protected void viewCheckedoutGames() {

        int position = 1;

        for (int i = 0; i < checkedoutGames.size(); i++) {
            System.out.println(position + ". " + checkedoutGames.get(i).getTitle());
            position++;
        }
    }


}