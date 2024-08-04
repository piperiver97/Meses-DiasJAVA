package dev.felipe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonthTest {

    @Test
    public void testMonthNameValid() {
        Month month = new Month();
        assertEquals("January", month.monthName(1));
        assertEquals("February", month.monthName(2));
        assertEquals("March", month.monthName(3));
        assertEquals("April", month.monthName(4));
        assertEquals("May", month.monthName(5));
        assertEquals("June", month.monthName(6));
        assertEquals("July", month.monthName(7));
        assertEquals("August", month.monthName(8));
        assertEquals("September", month.monthName(9));
        assertEquals("October", month.monthName(10));
        assertEquals("November", month.monthName(11));
        assertEquals("December", month.monthName(12));
    }

    @Test
    public void testMonthNameInvalid() {
        Month month = new Month();
        assertEquals("not a valid month number", month.monthName(0));
        assertEquals("not a valid month number", month.monthName(13));
    }
}
