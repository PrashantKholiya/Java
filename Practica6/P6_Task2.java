public class P6_Task2 {

    public static void main(String[] args) {

    }

    int array1[];

    int[] array2;
    int []array3;


    array1 = new int[6];
    for(int i=0;i<array1.length;i++)
    {array1[i]=i;}

    int array4[]= {33,3,4,5};

    arrayAsParameter(array4);
    arrayAsParameter(new int[] {33,3,4,5});

    int [] array5=arrayAsReturnType();
	        System.out.println("\n");
	        System.out.println("Element converted into String:");
	        System.out.println(array5.toString());
	        System.out.println("\n");

    //ArrayTIndexOutOfBoundsException
    int arr[]= {50,60,70,80};
	        System.out.println("Element of Array(i):");
	        for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
	        System.out.println("\n");

    //Multidimensional Array In Java
    int[][] arr6=new int[3][3];//3 row and 3 column

	        System.out.println("Element inside the multidimensional array:");
	        for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            System.out.print(arr6[i][j]+" ");
        }System.out.println("\n");
    }

    int counter=0;

	        for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            counter++;
            arr6[i][j]=counter;
        }
    }

	        System.out.println("Element inside the multidimensional array:");
	        for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            System.out.print(arr6[i][j]+" ");
        }
        System.out.println("\n");
    }

}

    static void arrayAsParameter(int arr[]) {//declare empty array as parameter
        System.out.println("\n");
        System.out.println("Element of array via parameters:");
        for(int i=0;i<arr.length;i++) // length is the property of array
            System.out.print(arr[i]+" ");
    }


    //Returning Array from the Method
    static int[] arrayAsReturnType() {
        int array4[]= {33,3,4,5};

        return array4;
    }
}
}
