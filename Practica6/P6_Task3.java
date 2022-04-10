

public class P6_Task3 {

    public static void main(String[] args) {

        StringInJava obj=new StringInJava();
        obj.StringDefinition();
        obj.charAndString();

    }

}

class StringInJava
{
    void StringDefinition() {

        String s="Hello There!";
        String s1=new String("jdckhbsk");

        System.out.println("String s is = "+s);

        //Get length of a /string
        System.out.println("Length of String s is : "+s.length());

        //loop through a string!
        System.out.println("Character");
        for(int i=0;i<s.length();i++) {
            System.out.println(s.charAt(i));
        }

        String first="Prashant";
        String second="kholiya";

        //Add two Strings
        String third=first+second;
        System.out.println("Added String:"+third);

        //compare two strings
        boolean result1=first.equals(second);
        System.out.println("Wether Strings are Equal:"+result1);



        String fourth="Akash";
        String fifth=new String("Chauhan");
    }
    /*
     * Characters Array are mutable but Strings are not
     */

    void charAndString() {

        char[] ch= {'H','e','l','l','o',' ','T','h','e','r','e','!'};
        char[] ch2= {'!','!'};

        System.out.println(ch);

        for(int i=0;i<ch.length;i++) {
            System.out.println(ch[i]);
        }

        String s1=new String(ch);
        System.out.println(s1);


        ch[0]='h';


        s1=s1+'a';
        String s2="GEEKS";
        char[] ch4=s2.toCharArray();

        //char array to String
        char[] a2= {'A','K','A'};
        String s3=new String(a2);
    }

}
