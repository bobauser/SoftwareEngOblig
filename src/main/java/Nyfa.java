public class Nyfa {
    public static void main(String[] args) {
        /*
        Functions fun = new Functions();

        fun.GetANumber(4);
        fun.GetANumber(6); */

        LeapYear sun = new LeapYear();

        sun.isLeapYear(2000);
        sun.isLeapYear(2004);
        sun.isLeapYear(2008);
        System.out.println();

        sun.isLeapYear(1700);
        sun.isLeapYear(1800);
        sun.isLeapYear(1900);

        sun.isLeapYear(1699);

        /*
        System.out.println(2000.0 / 4);
        System.out.println(2000.0 / 100);
        System.out.println(2000.0 / 400);
        System.out.println();
        System.out.println(1704.0 / 4);
        System.out.println(1704.0 / 100);
        System.out.println(1704.0 / 400);
        System.out.println();
        System.out.println(1705.0 / 4);
        System.out.println(1705.0 / 100);
        System.out.println(1705.0 / 400);*/

    }
}
