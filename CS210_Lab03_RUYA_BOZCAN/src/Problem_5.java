// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING

public class Problem_5
{
    public static boolean findSum(int[] arr, int k)
    {
        return findSumHelper(arr, k, 0, arr.length - 1);
    }

    private static boolean findSumHelper(int[] arr, int k, int left, int right)
    {
        if (left >= right)
        {
            return false;
        }

        int sum = arr[left] + arr[right];
        if (sum == k)
        {
            return true;
        }
        else if (sum < k)
        {
            return findSumHelper(arr, k, left + 1, right);
        }
        else
        {
            return findSumHelper(arr, k, left, right - 1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 7, 9, 12};
        int k = 11;
        boolean result = findSum(arr, k);
        System.out.println(result); // prints true

    }
}

//The time complexity of the given algorithm is O(n), where n is the number of elements in the input array.
// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING