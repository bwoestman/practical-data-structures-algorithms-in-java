package adt;

public class Counter
{
    private int value = 0;
    private String name = null;

    public Counter(String name)
    {
        this.name = name;
    }

    public void increment()
    {
        value++;
    }

    public int getCurrentValue()
    {
        return value;
    }

    public String toString()
    {
        return name + "; " + value;
    }
}
