package DataStructure.Lists;

public class SortedIntegerSingleLinkedList {

    SortedIntegerNode head;
    SortedInteger Node;
    int size;


    public boolean isEmpty() {
        return head == null;
    }

    public void addanInt(SortedInteger sorted) {
//        SortedIntegerNode node = new SortedIntegerNode(sorted);
        if (head == null || head.getSrted() >= sorted.getSorted()) {
            SortedIntegerNode nod=new SortedIntegerNode(sorted);
            nod.setNext(head);

            head = nod;
            size++;
            return;
        }

        SortedIntegerNode current=head.getNext();
        SortedIntegerNode provious=head;

        while(current!=null&&current.getSrted()<sorted.getSorted())
        {
            provious=current;
            current=current.getNext();
        }

        SortedIntegerNode newNode=new SortedIntegerNode(sorted);
        newNode.setNext(current);
        provious.setNext(newNode);
//        if (isEmpty()) {
//
//            head = node;
//            size++;
//        } else {
//            SortedIntegerNode fakeHead = head.getNext();
//
//            for (int i = 0; i < size; i++) {
//                if (fakeHead.getNext().equals(null)) {
//                    fakeHead = node;
//                }
//
//                if (sorted.getSorted() < fakeHead.getNext().getSrted()) {
//                    head.setNext(fakeHead.getNext());
//                    fakeHead.setNext(head.getNext());
//                    head = head.getNext();
//                    break;
//                }
////                } else if (sorted.getSorted() == fakeHead.getNext().getSrted()) {
////                    node.setNext(fakeHead);
////                }
//                fakeHead = fakeHead.getNext();
//            }
//
        size++;
    }


    public void print() {
        SortedIntegerNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current.getSrted());
            System.out.println("  ==>  ");
            current = current.getNext();
        }
    }
}
