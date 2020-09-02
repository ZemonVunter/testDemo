import java.util.Stack;

public class kuohaopipei {
    public  boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else {
                if(stack.empty()){
                    return false;
                }
                else {
                    char ch2=stack.peek();
                    if(ch=='('&&ch2==')'||ch=='{'&&ch2=='}'||ch=='['&&ch2==']'){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                String str="jbyhv4545";
                char[] ch2=str.toCharArray();
                int mid=(str.length())/2-1;


        }
        }
        if (!stack.empty()){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {

    }
}
