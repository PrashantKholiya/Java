

public class P5_Task2{

    public static void main(String[] args) {
        Method obj = new Method();

        //Calling display method definition
        obj.display();
        System.out.println(obj.a);

    }

}

class Method {

    static int a = 10;
    /* Actual Method definition
     *
     * DataType methodName(DataType2 p1, DataType p2){
     *
     *   methodBody;
     *   return value; //if required
     *
     * }
     */

    static void display() {
        int b = 10;
        int a = 10;
        System.out.println(b);
        System.out.println(a);
    }

    int display2() {

        System.out.println(a);


        return a;
    }
}
