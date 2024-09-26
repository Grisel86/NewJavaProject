package day7;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args) {

        int[] a = {100,200,300,400,500};
        int num = 400;
        int count = 0;


        //this will tell us how many times the array is duplicated
        for (int value:a)
        {
            if(value == num)
            {
                count ++; //1 2 3 4
            }
        }
        System.out.println(count);
    }
}
