package day5;

public class WhileLoopWithoutCondition {
    public static void main(String[] args) {

        int i= 1;

        while(true)
        {
            System.out.println("Hello");
            i++;
            if (i==10)
            {
                break; //it[s going to print hello x times before 10
            }
        }
    }
}

