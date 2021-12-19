package DataStructure.Lists;

public class SortedInteger_Main {
    public static void main(String[] arg) {

        SortedInteger int1 = new SortedInteger(-54);
        SortedInteger int2 = new SortedInteger(0);
        SortedInteger int3 = new SortedInteger(1005);
        SortedInteger int4 = new SortedInteger(94);
        SortedInteger int5 = new SortedInteger(-2);

        SortedIntegerSingleLinkedList list = new SortedIntegerSingleLinkedList();
        list.addanInt(int1);
        list.print();
        System.out.println("***************  "+list.size);

        list.addanInt(int2);
        list.print();
        System.out.println("***************  "+list.size);

        list.addanInt(int3);
        list.print();
        System.out.println("***************  "+list.size);

        list.addanInt(int4);
        list.print();
        System.out.println("***************  "+list.size);

        list.addanInt(int5);

        list.print();
        System.out.println("***************  "+list.size);
    }
}
