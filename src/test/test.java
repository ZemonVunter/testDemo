package test;

public class test {
    public static void main(String[] args) {
        int x = 0;
        int y=0;
        int k=0;
        for (int i = 0; i <5 ; i++) {
            if((++x>2)&&(++y>2)&&(k++>2)){
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x+" "+y+" "+k);
    }
}
