import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {

        int[] arr={3,5,2,4,8,7,9,1};
        int[] temp=new int[arr.length];
        mergeSort(arr, 0, arr.length-1, temp);
        System.out.println( Arrays.toString(arr));
    }

    //八大排序之----归并排序!
    public static void merge(int [] arr,int left ,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;//temp当前索引

        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[t]=arr[i];
                t++;
                i++;
            }else{
                temp[t]=arr[j];
                t++;
                j++;
            }

        }

        while(i<=mid){
            temp[t]=arr[i];
            t++;
            i++;
        }
        while(j<=right){
            temp[t]=arr[j];
            t++;
            j++;
        }
        t=0;
        int tempLeft=left;
        while(tempLeft<=right){
            arr[tempLeft]=temp[t];
            t++;
            tempLeft++;
        }
    }
    public static void mergeSort(int[] arr,int left,int right,int[] temp){

        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid+1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
}
