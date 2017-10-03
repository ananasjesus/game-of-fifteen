import model.*;
import view.*;
import controller.*;
import helpers.*;

public class GameCLI {


    public static void main(String[] args) {
        Field field = FieldHelper.getClassicMixedField();

/* Test
        field = FieldHelper.getClassicField();
        MoveController.swapNull(field, 15);
*/
        System.out.print("Как Вас зовут? : ");
        String playerName = ConsoleView.getStringFromInput();

        Game game = new Game("Пятнашки", playerName, field);

        ConsoleView.printHead(game);

        while (!WinController.isWin(game)) {

            ConsoleView.printField(game);

            int nextId = 0;

            while (!MoveController.isLegalMove(field, nextId))

//Input X and Y
//                nextId = ConsoleView.getIdFromInput(game);

//Input Direction
                nextId = ConsoleView.getIdFromInputDirection(game);

            MoveController.swapNull(game, nextId);
        }

        System.out.printf("\n Победа!");
    }



}
