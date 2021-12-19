package DataStructure.Algorithm_Sorting;

public class String__Radix_Sort {
    public static void main(String[] arg) {
        String[] ary = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};


        Radix_Sort(ary, 26, 5);

        for (int i = 0; i < ary.length; i++)
            System.out.println(ary[i]);
    }

    public static void Radix_Sort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--)
            RadixSingleSort(input, i, radix);
    }

    public static void RadixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countingArray = new int[radix];

        for (String value : input)
            countingArray[getIndex(position, value)]++;

        for (int j = 1; j < radix; j++)
            countingArray[j] += countingArray[j - 1];

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countingArray[getIndex(position, input[tempIndex])]] = input[tempIndex];

        System.arraycopy(temp, 0, input, 0, temp.length);
    }

    public static int getIndex(int position, String Value) {
        return Value.charAt(position) - 'a';
    }
}
