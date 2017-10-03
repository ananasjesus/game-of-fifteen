package view;

import controller.*;

import model.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

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

    public static void printField(Field field) {

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

    public static int getIdFromInput(Game game) {
        int sizeX = game.getField().getSizeX();
        int sizeY = game.getField().getSizeY();
        Scanner sc = new Scanner(System.in);
        boolean correctInput = false;
        int x = 0, y = 0;
        while(!correctInput) {
            try {
                System.out.print("\n Введите x=");
                x = sc.nextInt();
                System.out.print("\n Введите y=");
                y = sc.nextInt();
                if (x > 0 && x <= sizeX && y > 0 && y <= sizeY)
                    correctInput = true;
                else
                    throw new InputMismatchException();
            }
            catch (InputMismatchException e) {
                System.out.println("Некорректное значение");
                sc.nextLine();
            }
        }
        return (y-1) * sizeX + x;

    }

    public static String getStringFromInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
