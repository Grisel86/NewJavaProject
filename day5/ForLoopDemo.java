package day5;

public class ForLoopDemo {
    public static void main(String[] args) {

        //1 .........10 numbers

        /*for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }*/

        //1 ....10 even numbers
        /*for(int i=2;i<=10;i+=2)
        {
            System.out.println(i);
        }*/

        //Example3 1....10
        /*for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i + " Even");
            }
            else
            {
                System.out.println(i + " Odd");
            }
        }
         */

        //Example 4 10.......1 desc
        for(int i =10;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
