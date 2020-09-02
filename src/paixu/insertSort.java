package paixu;

import java.util.Arrays;

public class insertSort {
    public static void insertSort(int[] array){
        int tmp=0;
        for (int i = 1; i <array.length ; i++) {
            tmp=array[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
            array[j+1]=tmp;
            }
        }
    public static void main(String[] args) {
        int[] array={1,5,6,4,2,4,9,5};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
}
