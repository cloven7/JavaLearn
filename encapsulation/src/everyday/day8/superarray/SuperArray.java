package everyday.day8.superarray;

/**
 * @Description 封装一个超级数组 一个更好用的数组 新瓶装旧酒
 * @Author clovenine
 * @Date 2022/7/4 9:35
 */
public class SuperArray<T> implements Super<T>{

    // 搞一个能存放data的数组
    Object[] elements;
    // 维护当前存储的位置
    int currentIndex = -1;

    // 使用构造器初始化
    public SuperArray(){
        // this(10);
        this.elements = new Object[10];
    }

    // [capacity 容量]
    public SuperArray(int capacity){
        this.elements = new Object[capacity];
    }

    // 对数据的增删改查
    // 增加一个元素
    public void add(T data){
        // 游标向前走
        currentIndex++;
        // 扩容
        if(currentIndex > elements.length - 1){
            Object[] temp = new Object[elements.length * 2];
            for(int i = 0; i < elements.length; i++){
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[currentIndex] = data;
    }

    // 头插
    public void addToHeader(T data) {
        this.add(0, data);
    }

    // 尾插
    public void addToTail(T data){
        this.add(currentIndex + 1, data);
    }

    // 指定下标处增加一个元素
    public void add(int index, T data){
        // 游标向前走
        currentIndex++;
        // 扩容
        if(currentIndex > elements.length - 1){
            Object[] temp = new Object[elements.length * 2];
            for(int i = 0; i < elements.length; i++){
                temp[i] = elements[i];
            }
            elements = temp;
        }
        for(int i = currentIndex; i > index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = data;
    }

    // 删除下标的元素
    public void delete(int index){
        for (int i = index + 1; i < elements.length; i++) {
            elements[i - 1] = elements[i];
        }
        currentIndex--;
    }

    // 修改下标的元素
    public void set(int index, T data){
        elements[index] = data;
    }

    // 查找数据
    public Object select(int index){
        if(index < 0 || index > currentIndex)
            return null;
        return elements[index];
    }

    // 获取长度
    public int getSize(){
        return currentIndex + 1;
    }

    // 把数组变成字符串
    public String arrayToString(){
        String res = "[";
        for (int i = 0; i < currentIndex + 1; i++) {
            res += elements[i].toString() + ",";
        }
        res = res.substring(0, res.length() - 1) + "]";
        return res;
    }

    // 冒泡排序
//    public void sort(){
//        for(int i = 0; i < currentIndex; i++){
//            for(int j = 0; j < currentIndex - i; j++){
//                if(elements[j] < elements[j + 1]){
//                    Object temp = elements[j];
//                    elements[j] = elements[j + 1];
//                    elements[j + 1] = temp;
//                }
//            }
//        }
//    }
}
