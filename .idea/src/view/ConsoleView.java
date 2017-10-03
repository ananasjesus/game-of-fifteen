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

        final Field field = game.getField();

        for (int i = 1; i <= field.getSize(); i++) {

            if (i % field.getSizeX() == 1)
                System.out.print("\n|");


            if (field.getFigure(i).getValue() != null)
                System.out.printf("%3s|", field.getFigure(i).getValue());
            else
                System.out.print("   |");

        }
        System.out.println();
    }
}
