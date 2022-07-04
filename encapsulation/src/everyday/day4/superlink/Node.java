package everyday.day4.superlink;

/**
 * @Description 超级链表-Node
 * @Author clovenine
 * @Date 2022/7/4 14:13
 */
public class Node {

    private Integer data;
    private Node next;

    public Node(){

    }

    public Node(Integer data, Node next){
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }




}
