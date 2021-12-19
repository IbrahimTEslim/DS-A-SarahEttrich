package DataStructure.Stack;

import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;
    public LinkedStack()
    {
        stack=new LinkedList<Employee>();
    }

    public void push(Employee emp)
    {
        stack.push(emp);
    }

    public Employee peek()
    {
        return stack.peek();
    }
}
