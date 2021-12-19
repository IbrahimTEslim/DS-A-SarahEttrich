package DataStructure.Heap;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public int delete(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is Empty");
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent])
            fixHeapBelow(index, size - 1);

        fixHeapAbove(index);

        size--;

        return deletedValue;
    }

    public void insert(int value) {
        if (isFull())
            throw new IndexOutOfBoundsException("Heap is Full");
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    private int getChild(int index, boolean left) {
        return index * 2 + (left ? 1 : 2);
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childtoSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childtoSwap = leftChild;
                } else {
                    childtoSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
                if (heap[index] < heap[childtoSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childtoSwap];
                    heap[childtoSwap] = tmp;
                } else {
                    break;
                }
                index = childtoSwap;
            } else {
                break;
            }
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is Empty");

        return heap[0];
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == heap.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }
}
