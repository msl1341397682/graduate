public class Test {
    public class Dog{
        void sound(){
            System.out.println("汪汪汪");
        }
    }

    public static void main(String[] args){
        //项目启动时，首先会调用类内部的公开的静态的返回类型为空的入口函数
        int[] mylist=new int[10];
        for(int i=0;i<10;i++){
            mylist[i]=i;//初始化本数组
        }
        System.out.println(mylist.length);//直接获取数组的长度
        //一个推送到远程仓库的简单测试
        System.out.println(max(6,7));
        //调用内部类
        new Test().new Dog().sound();//创建了外部类之后才对内部类有访问的权限，通过该权限使用new关键字创建内部类的对象
        //静态方法不能调用非静态方法
    }
    public static int max(int a,int b){
        //比较两个传入值大小的函数
        return a>b?a:b;//三目运算符
    }
    //方法的重载，静态的多态，调用一个函数名可以根据传入的类型不同调用不同的哈纳树
    //在c++中有模板函数可以减少代码量来实现函数重载
    public static double max(double a,double b){
        return a>b?a:b;
    }
    //在一个启动类里边写一个正常类

}
