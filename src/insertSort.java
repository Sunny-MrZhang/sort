import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,4,8,7,9,1};
        insertSort(arr);
        System.out.println( Arrays.toString(arr));
    }

    //八大排序之----直接插入排序!
    /**
     *稳定排序 平均时间复杂度：O(n2)
     * 基本思想:把n个待排序的元素看成一个有序表和一个无序表
     * 开始时有序表只有一个元素，无序表中包含n-1个元素
     * 每次从无序表元素取出第一个元素与有序中的排序码进行比较并插入到适当位置
     */
    public  static  void insertSort(int[] arr){

        for (int i=1;i<arr.length;i++){
            int insertVal=arr[i];
            int insertIndex=i-1;
            while (insertIndex>=0&&insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertVal;
        }

    }
}
