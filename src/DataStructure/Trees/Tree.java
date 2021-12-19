package DataStructure.Trees;

public class Tree {
    private TreeNode root;
    private Tree_Challenge_1 challenge;

    public void insert(int value) {
        if (root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void traverseInOrder() {
        if (root != null)
            root.traverseInOrder();
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);

        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null)
            return null;

        if (value < subtreeRoot.getData())
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        else if (value > subtreeRoot.getData())
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        else {
            //Handle case 1 & 2: node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null)
                return subtreeRoot.getRightChild();
            else if (subtreeRoot.getRightChild() == null)
                return subtreeRoot.getLeftChild();

            //Handle case 3: node to delete has 2 children {

            //Replace the value in the subtreeRoot node that we wanna delete to the smallest
            // value in the right side of subtreeRoot
            subtreeRoot.setData(subtreeRoot.getRightChild().min());
            //Delete the node that have the smallest value in the right side from the subtreeRoot
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    public int min() {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }

    public int max() {
        if (root == null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }

    public void traversePreOrder() //Tree Challenge_(1)_Solution
    {
        if(root == null)
            return;

        challenge.traversePreOrder(root);
    }
}
