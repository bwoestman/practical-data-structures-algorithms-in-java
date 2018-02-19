package ds.linkedList;

public class App
{
    public static void main(String[] args)
    {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeD));
    }

    private static int listLength(Node aNode)
    {
        int length = 1;

        while (aNode.next != null)
        {
            length++;
            aNode = aNode.next;
        }
        return length;
    }
}
