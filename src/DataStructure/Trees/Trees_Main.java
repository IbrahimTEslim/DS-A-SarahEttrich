package DataStructure.Trees;

public class Trees_Main {
    public static void main(String[] arg)
    {
        Tree tr=new Tree();
        tr.insert(25);
        tr.insert(20);
        tr.insert(15);
        tr.insert(27);
        tr.insert(30);
        tr.insert(29);
        tr.insert(26);
        tr.insert(22);
        tr.insert(32);
        tr.insert(17);

        tr.traversePreOrder();

//        System.out.println(tr.get(25));
//        System.out.println(tr.get(27));
//        System.out.println(tr.get(19));
//        System.out.println("\n\n\n");
////        System.out.println(tr.max()+"\t"+tr.min());
//        tr.delete(25);
//        tr.traverseInOrder();
    }
}
