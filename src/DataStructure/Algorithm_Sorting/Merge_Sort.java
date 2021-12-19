package DataStructure.Algorithm_Sorting;
import java.lang.*;

public class Merge_Sort {

    public static void main(String[] args) {
int[] ary={20,35,-15,7,55,1,-22,0};

MergeSort(ary,0,ary.length);

for(int i=0;i<ary.length;i++)
    System.out.print(ary[i]+" ");
    }

    public static void MergeSort(int[] insert, int start, int end) {
        if (end - start < 2)
            return;
        int mid =(end+start)/2;
        MergeSort(insert,start,mid);
        MergeSort(insert,mid,end);
        Merge(insert,start,mid,end);
    }

    public static void Merge(int[] insert, int start, int mid, int end){
        if(insert[mid-1]<=insert[mid])
            return;

        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp=new int[end-start];
        while(i<mid&&j<end)
            temp[tempIndex++]=insert[i]<=insert[j]?insert[i++]:insert[j++];

        System.arraycopy(insert,i,insert,start+tempIndex,(mid-i));
        System.arraycopy(temp,0,insert,start,tempIndex);
    }


}
