package day7;

public class SearchingElementInArray {
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int search_element = 4;

        for(int i = 0;i<a.length;i++)
        {
            if (a[i]==search_element)
            {
                System.out.println("Element found");
                break;
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }
}
