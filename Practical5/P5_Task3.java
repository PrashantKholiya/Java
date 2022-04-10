public class P5_Task3{

    public static void main(String[] args) {

        Cons obj = new Cons();

        Cons obj1 = new Cons(1);

        System.out.println(obj.a);
        System.out.println(obj1.a);
    }

}


class Cons {

    int a;

	/*
	  ClassName(Constructor Parameters){
	      All the class and Instance variables can be initialized here!
	  }
	 */

    Cons(){
        a = 10;
    }

    Cons(int a){
        this.a = a;
    }

    void display() {

        int b = 10;

        System.out.println(a);
        System.out.println(b);
    }

    int display2() {

        System.out.println(a);

        return a;
    }
}
