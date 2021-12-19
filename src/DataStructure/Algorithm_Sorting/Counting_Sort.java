package DataStructure.Algorithm_Sorting;

public class Counting_Sort
{
    public static void main(String[] arg)
    {

        int[] ary={-10,2,5,9,8,2,8,7,10,4,3};

        Counting_Sort(ary,-10,10);


        for(int i=0;i<ary.length;i++)
            System.out.print(ary[i]+" ");
    }


    public static void Counting_Sort(int[] input,int min,int max)
    {
        int[] CountArray=new int[max-min+1];

        for(int i=0;i<input.length;i++)
        {
            CountArray[input[i]-min]++;
        }

        int j=0;
        for(int i=min;i<=max;i++)
        {
            while(CountArray[i-min]>0)
            {
                input[j++]=i;
                CountArray[i-min]--;
            }
        }
    }
}
