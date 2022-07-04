package everyday.day4;

import everyday.day4.superarray.SuperArray;

/**
 * @Description 基于超级数组(jar包)实现栈
 * @Author clovenine
 * @Date 2022/7/4 19:03
 */
public class Stack {

    private SuperArray superArray = new SuperArray();

    // 压栈
    public void push(int data){
        superArray.addToHeader(data);
    }
    // 弹栈
    public int pop(){
        int res = superArray.select(0);
        superArray.delete(0);
        return res;
    }
    // 返回栈顶元素(不弹栈)
    public int peak(){
        return superArray.select(0);
    }

    // 判断是否为空
    public boolean isEmpty(){
        return superArray.getSize() == 0;
    }


}
