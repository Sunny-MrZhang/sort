import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {

        int[] arr={3,5,2,4,8,7,9,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //八大排序之----快速排序!
    /**
     *不稳定排序 平均时间复杂度：O(nlogn)
     * 基本思想:(冒泡改进)通过一趟排序将要排序的数据分割成独立的两部分，
     * 其中一部分的数据要比另一部分所有数据都要小
     * 在按照此方法将两部分数据进行快速排序（递归）
     *
     */
    public static void quickSort(int[] arr,int left,int right){

        int l=left;
        int r=right;
        int mid=arr[(left+right)/2];
        while(l<r){
            while(arr[l]<mid){
                l++;
            }
            while(arr[r]>mid){
                r--;
            }
            if(l>=r){
                break;
            }
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if(arr[l]==mid){
                r--;
            }
            if(arr[r]==mid){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }

        if(left<r){
            quickSort(arr, left, r);
        }
        if(right>l){
            quickSort(arr, l, right);
        }
    }

}
