package DataStructure.Lists;

public class EmployeeSinleLinkedList {

    private EmployeeNode head;
    private int size;

    public void addtoFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        head = node;
        size++;
    }

    public void printlist() {
        EmployeeNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current);
            System.out.println("  ==>  ");
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode Removenode() {
        EmployeeNode current = head;
        head = head.getNext();
        current.setNext(null);
        size--;

        return head;
    }
}
