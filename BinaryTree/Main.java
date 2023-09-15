package BinaryTree;


class BinaryTree {
    Node root;
    private void colorSwap(Node node){
        node.right.color = Node.Color.BLACK;
        node.left.color = Node.Color.BLACK;
        node.color = Node.Color.RED;

    }
    private Node leftSwap(Node node){
        Node leftChild = node.left;

        Node betweenChild = leftChild.right;
        leftChild.right = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Node.Color.RED;
        return leftChild;
    }
    private Node rightSwap(Node node){
        Node rightChild = node.right;

        Node betweenChild = rightChild.left;
        rightChild.left = node;
        node.right = betweenChild;
        rightChild.color = node.color;
        node.color = Node.Color.RED;
        return rightChild;
    }
    private Node rebalance(Node node){
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if ( result.right != null && result.right.color == Node.Color.RED &&(result.left == null ||
                    result.left.color == Node.Color.BLACK)){
                needRebalance = true;
                result = rightSwap(result);
            }
            if(result.left != null && result.left.color == Node.Color.RED && result.left.left != null &&
                    result.left.left.color == Node.Color.RED){
                needRebalance = true;
                result = leftSwap(result);

            }
            if(result.left != null && result.left.color == Node.Color.RED &&
                    result.right != null && result.right.color == Node.Color.RED){
                needRebalance = true;
                colorSwap(result);

            }

        }
        while (needRebalance);
        return  result;
    }
    class Node {
        Color color;
        int value;
        Node left;
        Node right;

        private enum Color{
            RED,BLACK
        }
    }

    public boolean find(int value) {
        return find(root, value);
    }

    public boolean find(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        if (node.value < value) {
            return find(node.right, value);
        } else {
            return find(node.left, value);
        }
    }

    public boolean insert(int value) {
        if (root == null) {
            root = new Node();
            root.value = value;
            root.color = Node.Color.BLACK;
            return true;
        }
        boolean result = insert(root, value);
        root = rebalance(root);
        root.color = Node.Color.BLACK;
        return result;

    }

    public boolean insert(Node node, int value) {
        if (node.value == value) {
            return false;
        }

        if (node.value < value) {
            if (node.right == null) {
                node.right = new Node();
                node.right.value = value;
                node.right.color = Node.Color.RED;

                return true;
            }
            boolean result = insert(node.right, value);
            node.right = rebalance(node.right);
            return result;
        } else {
            if (node.left == null) {
                node.left = new Node();
                node.left.value = value;
                node.left.color = Node.Color.RED;

                return true;
            }
            boolean result = insert(node.left, value);
            node.left=rebalance(node.left);
            return result;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        for (int i = 1; i <= 10; i++) {
            tree.insert(i);
        }

        int esfe = 0;
    }
}
