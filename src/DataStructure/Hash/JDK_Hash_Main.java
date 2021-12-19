package DataStructure.Hash;

import java.util.HashMap;
import java.util.Map;

public class JDK_Hash_Main {
    public static void main(String[] arg) {
        Employee emp1 = new Employee("Ibrahim", "Eslim", 8);
        Employee emp2 = new Employee("Eshta", "Eslim", 8);
        Employee emp3 = new Employee("Kilo", "Eslim", 8);
        Employee emp4 = new Employee("Victorya", "Eslim", 8);
        Employee emp5 = new Employee("Tanya", "Eslim", 8);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("ibr", emp1);
        hashMap.put("vic", emp4);
        hashMap.put("tanya", emp5);
        hashMap.put("es", emp2);

        hashMap.putIfAbsent("tan",emp3);
        hashMap.putIfAbsent("tasn",emp3);
//        Iterator<Employee> it=hashMap.values().iterator();
//        while(it.hasNext())
//            System.out.println(it.next());

        hashMap.forEach((k, v) -> System.out.println("Key: " + k + " , Employee: " + v));

        System.out.println("\n\n"+hashMap.getOrDefault("tandya",emp4));
    }
}
