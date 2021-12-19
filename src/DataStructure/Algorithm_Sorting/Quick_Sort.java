package DataStructure.Algorithm_Sorting;

public class Quick_Sort {
    public static void main(String[] arg) {
        int[] ary = {20, -15, 35, 7, 55, 1, -22};

QuickSort(ary,0,ary.length);

        for (int i = 0; i < ary.length; i++)
            System.out.println(ary[i]);
    }

    public static void QuickSort(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int PivotIndext=partition(input,start,end);

        QuickSort(input,start,PivotIndext);
        QuickSort(input,PivotIndext+1,end);

    }

    public static int partition(int[] input,int start,int end)
    {
        //this is using the 1st element as the pivot

        int pivot=input[start];

        int i=start;
        int j=end;

        while(i<j)
        {
            //NOTE: empty loop body
            while(i<j&&input[--j]>=pivot);

            if(i<j)
                input[i]=input[j];

            //NOTE: empty loop body
            while(i<j&&input[++i]<=pivot);
            if(i<j)
                input[j]=input[i];

        }
        input[j]=pivot;
        return j;
    }
}
