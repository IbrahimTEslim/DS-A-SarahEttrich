package DataStructure.Lists;

public class SortedIntegerNode {
    private SortedInteger srted;
    private SortedIntegerNode next;

    public SortedIntegerNode(SortedInteger srted)
    {
        this.srted=srted;
    }

    public int getSrted() {
        return srted.getSorted();
    }

    public void setSrted(SortedInteger srted) {
        this.srted = srted;
    }

    public SortedIntegerNode getNext() {
        return next;
    }

    public void setNext(SortedIntegerNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SortedIntegerNode{" +
                "srted=" + srted +
                ", next=" + next +
                '}';
    }
}
