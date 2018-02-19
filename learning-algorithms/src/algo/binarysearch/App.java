package algo.binarysearch;

public class App
{
    public static void main(String[] args)
    {
        int[] A = {0, 1, 2, 3, 4, 5};
        int p = 0;
        int r = 5;
        int x = 5;

        System.out.println(anotherBinarySearch(A, x));
    }

    public static int binarySearch(int[] a, int x)
    {
        int q;
        int p = 0;
        int r = a.length - 1;

        while (p <= r)
        {
            q = (p + r) / 2;

            if (a[q] == x) return q;
            else if (a[q] > x) r = q - 1;
            else p = q + 1;
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] A, int p, int r, int x)
    {
        System.out.println("[ " + p + "..." + r + " ]");
        if (p > r) return -1;
        else
        {
            int q = (p + r) / 2;
            if (A[q] == x) return q;
            else if (A[q] > x)
            {
                return recursiveBinarySearch(A, p, q - 1, x);
            }
            else
            {
                return recursiveBinarySearch(A, q + 1, r, x);
            }
        }
    }

    public static int anotherBinarySearch(int[] A, int x)
    {
        int p = 0;
        int r = A.length - 1;
        while (p <= r)
        {
            int q = (p + r) / 2;
            if (A[q] == x) return x;
            else if (A[q] < x) p = q + 1;
            else r = q - 1;
        }
        return -1;
    }

    public static int anotherRecursiveBinarySearch(int[] A, int p, int r, int x)
    {
        return 0;
    }
}
