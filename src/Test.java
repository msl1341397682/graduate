public class Test {
    public static void main(String[] args){
        //项目启动时，首先会调用类内部的公开的静态的返回类型为空的入口函数
        int[] mylist=new int[10];
        for(int i=0;i<10;i++){
            mylist[i]=i;//初始化本数组
        }
        System.out.println(mylist.length);//直接获取数组的长度
        //一个推送到远程仓库的简单测试
    }
}
