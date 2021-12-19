package DataStructure.Algorithm_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bucket_Sort {
    public static void main(String[] arg) {
        int[] ary = {54, 11, 46, 83, 66, 95, 92, 6443};

        BucketSort(ary);

        for (int i = 0; i < ary.length; i++)
            System.out.println(ary[i]);
    }

    public static void BucketSort(int[] input) {
        List<Integer>[] buckets = new List[1000];

        for (int i = 0; i < buckets.length; i++)
            //Using ArrayList:
            buckets[i] = new ArrayList<Integer>();

        //Using LinkedList:
//             buckets[i] = new LinkedList<Integer>();

        //Using Vector:
//              buckets[i] = new Vector<Integer>();


        for (int i = 0; i < input.length; i++)
            buckets[hash(input[i])].add(input[i]);

        for (List bucket : buckets)
            Collections.sort(bucket);

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i])
                input[j++] = value;
        }
    }

    public static int hash(int value) {
        return value / (int) 10;
    }
}
