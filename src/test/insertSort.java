package test;

import java.util.Arrays;

public class insertSort {
    public static void insertSort(int[] arrays){
        int tmp=0;
        for (int i = 1; i <arrays.length ; i++) {
            tmp=arrays[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if(arrays[j]>tmp){
                    arrays[j+1]=arrays[j];
                }
                else{
                    break;
                }
            }
            arrays[j+1]=tmp;
        }

    }
    public static void main(String[] args) {
        int[] arrays={2,3,1,5,8,7,9,6,4};
        System.out.println(Arrays.toString(arrays));
        insertSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
