package day5;

public class WhileLoopDemo {
    public static void main(String[] args) {

        //Examp1: print1 ....10 numbers
        /*
        int i = 1; //Initialization
        while (i <= 10) //Condition
        {
            System.out.println(i);
            i++; //Incrementation
        }
         */

        //Examp2: print Hello message 10 times
        /*
        int i=1;

        while(i<=10)
        {
            System.out.println("Hello");
            i++;
            */

        //Examp3 print even numbers between 1...10

        //aproach 1
        /* int i = 2;
        while(i<=10)
        {
            System.out.println(i);
            i+=2;  // i=i+2
        }
         */

        //aproach 2
        /*int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }*/

        //Examp4   1.........10
        /*int i = 1;
        while (i <= 10)
        {
            if (i % 2 == 0)
            {
                System.out.println(i + " Even");
            }
            else
            {
                System.out.println(i + " Odd");
            }
            i++;
        }*/

        //Examp5 print 10 ......1
        /*
        int i=10;
        while(i>0)
        {
            System.out.println(i);
            i--;
        }*/

    }
}

