package day4;
/*
a>b and a>c --- a is the largest
b>a and b>c --- b is the largest
c>a and c>b --- c is the largest
 */
public class LargestOf3Numbers {
    public static void main(String[] args) {

        int a =10, b=20, c=30;
        if (a>b && a>c)
        {
            System.out.println("a is the largest number");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is the largest number");
        }
        else {
            System.out.println("c is the largest number");
        }
    }
}
