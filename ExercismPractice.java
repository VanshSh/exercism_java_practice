class Leap {

    boolean isLeapYear(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        if (divisibleBy4 && (!divisibleBy100 || divisibleBy400)) {
            return true;
        } else {
            return false;
        }
    }

}

public class ExercismPractice {
    public static void main(String[] args) {
        Leap testYear = new Leap();
        System.out.println(testYear.isLeapYear(2015));
        System.out.println(testYear.isLeapYear(1970));
        System.out.println(testYear.isLeapYear(1996));
        System.out.println(testYear.isLeapYear(1960));

    }
}
