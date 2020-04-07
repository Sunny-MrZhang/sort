import java.util.Arrays;

public class heapSort {

    public static void main(String[] args) {
        int[] arr={3,5,2,4,8,7,9,1};
        heapSort(arr);
    }


     //将一个数组调成大顶堆
    /**
     *功能:完成以i对应的非叶子节点的树调成大顶堆
     * @param arr 待调整的数组
     * @param i   表示非叶子节点在数组中的索引
     * @param length 表示对多少元素在调整，length逐渐在减少
     */
   public static void adjustHeap(int[] arr,int i,int length){
        int temp=arr[i];
        //开始调整
       // k=i*2+1是i节点的左子节点
        for(int k=i*2+1; k<length;k=k*2+1){
           if (k+1<length&&arr[k]<arr[k+1]){//说明左子节点小于右子节点
               k++;//k指向右子节点
           }
           if (arr[k]>temp){//如果子节点大于父节点
               arr[i]=arr[k];//把较大的值赋给当前节点
               i=k;//i指向k，继续循环比较
           }else {
               break;
           }
        }

        arr[i]=temp;
    }
    //八大排序之----堆排序!
    /**
     *不稳定排序 平均时间复杂度：O(nlogn)
     *
     */
    public static void heapSort(int[] arr){

        //非叶子节点循环
        for(int i=arr.length/2-1; i >= 0; i--){//构建大顶堆
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1; j>0; j--){//末尾与堆顶交换，重建，交换...
            int temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            adjustHeap(arr,0,j);
        }
        System.out.println(Arrays.toString(arr));

    }
}
