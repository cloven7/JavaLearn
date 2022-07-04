package everyday.day4;

import java.util.Scanner;

/**
 * @Description 基于队列实现银行取票机小系统
 * @Author clovenine
 * @Date 2022/7/4 19:27
 */
public class BankTicket {

    private Queue queue = new Queue();
    private String currentName;

    // 所有的人都能取到号
    private void getTicket(){
        if(queue.isEmpty()){
            for(int i = 0; i < 100; i++){
                queue.add(i);
            }
        }
        System.out.println("您好！" + currentName + "，您的号码是" + queue.pop());

    }

    // (机器只有一个对外公开的输入名字的方法) 客户输入名字
    public void inputName(){
        System.out.println("请输入您的名字：");
        Scanner scanner = new Scanner(System.in);
        currentName = scanner.next();
        this.getTicket();
    }

    public void start(){
        while (true){
            inputName();
        }
    }
}
