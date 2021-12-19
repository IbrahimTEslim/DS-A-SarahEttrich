package DataStructure.Hash;

public class StoredEmployee {
    public Employee employee;
    public String key;

    public StoredEmployee(String key, Employee employee) {
        this.employee = employee;
        this.key = key;
    }
}
