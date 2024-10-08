package day6;
/*
1- Declare an array
2- add values into array
3- find length of an array
4- read single value from an array
5- read multiple values from an array
*/

public class TwoDimensionArray {
    public static void main(String[] args) {
        //declaring array
        //Approach1
        /*int[][] a = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;
         */

        //Approach2
        int a [][]  = {{100,200,},
                {300,400,},
                {500,600,}
        }; //store data in 2 dimension

        //Find size of an array
        System.out.println("Length of rows " + a.length);
        System.out.println("Length of columns " + a[0].length);

        //read single value from an array
        //System.out.println(a[2][1]); //600 in this example

        //normal for loop
        /*for(int r=0;r<=a.length-1;r++) //0
        {
            for(int c=0;c<=a[r].length-1;c++) //0
            {
                System.out.print(a[r][c] + "  "); //100,200... This is concatenation of space of data
            }
            System.out.println();
        }
        */

        //enhanced for loop
        for(int[] arr :a)
        {
            for (int x:arr)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
