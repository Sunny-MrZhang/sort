import java.util.Arrays;

public class shellSort {


    public static void main(String[] args) {

        int[] arr={3,5,2,4,8,7,9,1};
        shellSort(arr);
        System.out.println( Arrays.toString(arr));
    }

    //八大排序之----希尔排序!
    /**
     *不稳定稳定排序 平均时间复杂度：O(nlogn)
     * 基本思想:（直接插入法优化）缩小增量法
     */
    public static void shellSort(int[] arr){
        int incNum=arr.length/2;
        while(incNum>=1){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length-incNum; j+=incNum) {
                    if(arr[j]>arr[j+incNum]){
                        int temp=arr[j];
                        arr[j]=arr[j+incNum];
                        arr[j+incNum]=temp;
                    }

                }
            }
            incNum=incNum/2;
            System.out.println(Arrays.toString(arr));
        }

    }
}
