package DataStructure.Algorithm_Sorting;

import java.util.Arrays;

public class UsingJDK_Sort {
    public static void main(String[] arg)
    {
        int[] ary={20,-15,35,7,55,1,-22};

        Arrays.sort(ary); //This Method has built on Quick_Sort with better quality
// or
        Arrays.parallelSort(ary); //This one has built on Merge_Sort with threads && it's better from my manually made "Merge_Sort" :)
        for(int i=0;i<ary.length;i++)
        {
            System.out.println(ary[i]);
        }
    }
}
