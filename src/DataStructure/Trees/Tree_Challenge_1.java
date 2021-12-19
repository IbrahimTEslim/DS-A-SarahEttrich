package DataStructure.Trees;

public class Tree_Challenge_1 {

    public void traversePreOrder(TreeNode root)
    {
        System.out.print(root.getData()+", ");

        if(root.getLeftChild()!=null)
            traversePreOrder(root.getLeftChild());

        if(root.getRightChild()!=null)
            traversePreOrder(root.getRightChild());
    }
}
