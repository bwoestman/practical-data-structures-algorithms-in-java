package ds.stack;

public class App
{
    public static void main(String[] args)
    {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String str)
    {
        int stackSize = str.length();

        Stack theStack = new Stack(stackSize);

        for (int i = 0; i < stackSize; i++)
        {
            theStack.push(str.charAt(i));
        }

        String result = "";

        while (!theStack.isEmpty())
        {
            result += theStack.pop();
        }

        return result;
    }
}
