package day4;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int weekno=1;
        switch (weekno) {
                case 1 : System.out.println("Sunday");break; // If I don´t put a break here there is going to print both Sunday and Monday
                case 2 : System.out.println("Monday");break;
                case 3 : System.out.println("Tuesday");break;
                case 4 : System.out.println("Wednesday");break;
                case 5 : System.out.println("Thursday");break;
                case 6 : System.out.println("Friday");break;
                case 7 : System.out.println("Saturday");break;
                default : System.out.println("Invalid day of the week");break;
        }
    }
}
