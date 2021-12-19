package DataStructure.Hash;

public class SimpleHashtable_Main {
    public static void main(String[] arg) {
        Employee emp1 = new Employee("Ibrahim", "Eslim", 8);
        Employee emp2 = new Employee("Eshta", "Eslim", 8);
        Employee emp3 = new Employee("Kilo", "Eslim", 8);
        Employee emp4 = new Employee("Victorya", "Eslim", 8);
        Employee emp5 = new Employee("Tanya", "Eslim", 8);

        SimpleHashTable sht = new SimpleHashTable();
        sht.put("ibr", emp1);
        sht.put("sh", emp2);
//        sht.put("kilo", emp3);
//        sht.put("tanya", emp5);
//        sht.put("vic", emp4);

        System.out.println("\n\n");

//        System.out.println(sht.get("vic"));
//        System.out.println(sht.get("ibr"));
//        System.out.println(sht.get("tanya"));
//
//       sht.remove("ibr");
//        sht.remove("vic");
//        sht.printHashtable();

        sht.put("ibr",emp1);
        sht.get("ibr");
        sht.remove("ibr");
        sht.get("ibr");
        sht.printHashtable();
    }
}
