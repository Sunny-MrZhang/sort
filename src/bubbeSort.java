import java.util.Arrays;

public class bubbeSort {

    public static void main(String[] args) {

        int[] arr={3,5,2,4,8,7,9,1};
        bubbeSort(arr);
        System.out.println( Arrays.toString(arr));
    }

    //八大排序之----冒泡排序!

    /**
     *稳定排序 平均时间复杂度：O(n2)
     */
    public static void bubbeSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
