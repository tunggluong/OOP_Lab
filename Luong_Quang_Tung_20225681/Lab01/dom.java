//6.4_Map
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class dom {
    private static final Map<String, Integer> monthDays = new HashMap<>();
    static {
        monthDays.put("January", 31);
        monthDays.put("Jan", 31);
        monthDays.put("Jan.", 31);
        monthDays.put("1", 31);
        monthDays.put("February", 28);
        monthDays.put("Feb", 28);
        monthDays.put("Feb.", 28);
        monthDays.put("2", 28);
        monthDays.put("March", 31);
        monthDays.put("Mar", 31);
        monthDays.put("Mar.", 31);
        monthDays.put("3", 31);
        monthDays.put("April", 30);
        monthDays.put("Apr", 30);
        monthDays.put("Apr.", 30);
        monthDays.put("4", 30);
        monthDays.put("May", 31);
        monthDays.put("5", 31);
        monthDays.put("June", 30);
        monthDays.put("Jun", 30);
        monthDays.put("6", 30);
        monthDays.put("July", 31);
        monthDays.put("Jul", 31);
        monthDays.put("7", 31);
        monthDays.put("August", 31);
        monthDays.put("Aug", 31);
        monthDays.put("Aug.", 31);
        monthDays.put("8", 31);
        monthDays.put("September", 30);
        monthDays.put("Sept", 30);
        monthDays.put("Sept.", 30);
        monthDays.put("9", 30);
        monthDays.put("October", 31);
        monthDays.put("Oct", 31);
        monthDays.put("Oct.", 31);
        monthDays.put("10", 31);
        monthDays.put("November", 30);
        monthDays.put("Nov", 30);
        monthDays.put("Nov.", 30);
        monthDays.put("11", 30);
        monthDays.put("December", 31);
        monthDays.put("Dec", 31);
        monthDays.put("Dec.", 31);
        monthDays.put("12", 31);
    }
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int year=getYear(keyboard);
        String month=getMonth(keyboard);
        int days=calculateDaysInMonth(month, year);
        if (days!=-1) {
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid month! Please re-enter");
        }
    }
    private static int getYear(Scanner keyboard) {
        int year;
        do {
            System.out.print("Enter the year: ");
            year = keyboard.nextInt();
            keyboard.nextLine();
            if (year < 1000) {
                System.out.println("Invalid year! Please re-enter");
            }
        } while (year < 1000);
        return year;
    }
    private static String getMonth(Scanner keyboard) {
        String month;
        while (true) {
            System.out.print("Enter the month: ");
            month = keyboard.nextLine();
            if (monthDays.containsKey(month)) {
                return month;
            } else {
                System.out.println("Invalid month! Please re-enter");
            }
        }
    }
    private static int calculateDaysInMonth(String month, int year){
        if(month.equals("February")||month.equals("Feb.")||month.equals("Feb")||month.equals("2")){
            if((year%4==0&&year%100!=0)||(year%400==0)){
                return 29;
            }
            else return 28;
        }
        else return monthDays.get(month);
    }
}