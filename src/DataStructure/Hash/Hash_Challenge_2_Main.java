package DataStructure.Hash;


import java.util.*;

public class Hash_Challenge_2_Main {
    public static void main(String[] arg) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("Jone", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("Jone", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> hashMap = new HashMap<>();

    //   List<Employee> remove = new ArrayList<>();  /*Sara's Way for removing the duplicated elements: */


        ListIterator<Employee> it = employees.listIterator();

        /*Ibrahim's Way for removing duplicated elements: */
        int[] pos = new int[employees.size()];
        int i = -1;
        /*ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ*/

        while (it.hasNext()) {
            Employee emp = it.next();
            i++;  /*Ibrahim's Way for removing duplicated elements: */
            if (hashMap.containsKey(emp.getId())) {
                //            remove.add(emp); /*Sara's Way for removing the duplicated elements: */

                pos[i] = 1; /*Ibrahim's Way for removing duplicated elements: */
            } else
                hashMap.put(emp.getId(), emp);
        }

        /*Sara's Way for removing the duplicated elements: */
//        for (Employee emp : remove)
//            employees.remove(emp);

        /*Ibrahim's Way for removing duplicated elements: */
        for (int j = pos.length - 1; j >= 0; j--) {
            if (pos[j] > 0)
                employees.remove(j);
        }

        System.out.println("\n\n\n");

        employees.forEach(e -> System.out.println(e));

    }
}
