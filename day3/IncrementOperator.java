package day3;

public class IncrementOperator {
    public static void main(String[] args) {

        // ++ is called increment operator
        //case1
        /*int a = 10;
        System.out.println(a);

        a++;       //It is the same as: a= a+1;
        System.out.println(a); //11
         */

        //case2 - post increment
        //int a = 10;
        // int res = a++;
        // System.out.println(res); //10 because I assign a new var named res and increment to that one, not the first, it's
        // //post incrementation
        // System.out.println(a);

        //case3 - pre increment
        int a =10;
        int res = ++a;
        System.out.println(res); //11
        System.out.println(a); //11
    }
}
