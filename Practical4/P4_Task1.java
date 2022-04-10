public class P4_Task1 {

    public static void main(String[] args) {
        Statements obj=new Statements();

        obj.DecisionMakingStatements();
        obj.LoopStatements();
        obj.JumpStatements();
    }
}

class Statements
{
    void DecisionMakingStatements()
    {
        int x=10;
        int y=12;
        if(x+y<10)
        {

            System.out.println("x+y is less than 10");
        }
        else
        {
            System.out.println("x+y is greater than 10");
        }
        int num=5;
        switch(num)
        {
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println(num);

        }

    }
    void LoopStatements()
    {
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of first 10 natural number is" + sum);
        String[] names= {"Java","hello","hi"};
        System.out.println("Printing the contents of array names:\n");

        for(String name:names)
        {
            System.out.println(name);

        }
        int i=0;
        System.out.println("Printing the list of first 10 even numbers");
        while(i<=9)
        {
            System.out.println(i*2);
            i++;

        }
        i=0;
        System.out.println("Printing the list of first 10 even numbers\n");
        do {
            System.out.println(i*2);
            i++;
        }while(i<=9);
    }
    void JumpStatements()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        for(int i=0;i<=5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}