package Naive;

public class _0632_BinaryTreeMaximumNode {
    public int val;
    public _0632_BinaryTreeMaximumNode left, right;

    public _0632_BinaryTreeMaximumNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public static _0632_BinaryTreeMaximumNode maxNode(_0632_BinaryTreeMaximumNode root) {
        if (root==null)
            return root;
        _0632_BinaryTreeMaximumNode max = root;
        _0632_BinaryTreeMaximumNode node = null;
        if (root.left != null) {
            node = maxNode(root.left);
            if (node.val > max.val)
                max = node;
        }
        if (root.right != null) {
            node = maxNode(root.right);
            if (node.val > max.val)
                max = node;
        }
        return max;
    }

    public static void main(String[] args) {
        _0632_BinaryTreeMaximumNode one = new _0632_BinaryTreeMaximumNode(1);
        _0632_BinaryTreeMaximumNode two = new _0632_BinaryTreeMaximumNode(-5);
        _0632_BinaryTreeMaximumNode three = new _0632_BinaryTreeMaximumNode(2);
        _0632_BinaryTreeMaximumNode four = new _0632_BinaryTreeMaximumNode(0);
        _0632_BinaryTreeMaximumNode five = new _0632_BinaryTreeMaximumNode(3);
        _0632_BinaryTreeMaximumNode six = new _0632_BinaryTreeMaximumNode(-4);
        _0632_BinaryTreeMaximumNode seven = new _0632_BinaryTreeMaximumNode(-5);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;
        _0632_BinaryTreeMaximumNode theMaxNode = maxNode(one);
        System.out.println(theMaxNode.val);
    }
}
