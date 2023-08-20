// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING

public class Problem_4 {
    public static boolean hasSumOfTwoIntegers(int[] A, int i) {
        if (i <= 1)
        {
            return false;
        }

        for (int j = i - 2; j >= 0; j--)
        {
            int target = A[i] - A[j];
            if (target < A[0])
            {
                break;
            }
            if (binarySearch(A, target, 0, j - 1))
            {
                return true;
            }
        }
        return hasSumOfTwoIntegers(A, i - 1);
    }

    public static boolean binarySearch(int[] A, int target, int lo, int hi) {
        if (lo > hi)
        {
            return false;
        }
        int mid = (lo + hi) / 2;
        if (A[mid] == target)
        {
            return true;
        }
        else if (A[mid] < target)
        {
            return binarySearch(A, target, mid + 1, hi);
        }
        else
        {
            return binarySearch(A, target, lo, mid - 1);
        }
    }

    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        boolean hasSum = hasSumOfTwoIntegers(A, A.length - 1);
        System.out.println(hasSum);     // Output: true

        int[] B = {1, 2, 4, 8, 16};
        hasSum = hasSumOfTwoIntegers(B, B.length - 1);
        System.out.println(hasSum);     // Output: false
    }

}

// RUYA BOZCAN
// 200201044
// CS210 LAB 03
// COMPUTER ENGINEERING