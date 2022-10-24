import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestKlasse {
    LeapYear sun = new LeapYear();
    @Test
    public void TestSomething() {
        //I had a pretty small code at the start, with just booleans and returns true/false if leap year
        //However I made it overcomplicated to test every aspect of the sub-criterias, as like "is divisible by 100 but not 400 = not leapyear"
        //This system returns a number for every state, if 2 is returned this means the year is a normal leapyear,
        //whilest 3 determens that the leap year is also a century
        //in the LeapYear class, there is a test that returns a boolean for if the number is a leap-year, which adds a sort-of true/false implementation to my solution
        System.out.println("0 = non-leap year, 1 = divisible by 100 not 400, 2 = divisible by 4 not 100, 3 = divisible by 100 and 400, 4 = not divisible by 4");

        Is_Divisible_With_4_Not_100();
        Is_Divisible_With_400();
        Is_Not_Divisible_By_4();
        Is_Divisible_By_100_Not_400();
    }

    void Is_Divisible_With_4_Not_100() {
        //This test should return the number 2 as 1980 can be divided by 4 but not 100
        assertEquals(2, sun.isLeapYear(1980));
        //Because these tests rely on numbers, if a person doesn't know what these numbers mean, we can test it with this function:
        assertTrue(sun.test_number_for_leapyear(2));
        //This test should return 1 as 1900 can be divided by 4 and 100, but not 400
        assertEquals(1, sun.isLeapYear(1900));
        assertFalse(sun.test_number_for_leapyear(1)); //here we do another doublecheck, returns false if NOT a leapyear
    }
    void Is_Divisible_With_400() {
        //This test should return 3 as 2000 is a century, and if it is a leap year, should be divisible by both 100 and 400
        assertEquals(3, sun.isLeapYear(2000));
    }
    void Is_Not_Divisible_By_4() {
        //This test should return 4 as 2005 cannot be divided by 4
        assertEquals(4, sun.isLeapYear(2005));
    }

    void Is_Divisible_By_100_Not_400() {
        //This test should return 1 as 2100 is divisible by 100 but not 400
        assertEquals(1, sun.isLeapYear(2100));
    }
}