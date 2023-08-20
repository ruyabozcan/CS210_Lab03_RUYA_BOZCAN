// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING
public class Problem_3
{
    static int arr[] = { 1, 2, 3, 4, 5 };
    static int findSum(int a[], int N)
    {
        if (N <= 0)
            return 0;
        return (findSum(a, N - 1) + a[N - 1]);
    }

    public static void main(String[] args)
    {
        System.out.println(findSum(arr, arr.length));
    }
}

//    Time Complexity; O(n)
//    Here n is the number of elements in the array.
//
//        Auxiliary Space: O(n)
//
//        The extra space is used in recursion call stack.

// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING