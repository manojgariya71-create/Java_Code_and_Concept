package hellowaorldcom.company;
import java.util.Scanner;
public class DayInMonth {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter month 1-12");
        int month=s.nextInt();
        System.out.println("Enter year :");
        int year=s.nextInt();
        int days;
        switch (month){
            case 1: //Jan
            case 3: //March
            case 5: //May
            case 7: //July
            case 8: //August
            case 10: //October
            case 12: //December
            days=31;
            break;

            case 4: //April
            case 6: //June
            case 9: //September
            case 11: //November
                days=30;
                break;

            case 2: //February
                if((year%400==0)||((year%4==0)&&(year%100!=0))){
                    days=29; //Leap year
                }else{
                    days=28;
                }
                break;
            default:
                System.out.println("Invalid month ! Please enter a value b/w 1 and 12");
                s.close();
                return;
        }
        System.out.println("Number of days in month "+month+" of year "+year+" is :"+days);
        s.close();
    }
}
