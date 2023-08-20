// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING


public class Problem_2 {
    public static void main(String[] args)
    {
        int arr[] = {24, 68, 108, 4, 6};
        System.out.println(checkEven( arr, arr.length - 1 ));
    }
    public static boolean isEven(int i)
    {
        if(i % 2 == 0)
        {
            return true ;
        }
        return false ;
    }
    public static int checkEven(int[] a, int n)
    {
        if (n < 0)
        {
            return -1;
        }
        else
        {
            System.out.println((isEven(a[n])));
            return checkEven(a, n-1);
        }
    }
}

// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING