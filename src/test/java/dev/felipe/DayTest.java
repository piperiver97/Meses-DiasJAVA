package dev.felipe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {

    @Test
    public void testNumberOfDays() {
        Day days = new Day();
        assertEquals(31, days.numberOfDays(1));
        assertEquals(28, days.numberOfDays(2));
        assertEquals(31, days.numberOfDays(3));
        assertEquals(30, days.numberOfDays(4));
        assertEquals(31, days.numberOfDays(5));
        assertEquals(30, days.numberOfDays(6));
        assertEquals(31, days.numberOfDays(7));
        assertEquals(31, days.numberOfDays(8));
        assertEquals(30, days.numberOfDays(9));
        assertEquals(31, days.numberOfDays(10));
        assertEquals(30, days.numberOfDays(11));
        assertEquals(31, days.numberOfDays(12));
    }

    @Test
    public void testNumberOfDaysInvalid() {
        Day days = new Day();
        assertEquals(0, days.numberOfDays(0));
        assertEquals(0, days.numberOfDays(13));
    }
}
