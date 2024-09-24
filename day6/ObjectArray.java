package day6;

public class ObjectArray {
    public static void main(String[] args) {

        Object a[] = {100,200,300,'A',"Hello",true};

        //I can print any object

        /*for (Object x:a)
        {
            System.out.println(x);
        }
         */


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
