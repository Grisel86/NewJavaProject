package day4;

public class IfElseCondition {

    public static void main(String[] args) {

        int person_age=18;

        /*if(person_age>=18)
        {
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");
        }*/

        if (person_age < 18) {
            System.out.println("not eligible for vote");
        } else {
            System.out.println("eligible for vote");
        }
    }
}
