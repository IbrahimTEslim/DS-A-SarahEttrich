package DataStructure.Algorithm_Sorting;

public class Shell_Sort {

    public static void main(String[] args) {

        int[] ary={20,35,-15,7,55,1,-22};

        for( int gap=ary.length/2;gap>0;gap/=2)
        {
            for(int i = gap;i<ary.length;i++)
            {
                int NewElement=ary[i];
                int j=i;

                while(j>=gap&&ary[j-gap]>NewElement)
                {
                    ary[j]=ary[j-gap];
                    j-=gap;
                }
                ary[j]=NewElement;
            }
        }




        for(int m=0;m<ary.length;m++)
            System.out.println(ary[m]);
    }
}
