package test;

import java.util.*;

public class HashMapAndSet {
    //除了某一个元素外别的元素都出现两次，请找出他
    public static int fun(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        /**
         * 自己写法
         * for (int i = 0; i <nums.length ; i++) {
         *             if(set.contains(nums[i])){
         *                 set.remove(nums[i]);
         *             }
         *             else {
         *                 set.add(nums[i]);
         *             }
         */
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }


        }
        Iterator<Integer> it=set.iterator();

        return it.next();
    }


    public static void main(String[] args) {
        int[] num={1,1,2,2,3,3,4,5,5,6};
        System.out.println(fun(num));


    }
    //10w数据统计重复数字以及出现的次数
    public static void main3(String[] args) {
        Random random=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <60 ; i++) {
            list.add(random.nextInt(60));
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        //key->出现的数字
        //value->重复出现的次数
        for (Integer key:list) {
            if(map.get(key)==null){
                map.put(key,1);
            }
            else {
                Integer val=map.get(key);
                map.put(key,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }
        System.out.println("=====================================");
        Collection<Integer> collection=map.values();
        while(collection.contains(1)==true){
            collection.remove(1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }


    }
    //大数据去重
    public static void main2(String[] args) {
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <10_000 ; i++) {
            arrayList.add(random.nextInt(6000));
        }
        HashSet<Integer> set=new HashSet<>();
        set.addAll(arrayList);
        System.out.println(set);
    }

    //第一个重复出现的数据
    public static void main1(String[] args) {
        Random random=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(random.nextInt(6));
        }
        System.out.println(list);
        HashSet<Integer> set=new HashSet<>();
        for (Integer val:list) {
            if(set.contains(val)){
                System.out.println(val);
                return;
            }else {
                set.add(val);
            }
        }


    }
}
