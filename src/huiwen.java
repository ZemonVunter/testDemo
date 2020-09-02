import java.util.*;

    public class huiwen {
        public static boolean isHuiWen(String s){
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
            return true;

        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            int count=0;
            for(int i=0;i<=str1.length();i++){
            StringBuffer sb=new StringBuffer(str1);
            sb.insert(i,str2);
            if(isHuiWen(sb.toString())){
                count++;
            }
        }
            System.out.println(count);

        }
    }

