package 中等.RLE迭代器900;

public class RLEIterator {
    /**
     * 当前原数据的索引，可以看做是一个指向当前访问位置的指针
     */
    private int index = 0;
    /**
     * 当前遍历的元素，对应index+1的原数据的元素。其实是对应游程编码解压后的元素
     */
    private int element = -1;
    /**
     * 初始化的原数据，其实是游程编码压缩后的数组
     */
    private int[] data;

    public RLEIterator(int[] A) {
        data=A;
    }

    public int next(int n) {
         while(n>0){
             if(index>data.length-2){
                 element=-1;
                 break;
             }

             //当前元素出现次数
             int times=data[index];
             if(times>0){
                 if(times>n){
                     data[index]=times-n;
                     element=data[index+1];
                 }else{
                     //代表对应的元素已经遍历完了，所以设为0
                     data[index]=0;
                     //当前的元素则为index+1的元素
                     element=data[index+1];
                     index+=2;
                 }
                 n-=times;
             }else{
                 //次数为0，直接访问下一个偶数index对应的次数
                 index+=2;
             }
         }
        return element;
    }
}
