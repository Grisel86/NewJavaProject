package day3;

public class OperatorsDemo {
    public static void main(String[] args) {
        //1)Arithmetic operators
        int a= 20, b=10;

        int result= a+b;
        System.out.println("The sum of a and b is :" + result);
        System.out.println("The sum of a and b is: "+(a+b));
        System.out.println("Diff of a and b is: "+(a-b));
        System.out.println("Mult of a and b is: "+(a*b));
        System.out.println("Div of a and b is: "+(a/b));
        System.out.println("Module division of a and b is: "+(a%b));

        //2)Relacional/comparison operators > >= < <= != ==
        //Always returns boolean value - true/false

        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
        b =20;
        System.out.println(a<=b); //true
        System.out.println(a>=b); //true

        System.out.println(a!=b); //false
        System.out.println(a==b); //true

        //What is the dif between == and = ? that the == is a comparisson operator and = is and assignment operator

        boolean res = a > b;
        System.out.println(res);

        //3) Logical operators && (AND Operator ( && ) – if( a && b ) [if true execute else don’t])
        // || OR Operator ( || ) – if( a || b) [if one of them is true to execute else don’t]
        // ! NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]
        // returns boolean value -true/false
        //works between 2 boolean values

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true

        boolean b1= 10>20;
        System.out.println(b1); //false

        boolean b2= 20>10;
        System.out.println(b2); //true

        System.out.println(b1&&b2); //false
        System.out.println(b1||b2); //true

        System.out.println((10<20) && (20>10)); //true
        System.out.println((10==20) && (10==10)); //false

    }
}
