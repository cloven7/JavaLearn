package everyday.day4;

/**
 * @Description 超级链表实现
 * @Author clovenine
 * @Date 2022/7/4 14:20
 */
public class SuperLink {

    // 链表的头部
    private Node head;
    // 链表长度
    private int currentIndex = -1;

    // 对数据的增删改查
    // 增加一个元素
    public void add(int data){
        if(head == null){
            head = new Node(data, null);
        }else{
            // 创建一个指向头部的Node
            Node node = new Node(data, head);
            // 新的Node变成头部
            head = node;
        }
        currentIndex++;
    }

    // 删除下标的元素
    public void delete(int index){
        if(index < 0 || index > currentIndex)
            return;
        if(index == 0){
            head = head.getNext();
        } else {
            Node node = head;
            for(int i = 0; i < index - 1; i++){
                node = node.getNext();
            }
            // 删除的核心
            node.setNext(node.getNext().getNext());
        }

        currentIndex--;
    }

    // 修改下标的元素
    public void set(int index, int data){
        // 找到下标为index的节点
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        node.setData(data);
    }

    // 查找数据
    public Integer select(int index){
        // 找到下标为index的节点
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node.getData();
    }

    // 获取长度
    public int getSize(){
        return currentIndex + 1;
    }

    // 把链表变成字符串
    public String arrayToString(){
        String res = "[";
        for(int i = 0; i <= currentIndex; i++){
            res += select(i) + ",";
        }
        res = res.substring(0, res.length() - 1) + "]";
        return res;
    }

    // 向下标index增加数据data
    public void insert(int index, int data){
        if(index < 0 || index > currentIndex + 1)
            return;

        if(head == null){
            head = new Node(data, null);
        }
        else if(index == 0){
            // 创建一个指向头部的Node
            Node node = new Node(data, head);
            // 新的Node变成头部
            head = node;
        } else {
            // 找到index - 1的节点
            Node node = head;
            for(int i = 0; i < index - 1; i++)
                node = node.getNext();

            // 插入新节点
            Node newNode = new Node(data, null);
            newNode.setNext(node.getNext());
            node.setNext(newNode);
        }

        currentIndex++;
    }

    // 头插
    public void addToHeader(int data) {
        this.insert(0, data);
    }

    // 尾插
    public void addToTail(int data){
        this.insert(currentIndex + 1, data);
    }

    // 冒泡排序
    public void sort(){

    }

}
