package test;

import java.util.Arrays;

public class quickSort {
    public static void quick(int[] array,int left,int right){

        if(left>=right){
            return;
        }
       int par= paritition(array,left,right);
        quick(array,left,par-1);
        quick(array,par+1,right);
    }

    private static int paritition(int[] array,int low,int high) {
        int temp=array[low];
        while (low<=high){
            while(low<high&&array[high]>=temp){
                high--;
            }
            array[low]=array[high];
            while(low<high&&array[high]<=temp){
                low++;
            }
        } array[low]=temp;
        return temp;
    }

    public static void main(String[] args) {
        int[] arrays={2,3,1,5,8,7,9,6,4};
        quick(arrays,0,arrays.length-1);
        System.out.println(Arrays.toString(arrays));

    }
}
