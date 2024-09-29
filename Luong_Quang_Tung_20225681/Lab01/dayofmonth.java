//6.4_If_else:)))
import java.util.Scanner;
public class dayofmonth {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int year;
        String month;
        do{
            System.out.println("Enter the year: ");
            year=keyboard.nextInt();
            keyboard.nextLine();
            if(year<1000){
                System.out.println("Invalid year! Please re-enter");
            }
        } while(year<1000);
        while(true){
            System.out.println("Enter the month: ");
            month=keyboard.nextLine();
            if(month.equals("January")||month.equals("Jan")||month.equals("Jan.")||month.equals("1")
            ||month.equals("March")||month.equals("Mar")||month.equals("Mar.")||month.equals("3")
            ||month.equals("May")||month.equals("5")
            ||month.equals("July")||month.equals("Jul")||month.equals("7")
            ||month.equals("August")||month.equals("Aug.")||month.equals("Aug")||month.equals("8")
            ||month.equals("October")||month.equals("Oct.")||month.equals("Oct")||month.equals("10")
            ||month.equals("December")||month.equals("Dec.")||month.equals("Dec")||month.equals("12")){
                System.out.println("31 days");
                break;
            }
            else if(month.equals("February")||month.equals("Feb")||month.equals("Feb.")||month.equals("2")){
                if(year%4==0){
                    if(year%100==0&&year%400!=0){
                        System.out.println("28 days");
                        break;
                    }
                    else{
                        System.out.println("29 days");
                        break;
                    }
                }
                else{
                    System.out.println("28 days");
                    break;
                }
            }
        
            else if(month.equals("April")||month.equals("Apr")||month.equals("Apr.")||month.equals("4")||
            month.equals("June")||month.equals("Jun")||month.equals("6")||
            month.equals("September")||month.equals("Sept.")||month.equals("Sept")||month.equals("9")||
            month.equals("November")||month.equals("Nov.")||month.equals("Nov")||month.equals("11")){
                System.out.println("30 days");
                break;
            }
            else{
                System.out.println("Invalid month! Please re-enter");
            }
        }
        keyboard.close();    
    }
}
