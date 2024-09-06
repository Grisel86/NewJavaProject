package day3;

public class TernaryOperator {
    public static void main(String[] args) {

        //var=exp ? result1 : result2;

        //Example1
        /*int a=200, b=100;
        int x = (a>b)?a:b;
        System.out.println(x);
        */

        //Example2
        /*
        int x =(1==1)?100:200; //it's going to print 100 if true and 200 if false
        System.out.println(x);
        */

        //int x=(1==2)?200:100;
        //System.out.println(x);

        //Example3
        int person_age=30;
        String res =(person_age>=18)?"Eligible":"Not Eligible";
        System.out.println(res);

    }
}
