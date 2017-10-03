import model.*;
import view.*;
import controller.*;
import helpers.*;

public class GameCLI {


    public static void main(String[] args) {
        Field field = FieldHelper.getClassicMixedField();

        System.out.print("Как Вас зовут? : ");
        String playerName = ConsoleView.getStringFromInput();

        Game game = new Game("Пятнашки", playerName, field);

        ConsoleView.printHead(game);

        while (!WinController.isWin(game)) {

            ConsoleView.printField(game);




        }
    }



}
