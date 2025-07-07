
class Node {

    Node Left, Right;
    int val;

    public Node(int val) {
        this.val = val;
    }

}

public class Mirror {

    public static boolean IsMirror(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }

        return IsMirror(a.Left, b.Right) && IsMirror(a.Right, b.Left);
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.Left = new Node(2);
        tree.Left.Left = new Node(3);
        tree.Left.Right = new Node(4);

        tree.Right = new Node(2);
        tree.Right.Left = new Node(4);
        tree.Right.Right = new Node(3);

        System.out.println(IsMirror(tree.Left, tree.Right));
    }
}
