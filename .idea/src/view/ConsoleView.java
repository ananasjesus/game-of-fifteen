package view;

import controller.*;

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
}
