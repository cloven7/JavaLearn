package everyday.day4;

import everyday.day4.superlink.SuperLink;

/**
 * @Description 基于超级链表实现队列
 * @Author clovenine
 * @Date 2022/7/4 19:16
 */
public class Queue {

    private SuperLink superLink = new SuperLink();

    // 入队
    public void add(int data){
        superLink.addToHeader(data);
    }
    // 出队
    public int pop(){
        int res = superLink.select(superLink.getSize() - 1);
        superLink.delete(superLink.getSize() - 1);
        return res;
    }
    // 返回栈顶元素(不弹栈)
    public int peak(){
        return superLink.select(0);
    }
    // 判断是否为空
    public boolean isEmpty(){
        return superLink.getSize() == 0;
    }

}
