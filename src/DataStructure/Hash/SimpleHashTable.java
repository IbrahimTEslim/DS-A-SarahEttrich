package DataStructure.Hash;

public class SimpleHashTable {
    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }


    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1)
            return null;
        else
            return hashTable[hashedKey].employee;
    }

    public void put(String key, Employee emp) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1)
                hashedKey = 0;
            else
                hashedKey++;
            while (occupied(hashedKey) && hashedKey != stopIndex)
                hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (occupied(hashedKey))
            System.out.println("Sorry, there is already an employee at position: " + (hashedKey + 1));
        else
            hashTable[hashedKey] = new StoredEmployee(key, emp);
    }


    private int hashKey(String text) {
        return text.length() % hashTable.length;
    }

    public void printHashtable() {
        for (int i = 0; i < hashTable.length; i++)
            if (hashTable[i] == null)
                System.out.println("empty");
            else
                System.out.println("Position " + i + ": " + hashTable[i].employee);
    }

    public boolean occupied(int index) {
        return hashTable[index] != null;
    }

    public Employee remove(String key)
    {
        int hashedkey=findKey(key);
        if(hashedkey==-1)
            return null;
        Employee emp=hashTable[hashedkey].employee;
        hashTable[hashedkey]=null;
        StoredEmployee[] oldHashtable=hashTable;
        hashTable=new StoredEmployee[oldHashtable.length];
        for(int i=0;i<oldHashtable.length;i++)
            if(oldHashtable[i]!=null)
                put(oldHashtable[i].key,oldHashtable[i].employee);
        return emp;
    }

    private int findKey(String Key) {
        int hashedKey = hashKey(Key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(Key))
            return hashedKey;

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1)
            hashedKey = 0;
        else
            hashedKey++;
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(Key))
            hashedKey = (hashedKey + 1) % hashTable.length;

    if(hashTable[hashedKey]!=null&&hashTable[hashedKey].key.equals(Key))
        return hashedKey;
    else
        return -1;
    }

}
