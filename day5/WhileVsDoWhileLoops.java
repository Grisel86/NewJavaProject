package day5;

public class WhileVsDoWhileLoops {
    public static void main(String[] args) {

        /*int i = 10;
        while (i <= 5)
        {
            System.out.println(i);
            i++;
        }*/

        int i = 10;
        do {
            System.out.println(i); //10
            i++;     //11
        } while (i <= 5);
//This loop will execute the code block once,
// before checking if the condition is true, then it
// will repeat the loop as long as the condition is true.
        }
    }
