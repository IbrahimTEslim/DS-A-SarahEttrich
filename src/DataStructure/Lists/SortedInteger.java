package DataStructure.Lists;

import java.util.Objects;

public class SortedInteger {
    private int sorted;


    public SortedInteger(int sorted)
    {
        this.sorted=sorted;
    }

    public int getSorted() {
        return sorted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortedInteger that = (SortedInteger) o;
        return sorted == that.sorted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sorted);
    }

    public void setSorted(int sorted) {
        this.sorted = sorted;
    }

    @Override
    public String toString() {
        return "SortedIntegerSingleLinkedList{" +
                "sorted=" + sorted +
                '}';
    }


}
