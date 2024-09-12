package day6;
/*
1)Declare an array
2) Add values into the array
3) Find length of an array
4) Read single value from an array
5) Read multiple values from an array
 */

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //Approach1
        /*int a[] =new int[5];

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
         */
        //Approach2
        int a[]= {100, 200, 300, 400, 500};
        //find the length of an array
        System.out.println("The length of the array a is : " + a.length);

        //read single value from an array
        //System.out.println(a[4]); //here 4 is the index

        //read all the values from an array

        //Normal for loop
        /*for (int i = 0; i <= a.length; i++) // i<=4 i<=5 i<=a.length-1  i<=a.length
        {
            System.out.println(a[i]); //100 200 300 400 500
        }
         */
        //enhanced for loop/ for .. each loop
        for(int x:a)
        {
            System.out.println(x);
        }

    }

}


