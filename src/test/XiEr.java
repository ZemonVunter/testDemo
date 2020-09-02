package test;

public class XiEr {
    public static void xier(int[] array ,int gap){
        int temp=0;
        for (int i = gap; i <array.length ; i++) {
            temp=array[i];
            int j=i-gap;
            for (; j >=0; j=j-gap) {
                if(array[j]>temp){
                    array[j+1]=array[j];
                }
                else {
                    break;
                }
            }
            array[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arrays = {2, 3, 1, 5, 8, 7, 9, 6, 4};
    }
}