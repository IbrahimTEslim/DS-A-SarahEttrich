package DataStructure.Hash;

public class Hash_Challenge_1_Main {
    public static void main(String[] arg) {

        int[] nums = new int[10];
        int[] numstoAdd = {59382, 43, 6478, 500, 99, -58};

        for (int i = 0; i < numstoAdd.length; i++)
            nums[hash(numstoAdd[i])] = numstoAdd[i];

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);

    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
