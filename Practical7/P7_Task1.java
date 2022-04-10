import java.util.Scanner;
import java.util.Calendar;


public class P7_Task1 {

    public static void main(String[] args) {
        SwitchStatements obj = new SwitchStatements();
        obj.switchStatements();
    }

}
class SwitchStatements {
    void switchStatements() {

        int choice;
        System.out.println("Enter the choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Current year is: " + Calendar.getInstance().get(Calendar.YEAR));
                break;
            case 2:
                System.out.println("Current month is: " + Calendar.getInstance().get(Calendar.MONTH));
                break;
            case 3:
                System.out.println("Current day is: " + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                break;
            default:
                System.out.println("Not applicable");
                break;
        }

    }
}
