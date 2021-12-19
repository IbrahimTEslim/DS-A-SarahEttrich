package DataStructure.Hash;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++)
            hashTable[i] = new LinkedList<StoredEmployee>();
    }

    public void put(String Key, Employee emp) {
        int hashedKey = hashKey(Key);
        hashTable[hashedKey].add(new StoredEmployee(Key, emp));
    }

    public Employee get(String Key) {
        int hashedKey = hashKey(Key);
        ListIterator<StoredEmployee> it = hashTable[hashedKey].listIterator();
        StoredEmployee emp = null;
        while (it.hasNext()) {
            emp = it.next();
            if (emp.key.equals(Key))
                return emp.employee;
        }
        return null;
    }

    public Employee remove(String Key) {
        int hashedKey = hashKey(Key);
        ListIterator<StoredEmployee> it = hashTable[hashedKey].listIterator();
        StoredEmployee emp = null;
        int index = -1;
        while (it.hasNext()) {
            emp = it.next();
            index++;
            if (emp.key.equals(Key))
                break;
        }

        if (emp == null || !emp.key.equals(Key))
            return null;
        else {
            hashTable[hashedKey].remove(index);
            return emp.employee;
        }
    }

    private int hashKey(String text) {
//            return text.length() % hashTable.length;
        /*another type of hashing...*/
        return Math.abs(text.hashCode() % hashTable.length);
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i].isEmpty())
                System.out.println("Position " + i + ": is Empty");
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> it = hashTable[i].listIterator();
                while (it.hasNext()) {
                    System.out.print(it.next().employee);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }
}
