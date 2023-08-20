// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING


public class Problem_1
{
    public static void main(String[] args)
    {
        int arr[] = {23, 45, 65, 3, 9};
        int x = 3;

        //Method call to find x
        int index = recursionSearch(arr, 0, arr.length-1, x);

        if (index != -1)
        {
            System.out.println("Element " + x + " is present at index " + index);
        }
        else
        {
            System.out.println("Element " + x + " is not present");
        }
    }
    static int recursionSearch(int arr[], int a, int b, int c)
    {
        if (b < a)
        {
            return -1;
        }
        if (arr[a] == c)
        {
            return a;
        }
        if (arr[b] == c)
        {
            return b;
        }
        return recursionSearch(arr, a+1, b-1, c);
    }
}

// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING
