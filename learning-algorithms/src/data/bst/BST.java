package data.bst;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BST {

    private Node root;

    public void insert(int key, String value) {

        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {

            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) { // It's parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }

                }

            }


        }

    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {

        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        // Searching to find the node with the key to delete
        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if (currentNode == null) {
                return false;
            }
        }

        // if node has one child

        // if node has 2 children (tricky)


        // found the node
        Node nodeToDelete = currentNode;

        // if node is a leaf
        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {

            //
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }

        }
        // if node has one child that is on the left
        else if (nodeToDelete.rightChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        }
        // if node has one child that is on the right
        else if (nodeToDelete.leftChild == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        }
        // if node has 2 children (tricky)
        else {

            Node successor = getSuccessor(nodeToDelete);

            // connect parent of nodeToDelete to successor instead
            if (nodeToDelete == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }

            successor.leftChild = nodeToDelete.leftChild;


        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; // go to the right child

        while (current != null) { // start going left down the tree until node has no left child
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        // if successor not a right child
        if (successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;

    }

    public void displayTree() {
        Queue<Node> fullTree = breadthFirstNodes(root);
        double height = Math.floor(Math.log(fullTree.size()) / Math.log(2));
        for (int i = 0; i <= height; i++) {
            int j = 0;
            while (j < Math.pow(2, i)) {
                String spacer = IntStream.range(0, ((int) height - i) + (int) Math.pow(2, height - 1 - i))
                    .mapToObj(h -> " ").collect(Collectors.joining(""));
                Node node = null;
                if (!fullTree.isEmpty()) {
                    node = fullTree.remove();
                }
                if (node == null) {
                    System.out.print(spacer + "--");
                } else {
                    System.out.print(spacer + node.value);
                }
                j++;
            }
            System.out.println();
        }
    }

    public Queue<Node> breadthFirstNodes(Node root) {
        LinkedList<Node> nodes = new LinkedList<>();
        LinkedList<Node> result = new LinkedList<>();
        nodes.add(root);

        return breadthFirstNodes(nodes, result);
    }

    public Queue<Node> breadthFirstNodes(Queue<Node> nodes, Queue<Node> results) {
        if (nodes.isEmpty() || nodes.stream().allMatch(Objects::isNull)) {
            return results;
        }

        Node node = nodes.remove();
        results.add(node);

        if (node != null && node.leftChild != null) {
            nodes.add(node.leftChild);
        } else {
            nodes.add(null);
        }
        if (node != null && node.rightChild != null) {
            nodes.add(node.rightChild);
        } else {
            nodes.add(null);
        }

        breadthFirstNodes(nodes, results);

        return results;
    }
}

    /*
    Output:
                10
           04       20
        02    05    18    22
      --  --  --  08  17  19  21  24
    --------------09--------------33

    Output starts to get distorted with more nodes but for our limited set it looks pretty good.
    */


