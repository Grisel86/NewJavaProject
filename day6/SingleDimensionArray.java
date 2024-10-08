package day6;
/*
1- Declare an array
2- add values into array
3- find length of an array
4- read single value from an array
5- read multiple values from an array
*/


public class SingleDimensionArray {
    public static void main(String[] args)
    {
        //declaring array
        //Approach1
        /*int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
         */

        //Approach2
        int a[] = {100,200,300,400,500};

        //find length of an array
        System.out.println("Length of an array is: " + a.length);

        //read single value from an array
        //System.out.println(a[4]); //here 4 is index

        //reading all the values from array

        //Normal for loop - to know how the quantity of numbers that I have

        /*for (int i=0;i<a.length;i++)  // i<=4  i<5  i<a.length-1  i<a.length
        {
            System.out.println(a[i]); //100 200 300 400 500
        }
         */

        //enhanced for loop/ for..each loop
        for(int x:a)
        {
            System.out.println(x); //100 200 300 ...
        }

    }
}
