package DataStructure.Algorithm_Sorting;

public class Bubble_Sort {

    public static void main(String[] args)
    {
        int ary[]={20,35,-15,7,55,1,-22};

        for(int UnsortedAry=ary.length-1;UnsortedAry>0;UnsortedAry--)
        {
            for(int i=0;i<UnsortedAry;i++)
            {
                if(ary[i]>ary[i+1])
                    swap(ary,i,i+1);

            }
        }
            for(int i=0;i<ary.length;i++)
                System.out.print(ary[i]+"  ");
    }

    public static void swap(int[] ary, int i,int j)
    {
        int temp=ary[i];
        ary[i]=ary[j];
        ary[j]=temp;
    }
}
