package DataStructure.Hash;

public class ChainedHashTable_Main {
    public static void main(String[] arg) {
        Employee emp1 = new Employee("Ibrahim", "Eslim", 8);
        Employee emp2 = new Employee("Eshta", "Eslim", 8);
        Employee emp3 = new Employee("Kilo", "Eslim", 8);
        Employee emp4 = new Employee("Victorya", "Eslim", 8);
        Employee emp5 = new Employee("Tanya", "Eslim", 8);

        ChainedHashTable cht = new ChainedHashTable();
        cht.put("ibr", emp1);
        cht.put("es", emp2);
        cht.put("kilo", emp3);
        cht.put("vict", emp4);
        cht.put("tsn", emp5);

//        cht.printHashTable();

//        System.out.println("Retrive Employee: " + cht.get("ibr"));

//        cht.remove("es");
//        cht.remove("kilo");

//        System.out.println("\n\n\n");
        cht.printHashTable();
        System.out.println(cht.get("tszn"));
//        cht.printHashTable();
//        System.out.println("Retrive Employee: " + cht.get("es"));
    }
}
