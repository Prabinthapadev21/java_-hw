import java.util.Scanner;
public class SwitchDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice from 1-7 to display Weeks..");
        System.out.println("Enter your choice to display the Weeks..");
        int choice=sc.nextInt();
        display(choice);
    }
    public static void display(int choice)
    {
        switch(choice)
        {
            case 1:
                System.out.println("Sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
            case 6:
                System.out.println("Friday.");
                break;
            case 7:
                System.out.println("Saturday.");
                break;
            default:
                System.out.println("Please enter the value from 1-7..");
        }
    }
}