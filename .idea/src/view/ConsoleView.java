package view;

import controller.*;

import model.*;

import java.io.IOException;

public class ConsoleView {

    public static void clear() {

        Runtime runtime = Runtime.getRuntime();

        if (System.getProperty("os.name").contains("Windows"))
            try {
            runtime.exec("cls");
            } catch (IOException e) {}
        else
            try {
                runtime.exec("clear");
            } catch (IOException e) {}

    }

    public static void printHead(Game game) {
        System.out.println(game.getGameName());
        System.out.println(game.getPlayerName());


    }

    public static void printField(Game game) {

    }
}
