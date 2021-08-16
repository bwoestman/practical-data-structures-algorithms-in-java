package data.bst;

public class App {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10, "10");
        bst.insert(4, "04");
        bst.insert(20, "20");
        bst.insert(2, "02");
        bst.insert(5, "05");
        bst.insert(18, "18");
        bst.insert(22, "22");
        bst.insert(8, "08");
        bst.insert(17, "17");
        bst.insert(19, "19");
        bst.insert(21, "21");
        bst.insert(24, "24");
        bst.insert(9, "09");
        bst.insert(33, "33");

        bst.displayTree();
    }
}
