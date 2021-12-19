package DataStructure.Lists;

public class EmployeeDoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addtoFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null)
            tail = node;
        else
            head.setPrevious(node);

        head = node;
        size++;
    }

    public void addtoEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null)
            head = node;
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public boolean equal(Employee a, Employee b) {
        if (a.getFirstName() == b.getFirstName() && a.getLastName() == b.getLastName() && a.getId() == b.getId()) {
            return true;
        } else
            return false;
    }

    public void printlist() {
        EmployeeNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current);
            System.out.println("  <==>  ");
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode removetoEnd() {
        if (isEmpty()) {
            return null;
        }
        if (tail.getPrevious() == null) {
            tail = null;
        }
        tail = tail.getPrevious();
        EmployeeNode current = tail;

        current.setNext(null);
        size--;
        return current;


    }


    public EmployeeNode addBefore(Employee neo, Employee before) {
        EmployeeNode current = head;

//        EmployeeNode here = new EmployeeNode(before);

        EmployeeNode neW = new EmployeeNode(neo);

        for (int i = 0; i < size; i++) {

            if (current.getEmployee().equals(before)) {

                if (head != current)
                    current.getPrevious().setNext(neW);


                neW.setPrevious(current.getPrevious());
                neW.setNext(current);
                current.setPrevious(neW);

                if (head == current) {
                    head = neW;
                    break;
                }


                break;
            } else {
                current = current.getNext();
//                here.setPrevious(current.getPrevious());
//                here.setNext(current.getNext());
            }
        }
        size++;
        return current;
    }


    public EmployeeNode removetoStart() {
        if (isEmpty())
            return null;
        if (head.getNext() == null)
            tail = null;
        else
            head.getNext().setPrevious(null);

        head = head.getNext();
        EmployeeNode current = head;
        current.setNext(head.getNext());
        size--;
        return current;
    }
}
