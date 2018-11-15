public class _632_BinaryTreeMaximumNode {
    public int val;
    public _632_BinaryTreeMaximumNode left, right;

    public _632_BinaryTreeMaximumNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public static _632_BinaryTreeMaximumNode maxNode(_632_BinaryTreeMaximumNode root) {
        if (root==null)
            return root;
        _632_BinaryTreeMaximumNode max = root;
        _632_BinaryTreeMaximumNode node = null;
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
        _632_BinaryTreeMaximumNode one = new _632_BinaryTreeMaximumNode(1);
        _632_BinaryTreeMaximumNode two = new _632_BinaryTreeMaximumNode(-5);
        _632_BinaryTreeMaximumNode three = new _632_BinaryTreeMaximumNode(2);
        _632_BinaryTreeMaximumNode four = new _632_BinaryTreeMaximumNode(0);
        _632_BinaryTreeMaximumNode five = new _632_BinaryTreeMaximumNode(3);
        _632_BinaryTreeMaximumNode six = new _632_BinaryTreeMaximumNode(-4);
        _632_BinaryTreeMaximumNode seven = new _632_BinaryTreeMaximumNode(-5);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;
        _632_BinaryTreeMaximumNode theMaxNode = maxNode(one);
        System.out.println(theMaxNode.val);
    }
}
