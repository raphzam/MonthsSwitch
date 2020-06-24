import java.util.Scanner;

public class MonthsSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Number of days in the month:");
        int userDays = input.nextInt();

        switch (userDays){
            case 31: System.out.println("January March May July August December");
            break;

            case 28: System.out.println("February");
            break;

            case 30: System.out.println("April June September October November");
            break;

            default: System.out.printf("No months have exactly %d days\n", userDays);

        }
    }
}
