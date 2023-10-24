import org.junit.jupiter.api.Test;
import org.test.LeapYear;

import static org.junit.jupiter.api.Assertions.*;

class testifleapyear {

    @Test
    public void test_is_dividable_by_4_not_100(){
           assertTrue(LeapYear.is_dividable_by_4_not_100(440));
    }
    @Test
    public void test_is_dividable_by_400(){
        assertTrue(LeapYear.is_dividable_by_400(1600));
    }

    @Test
    public void test_is_a_Leap_Year(){
        assertTrue(LeapYear.isLeapYear(440));
    }

    @Test
    public void test_is_a_LeapYear(){
        assertTrue(LeapYear.isLeapYear(1600));
    }

    @Test
    public void test_is_dividable_by_4_and_100(){
        assertFalse(LeapYear.is_dividable_by_4_not_100(400));
    }

    @Test
    public void test_is_not_a_Leap_Year(){
        assertFalse(LeapYear.isLeapYear(1700));
    }

    @Test
    public void test_not_dividable_by_400(){
        assertFalse(LeapYear.is_dividable_by_400(404));
    }
}
