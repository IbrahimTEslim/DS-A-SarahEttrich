package DataStructure.Algorithm_Sorting;

public class Recursive__Insertion_Sort {

    public static void main(String[] args) {

        int[] ary = {-555, 20, 35, -15, 7, 1201, 55, 1, -22};

        Recursive_Insertion_Sort(ary, ary.length);


        for (int m = 0; m < ary.length; m++)
            System.out.println(ary[m]);
    }

    public static void Recursive_Insertion_Sort(int[] input, int numItems) {

        if (numItems < 2)
            return;

        Recursive_Insertion_Sort(input, numItems - 1);

        int NewElement = input[numItems - 1];

        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > NewElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = NewElement;
    }
}





