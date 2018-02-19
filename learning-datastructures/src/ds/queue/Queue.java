package ds.queue;

import java.awt.*;

public class Queue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize)
    {
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long j)
    {
        if (rear == maxSize -1)
        {
            rear = -1;
        }

            rear++;
            queArray[rear] = j;
            nItems++;
    }

    public long remove()
    {
        long temp = queArray[front];
        front++;
        nItems--;
        if (front == maxSize)
        {
            front = 0;
        }
        return temp;
    }

    public long peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty()
    {
        return (nItems == 0);
    }

    public boolean isFull()
    {
        return (nItems == maxSize);
    }

    public void view()
    {
        System.out.print("[ ");
        for (long e : queArray)
        {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }
}
