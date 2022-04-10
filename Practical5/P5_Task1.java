public class P5_Task1 {

    public static void main(String[] args) {

        CaO obj = new CaO();
        obj.display2();

        CaO.display();
    }

}

class CaO{
    int a = 10;
    static int b = 10;

    static void display() {

        int b = 10;

        b++;


        System.out.println(b);
    }

    void display2() {

        System.out.println(a);

    }
}
