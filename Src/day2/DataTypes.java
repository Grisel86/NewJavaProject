package day2;

public class DataTypes {
    public static void main(String[] args) {

        //numeric data types

        int a =100, b =200;
        System.out.println( "The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The sum of a and b is: " + (a+b));

        byte by = 123;
        System.out.println(by);

        short sh = 3232;
        System.out.println(sh);

        long l = 1212131331L; // l or L
        System.out.println(l);

        //Decimal numbers - float,double
        float item_price = 3.14f; // f or F
        System.out.println(item_price);

        double dbl = 121211.32323;
        System.out.println(dbl);

        char grad= 'A';
        System.out.println(grad);

        String name = "Gri";
        System.out.println(name);

        //char ch = 'ABC'; //invalid
        //String ch = 'ABC'; //invalid
        //String ch = 'A'; //invalid

        String ch = "A"; //VALID
        System.out.println(ch);

        boolean bl = Boolean.parseBoolean("true");
        boolean bl = "false";
        System.out.println();
    }
}
