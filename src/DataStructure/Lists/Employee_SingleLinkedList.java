package DataStructure.Lists;

import java.util.ArrayList;
import java.util.List;

public class Employee_SingleLinkedList {
    public static void main(String[] arg) {

        Employee john = new Employee("Joun", "jeal", 123);
        Employee mika = new Employee("mikel", "rosted", 6874);
        Employee vec = new Employee("Vectorya", "alex", 194);
        Employee tanya = new Employee("before removing", "Dego", 8);
        Employee taenya = new Employee("im removed", "Dego", 8);

        EmployeeSinleLinkedList list = new EmployeeSinleLinkedList();

        list.addtoFront(john);
        list.addtoFront(mika);
        list.addtoFront(vec);
        list.addtoFront(tanya);
        list.addtoFront(taenya);

        list.Removenode();

        System.out.println(list.getSize());

        list.printlist();

        System.out.println(list.isEmpty());

    }

}
