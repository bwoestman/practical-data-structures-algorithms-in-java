package ds.singlylinkedlist;

public class SinglyLinkedList
{
    private Node first;
    private Node last;

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void insertFirst(int data)
    {
        Node newNode = new Node();

        newNode.data = data;

        if (isEmpty())
        {
            last = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data)
    {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty())
        {
            first = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst()
    {
        int temp = first.data;

        if (first.next == null)
        {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList()
    {
        System.out.println("List (first --> last) ");

        Node current = first;

        current.displayNode();

        while (current.next != null)
        {
            current = current.next;
            current.displayNode();
        }
    }
}
