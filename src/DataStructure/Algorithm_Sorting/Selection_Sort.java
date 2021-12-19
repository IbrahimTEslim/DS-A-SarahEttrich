package DataStructure.Algorithm_Sorting;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] ary = {20,35, -15, 7, 55, 1, -22};

        for(int LastUnsortedIndex=ary.length-1;LastUnsortedIndex>0;LastUnsortedIndex--)
        {

            int LargeElement=ary[0];
            int pos=0;


            for(int i=1;i<=LastUnsortedIndex;i++)
            {
                if(ary[i]>LargeElement) {
                    LargeElement = ary[i];
                    pos = i;
                }
            }


            int temp=ary[LastUnsortedIndex];
            ary[LastUnsortedIndex]=LargeElement;
            ary[pos]=temp;
        }


        for (int k = 0; k < ary.length; k++)
            System.out.println(ary[k]);


    }
}

