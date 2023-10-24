package org.test;
public class LeapYear {
    public static boolean is_dividable_by_4_not_100(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

    public static boolean is_dividable_by_400(int year) {
        return year % 400 == 0;
    }


    public static boolean isLeapYear(int year) {
        if (is_dividable_by_4_not_100(year)){
            return true;
        }
        return is_dividable_by_400(year);
    }



}
