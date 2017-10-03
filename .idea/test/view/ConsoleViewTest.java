package view;

import org.junit.Test;

import static org.junit.Assert.*;
import model.*;
import view.*;
import helpers.*;
public class ConsoleViewTest {
    @Test
    public void clear() throws Exception {

        System.out.println("test");
        ConsoleView.clear();
        System.out.println("test");
        ConsoleView.clear();
        assertTrue(true);
    }

    @Test
    public void print() throws Exception {

        Game game = new Game("имя игры", "имя игрока", FieldHelper.getClassicMixedField());

        ConsoleView.printHead(game);
        ConsoleView.printField(game);

        assertTrue(true);

    }

  /*  @Test
    public void getId() throws Exception {

        Game game = new Game("имя игры", "имя игрока", FieldHelper.getClassicMixedField());

        int id = ConsoleView.getIdFromInput(game);

        System.out.print(id);

        assertTrue(true);
    }
    */

}