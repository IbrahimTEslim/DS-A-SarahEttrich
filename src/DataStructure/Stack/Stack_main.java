package DataStructure.Stack;

public class Stack_main {
    public static void main(String[] arg)
    {
            Employee emp1=new Employee("Ibrahim","Eslim",8);
        Employee emp2=new Employee("Eshta","Eslim",8);
        Employee emp3=new Employee("Kilo","Eslim",8);
        Employee emp4=new Employee("Victorya","Eslim",8);
        Employee emp5=new Employee("Tanya","Eslim",8);

        ArrayStack arys=new ArrayStack(10);
        arys.push(emp1);
        arys.push(emp2);
        arys.push(emp3);
        arys.push(emp4);
        arys.push(emp5);

        arys.print();
        System.out.println("*//////////////////////////////////\n\n");
        arys.pop();
        arys.print();
        System.out.println("*//////////////////////////////////\n\n");
        System.out.println("Popped: "+arys.pop());
        System.out.println("*//////////////////////////////////\n\n");
        arys.print();
arys.push(emp5);
        System.out.println("*//////////////////////////////////\n\n");
        arys.print();

    }
}
