package algo.recursion;

public class App
{
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        int i = 0;
        int x = 5;

        System.out.println(anotherRecursiveLinearSearch(A, i, x));
    }

    public static void reduceByOne(int n)
    {
        if (n >= 0)
        {
            reduceByOne(n - 1);
        }

        System.out.println("Completed call: " + n);
    }

    public static int recursiveLinearSearch(int[] A, int i, int x)
    {
        if (i > A.length - 1) return -1;
        else if (A[i] == x) return i;
        else return recursiveLinearSearch(A, i + 1, x);
    }

    public static int anotherRecursiveLinearSearch(int[] A, int i, int x)
    {
        if (A[i] == x) return i;
        else if (i > A.length - 1) return -1;
        else return anotherRecursiveLinearSearch(A, i + 1, x);
    }
}
