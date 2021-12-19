package DataStructure.Algorithm_Sorting;

public class Radix_Sort {
    public static void main(String[] arg) {
        int[] ary = {4725, 4556, 1630, 7762, 1564, 5726};

        Radix_Sort(ary,10,4);

        for (int i = 0; i < ary.length; i++)
            System.out.println(ary[i]);
    }

    public static void Radix_Sort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++)
            RadixSingleSort(input, i, radix);
    }

    public static void RadixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countingArray = new int[radix];

        for (int value : input)
            countingArray[getDigit(position, value, radix)]++;

        for (int j = 1; j < radix; j++)
            countingArray[j] += countingArray[j - 1];

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countingArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];

        System.arraycopy(temp,0,input,0,temp.length);
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
