import java.util.Arrays;

public class selectSort {


    public static void main(String[] args) {
        int[] arr={3,5,2,4,8,7,9,1};
        selectSort(arr);
        System.out.println( Arrays.toString(arr));
    }

    //八大排序之----选择排序!
    /**
     *不稳定排序 平均时间复杂度：O(n2)
     */
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
