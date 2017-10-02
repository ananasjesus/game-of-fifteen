package helpers;

import org.junit.Test;

import static org.junit.Assert.*;

import model.*;

public class FieldHelperTest {
    @Test
    public void getClassicField() throws Exception {

        final Field testField = FieldHelper.getClassicField();
        final int expextedValue = 10;
        final int expectedId = 10;
        final int realValue = (int) testField.getFigure(expextedValue).getValue();
        assertEquals(expextedValue, realValue);
    }

    @Test
    public void getClassicMixedField() throws Exception {

        final Field testField = FieldHelper.getClassicMixedField();

        assertTrue(true);
    }
}