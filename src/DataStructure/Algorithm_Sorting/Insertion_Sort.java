package DataStructure.Algorithm_Sorting;

public class Insertion_Sort {

    public static void main(String[] args) {

        int[] ary = {20, 35, -15, 7, 55, 1, -22};



        for (int FirstunSortedInedx = 1; FirstunSortedInedx < ary.length; FirstunSortedInedx++) {

            int NewElement = ary[FirstunSortedInedx];
            int i;
            for (i = FirstunSortedInedx; i > 0 && ary[i - 1] > NewElement; i--) {
                ary[i] = ary[i - 1];
            }

            ary[i] = NewElement;
        }

        for (int m = 0; m < ary.length; m++)
            System.out.println(ary[m]);
    }
}
