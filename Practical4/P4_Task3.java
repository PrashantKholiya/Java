import java.util.Scanner;
public class P4_Task3 {

    public static void main(String[] args) {

        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);


        String firstName = myObj1.next();
        System.out.println("Name is: " + firstName + "\n");

        String name = myObj2.nextLine();
        String name2 = myObj2.nextLine();

        System.out.println("Name is: " + name + "\n");
        System.out.println("Name is: " + name2 + "\n");

        boolean b = myObj2.nextBoolean();
        System.out.println(b + "\n");

        myObj1.close();
        myObj2.close();
    }

}