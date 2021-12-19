package DataStructure.Stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            Employee[] arrayEmployee = new Employee[2 * stack.length];
            System.arraycopy(arrayEmployee, 0, stack, 0, stack.length);
            stack = arrayEmployee;

        }

        stack[top++] = employee;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee emp = stack[--top];
        stack[top] = null;
        return emp;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int getSize()
    {return top;}

    public void print()
    {
        for(int i=top-1;i>=0;i--)
            System.out.println(stack[i]);
    }

}
