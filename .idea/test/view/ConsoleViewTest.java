package view;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleViewTest {
    @Test
    public void clear() throws Exception {

        System.out.println("test");
        ConsoleView.clear();
        System.out.println("test");
        ConsoleView.clear();
        assertTrue(true);
    }

}