package test;

public class BubbleSort {
    public static  void bible(int[] array){
        int tmp=0;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arrays={2,3,1,5,8,7,9,6,4};
        bible(arrays);
        for (int s:arrays) {
            System.out.print(s);
        }

    }
}
