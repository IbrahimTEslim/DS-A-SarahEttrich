package DataStructure.Queue;

import java.util.NoSuchElementException;

public class Array_Queue {
    private Employee[] queue;
    private int front;
    private int back;

    public Array_Queue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee emp) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] neo_array = new Employee[queue.length * 2];
            System.arraycopy(queue, front, neo_array, 0, queue.length - front);
            System.arraycopy(queue, 0, neo_array, queue.length - front, back);
            queue = neo_array;
            front = 0;
            back = /*queue.length / 2;*/numItems;
        }
        queue[back] = emp;
        if (back < queue.length - 1)
            back++;
        else
            back = 0;
    }

    public int size() {
        if (front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }


    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee emp = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return emp;
    }

    public Employee peek() {
        if (size() == 0)
            throw new NoSuchElementException();
        return queue[front];
    }

    public void printQueue() {
        if (front <= back)
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        else {
            for (int i = front; i < queue.length; i++)
                System.out.println(queue[i]);
            for (int i = 0; i < back; i++)
                System.out.println(queue[i]);
        }
    }
}
