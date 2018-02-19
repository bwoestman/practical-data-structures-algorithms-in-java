package algo.linearsearch;

public class App
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(linearSearch(a, 1));
        System.out.println(linearSearch(a, 2));
        System.out.println(linearSearch(a, 3));
        System.out.println(linearSearch(a, 4));
        System.out.println(linearSearch(a, 5));
        System.out.println(linearSearch(a, 0));
        System.out.println(linearSearch(a, 6));
    }

    public static int linearSearch(int[] a, int x)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == i)
            {
                return i;
            }
        }
        return -1;
    }
}
