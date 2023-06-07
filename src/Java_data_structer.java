import java.util.*;//Java工具类全部引入

public class Java_data_structer {
    public static void main(String[] args){
        //入口函数，static+public属于类层面，可以不用创建对象直接外部调用
        BitSet bit1=new BitSet(16);//初始化位集合的大小
        for(int i=0;i<16;i++){
            if(i%2==0) bit1.set(i);//偶数位置设置位true
        }
        System.out.println(bit1);
        Test.max(2,5);//static类可以直接使用类名引入
        //vector向量的使用
        Vector v=new Vector(10,2);
        v.add(new Integer(1));
        v.add(new Integer(6));//java万事万物皆是对象、
        //capacity是当前vector对象所分配的空间。size是存储的实际对象的个数
        //可以在vector中查看是否存在某个元素
        System.out.println(v.contains(1));

        //栈的使用
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<9;i++){
            s.push(i);//不断入栈
        }
        while(!s.empty()){
            //栈非空时，遍历输出然后出战
            System.out.println(s.peek());
            //获得栈顶元素，然后栈顶元素出战
            s.pop();
        }
        //关于描述抽象类和接口的区别和作用，接口是一种规范约束，子类必须实习父接口的全部方法，不然只能继承位抽象类，抽象类和接口都不能创建实例
        //抽象类相当于实现了代码复用的功能，抽象类里边可以包含实现的方法和抽象方法，继承抽象类的子类必须实现抽象类的所有抽象方法

       // linkedhashset和hashset的使用区别
        Set<Integer> hashset=new HashSet<Integer>();
        hashset.add(6);
        hashset.add(7);
        hashset.add(1);
        //遍历一遍
        for(int element:hashset){
            //使用增强型for循环进行遍历
            System.out.println(element);
        }
        //输出的顺序是乱的
        Set<Integer> linkedhashset=new LinkedHashSet<Integer>();
        linkedhashset.add(6);
        linkedhashset.add(7);
        linkedhashset.add(1);
        for(int element:linkedhashset){
            //使用增强型for循环进行遍历
            System.out.println(element);
        }
        //采用迭代器进行遍历
        Iterator<Integer> it=linkedhashset.iterator();//获得列表的迭代器
        while (it.hasNext()) {
            int elememt=it.next();//将迭代器指向下一个元素，并且返回上一个元素
            System.out.println(elememt);
        }
        //map的使用
        Map<String,String> map=new HashMap<String,String>();
        map.put("穆仕林","一战上岸武大网安");
        map.put("罗豪","春招顺利拿到工作");
        map.put("蒋寒玉","顺利上岸中科大");
        //对map进行遍历
        for(String key:map.keySet()){
            System.out.println("键:"+key+"值:"+map.get(key));
        }
//通过迭代器进行遍历
        Iterator<Map.Entry<String,String>> its=map.entrySet().iterator();//迭代器的泛型里边存放的类型
        while(its.hasNext()){
            Map.Entry<String,String> element=its.next();
            System.out.println(element.getKey()+element.getValue());
        }


    }
}
