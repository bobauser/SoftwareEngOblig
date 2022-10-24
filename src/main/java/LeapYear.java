public class LeapYear {

    public int isLeapYear(int year) {
        //0 = non-leap year, 1 = divisible by 100 not 400, 2 = divisible by 4 not 100, 3 = divisible by 100 and 400, 4 = not divisible by 4
        int is_Leap_Year = 0;

        if (year < 1700) {
            is_Leap_Year = 0;
            System.err.println("No Leap Years before 1700");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println(year + " is a leap year");
                    is_Leap_Year = 2;
                } else if (year % 400 == 0) {
                    System.out.println(year + " is a leap year, and it is a century");
                    is_Leap_Year = 3;
                } else {
                    is_Leap_Year = 1;
                    System.out.println(year + " is a century, but not a leap year");
                }
            } else {
                is_Leap_Year = 4;
                System.out.println(year + " is not a leap year");
            }
        }
        test_number_for_leapyear(is_Leap_Year);
        return is_Leap_Year;
    }

    public boolean test_number_for_leapyear(int number) {
        boolean returnAnswer = false;
        if (number == 2 || number == 3) {
            returnAnswer = true;
            System.out.println("This is a leap year");
        }
        if (!returnAnswer) System.out.println("This is NOT a leap year");
        return returnAnswer;
    }
}
