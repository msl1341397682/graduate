import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.*;

public class Connection_Use {
    public static void main(String [] args){
        //集合框架的使用
        //1 Arrylist:与vector非常相似，都是动态数组，但是vector是线程安全的
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(6);
        list.set(2,8);//设置第三个元素的值位8
        //进行数组的遍历
        for(int num:list){
            System.out.println(num);
        }
        //利用集合的静态方法对集合进行排序
        Collections.sort(list);
        for(int num:list){
            System.out.println(num);
        }//排序之后再次输出


        //2linkedlist:底层链表来实现的，删除插入元素的效率高，查找元素的效率低
        LinkedList<Integer> linkedlsit= new LinkedList<Integer>();//从链表头插入元素
        linkedlsit.add(6);
        linkedlsit.add(8);
        linkedlsit.add(1);
        linkedlsit.addFirst(1);//从链表
        //顺序遍历链表,时间复杂度位on
        for(int size=linkedlsit.size(),i=0;i<size;i++){
            System.out.println(linkedlsit.get(i));
        }


        //3 hashset:底层是hashmap实现的，是一个无重复元素的无序的集合
        //linkedhashset的有序的，因为他额外维护了双链表
        HashSet<Integer> hashset=new HashSet<Integer>();
        hashset.add(0);
        hashset.add(7);
        hashset.add(7);//重复元素不会重复添加
        hashset.add(4);
        //hashset的遍历
        for(int i:hashset){
            System.out.println(i);
        }

        HashMap<String,Integer> hashmap=new HashMap<String ,Integer>();//当数据量小的时候hashmap底层是哈希表，是无序的
        hashmap.put("穆仕林",666);
        hashmap.put("张干",123);
        hashmap.put("石羊",888);
        hashmap.get("穆仕林");//通过键值获得值
        hashmap.containsKey("张安");//判断是否存在某键
        //迭代器访问
        Iterator<Map.Entry<String,Integer>> entryset=hashmap.entrySet().iterator();//entryset的迭代器
        while(entryset.hasNext()){
            Map.Entry<String,Integer> entry=entryset.next();
            System.out.println(entry.getKey()+entry.getValue());

        }


    }
}
