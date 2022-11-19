package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if ((year > 0) && (month > 0 && month < 13)) {
            switch (month) {
                case 2:
                    boolean isYearLeap = isLeapYear(year);
                    String s = isYearLeap ? "29" : "28";
                    System.out.println(s);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31\n");
            }
        }else {
            System.out.println("invalid date");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}
