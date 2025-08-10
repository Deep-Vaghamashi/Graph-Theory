
import java.util.LinkedList;
import java.util.Queue;

class Node {

    Node Left;
    Node Right;
    int val;

    public Node(int var1) {
        this.val = var1;
    }
}

public class Tree_depth {

    public static int TreeDepth(Node tree) {
        if (tree == null) {
            return 0;
        }

        Queue<Node> demo = new LinkedList<>();
        demo.add(tree);
        int depth = 0;

        while (!demo.isEmpty()) {
            int queueSize = demo.size();

            for (int i = 0; i < queueSize; i++) {
                Node currNode = demo.poll();

                if (currNode.Left != null) {
                    demo.add(currNode.Left);
                }
                if (currNode.Right != null) {
                    demo.add(currNode.Right);
                }
            }
            depth++;
        }
        return depth;
    }

    public static int DepthRec(Node tree) {
        if (tree == null) {
            return 0;
        }

        int leftTree = DepthRec(tree.Left);
        int rightTree = DepthRec(tree.Right);

        return Math.max(leftTree, rightTree) + 1;
    }

    public static void main(String[] args) {
        Node tree = new Node(3);
        tree.Left = new Node(9);
        tree.Right = new Node(20);
        tree.Right.Left = new Node(15);
        tree.Right.Right = new Node(7);

        System.out.println("The maximum depth of the tree is: " + TreeDepth(tree));
        System.out.println("The maximum depth of the tree is: " + DepthRec(tree) + " from recursive");
    }
}
