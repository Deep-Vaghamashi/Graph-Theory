
class Node {

    Node Left;
    Node Right;
    int val;

    public Node(int var1) {
        this.val = var1;
    }
}

public class Tree_leaf {

    public static void TreeLeaf(Node tree) {
        if (tree == null) {
            System.out.println("Tere are no tree present.");
            return;
        } else if (tree.Left == null && tree.Right == null) {
            System.out.println("The leaf node is root so value: " + tree.val);
        } else {
            TreeLeaf(tree.Left);
            TreeLeaf(tree.Right);
        }
    }

    public static void main(String[] args) {
        Node tree = new Node(3);
        tree.Left = new Node(9);
        tree.Right = new Node(20);
        tree.Right.Left = new Node(15);
        tree.Right.Right = new Node(7);

        TreeLeaf(tree);
    }
}
