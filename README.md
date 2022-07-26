# Java学习记录



### DAY1

#### 汽车的封装和内存布局encapsulation



#### java的idea，新建Java类时，自动在文件头中添加作者名和日期时间等信息

https://blog.csdn.net/weixin_44076342/article/details/106789384

### DAY2

#### 2.1包的概念和命名规则
(1) 一个类里面不仅可以new自己，还可以new别的类。

(2) 包就是一个文件夹，给类分类，更好管理代码

(3) 包名用小写

(4) 类的全限定名称 a.b.everyday.day1.Car//包名.包名.....类名

(5) 包的命名规则，域名倒置，建文件夹的时候很舒服。例如，com一级目录，百度二级目录，文库、知道等三级目录

#### 2.2引入其它包的类
(1) 将全限定名称通过import的方式导入

(2) 推荐用那个类就把哪个类引入



### DAY3

#### 3.1权限修饰符

|      作用域       | 当前类 | 同Package | 子孙类 | 其它Package |
| :---------------: | :----: | :-------: | :----: | :---------: |
|      public       |  True  |   True    |  True  |    True     |
|     protected     |  True  |   True    |  True  |    False    |
| friendly(default) |  True  |   True    | False  |    False    |
|      private      |  True  |   False   | False  |    False    |



#### 3.2构造器

(1) 写在成员变量后面

(2) this能被当做构造器使用，this永远指向调用或构造的当前实例

#### 3.3getter和setter

(1) 别人不能直接修改成员变量，只能通过getter和setter修改
(2) 快捷键Alt + Insert

#### 3.4写对象的过程
(1) 第一块内容：成员变量
(2) 第二块内容：写构造器、记得补无参构造
(3) 第三块内容：成员方法
(4) 第四块内容：getter和setter
(5) main方法不写在这里

#### 3.5String
(1) final修饰的变量不能改变
(2) playString 构造方法
(3) String 的内存分析和笔试题

### DAY4--1

#### 4.1转义符‘\’

#### 4.2统计单词出现次数

#### 4.3包装类和自动拆装箱

#### 4.4Integer的笔试题-128到127

#### 4.5超级数组（superArray）

#### 4.6超级链表

#### 4.7快捷键修改“setting”---“Keymap”---“General...”

### DAY4--2 基于超级链表(数组)实现栈和队列

#### 4.1超级链表代码优化

#### 4.2超级链表排序(新能对比)

#### 4.3基于超级数组实现队列和栈

(1)栈：先进后出(压栈、弹栈) 桶

(2)队列：先进先出(入队、出队) 排队

#### 4.4基于超级数组实现队列和栈


#### 4.5打包(jar包)

"File"---"Project Structure"---"Artifacts"---"JAR"---"From modules..."

"Build"---"Build Artifacts..."---"选择jar包"---"Build"

"File"---"Project Structure"---"module"---"选择要引入jar包的工程文件"---"+"---"选择jar包"

"META-INF"为指定的main方法

![img.png](image/img.png)


#### 4.6基于队列实现一个银行取票机小系统


#### 4.7修改类名(对着代码里类名按Shift + F6)

(1) [快捷键] 取消缩进(Shift + tab)


### DAY4--3 面向对象之继承


#### 4.1 子类能用父类的方法，同时用于自己的特性


#### 4.2 子类和父类的构造顺序(创建子类一定会创建它的父类)


#### 4.3 super关键字

(1) 使用super调用父类的方法和属性

(2) 基本同this关键字

(3) 构造器前不能加任何代码，所以也不能有两个构造器


#### 4.4 super和this关键字的区别

(1) 所有类都继承自一个Object的超类,可以使用其中的特殊方法

(2) 构造器不会向上检索

#### 4.5 方法重写

(1) 加入注解“@Override”

(2) 重写和重载的区别


#### 4.6 final关键字

(1) final 修饰类，类不能继承

(2) final 修饰方法，方法不能重写

(3) final 修饰变量，基础数据类型，值不能改变；引用数据类型，地址空间不能改变，实列能变

### DAY4--4 Object

#### 4.1 Object类(祖先类)

- 所有的类，默认继承自祖先类

(1) 11个方法，8个公共方法

#### 4.2 hashcode
- 简单的例子：对10取余运算

(1) 散列，音译过来hash， 将任意长度的输入，通过散列算法，变成固定长度的输出，输出的值就是散列值

(2) 一个好的哈希算法，原文发生微小的改变，散列值发生巨大变化

(3) 一个好的哈希算法，还能尽量避免发生hash值重复的情况，也叫hash碰撞

(4) hash用途：a.密码保存 b.文件的校验 c.检测数据的一致性

##### 常见的Hash摘要算法

###### MD5

通过算法的名字，得到一个算法的实例，再使用算法的方法进行哈希散列。

##### hash算法和String的hash

hashCode()中为什么是31作为乘数，31*h+val[i]

(1) 奇质数，偶数容易溢出 (2) 31*h = (h << 5) - h,jvm里面优化，位运算的效率高。

(1)实用角度，31作为乘数，碰撞发生的次数少,用例说明：首先生成5000个随机的长度为1000的字符串，String为引用数据类型，直接使用hashCode函数会调用Object类里面的hashCode函数，不管怎么改变String的值，hash值不会发生变化，因此重新写了一个hashCode模拟了这个过程，得到的结果是，再31附近的几个数组，31的碰撞次数最少。

#### equal

(1) ==和equals区别， ==比较基础数据类型，也可以比较引用数据类型，基础数据类型比较的是值，引用数据类型比较的是内存地址。

(2) equals是Object类中的一个方法，默认实现的是==

(3) 我们可以重写equals方法，像String中就重写了equals方法，所有字符串中的equals比较的是每一个字符。

#### finalize

(1) java提供finalize()方法，垃圾回收器准备释放内存的时候，会先调用finalize()。

(2) 垃圾回收和finalize()都是靠不住的，只要JVM还没有快到耗尽内存的地步，就不会浪费时间进行垃圾回收。

(3) "@Deprecated(since="9")"注解表示已经过时了



#### toString()

(1) String类中重写了toString方法，打印时，输出结果时自己

(2) 其它类中，调用的是Object类中的方法，全限定名称 + ”@“ + 十六位的内存地址

#### clone()

(1) Object类中的clone是浅拷贝，工作中不怎么用

(2) 浅拷贝只拷贝第一层的对象，不拷贝对象中的引用对象， 当我们修改拷贝对象中的引用对象时，原对象的引用对象也会发生变化。


### DAY5---1 polymorphism 多态

#### 宏观上来讲

现在有一个宠物类，宠物类中有一个方法叫宠物在吃饭。猫和狗都可以作为宠物饲养，但猫要吃猫粮，狗要吃狗粮。有个小女孩要喂养她的宠物，这个宠物可以是猫也可以是狗。从上述行为中我们总结了多态形成的三个条件。
(1) 有继承，猫和狗都继承自宠物。
(2) 有重写，猫要吃猫粮，狗要吃狗粮。
(3) 父类应用指向子类对象，小女孩喂养宠物，这个宠物是狗也可以是猫。

#### 多态的底层原理
字节码---Out文件中找到class文件---通过UE查看16进制数

在java中，对其右键，选择”open in“---"Terminal"---键入指令”javap -v .\Computer.class“

~~**** 找时间再看一次多态的内容 ****~~



### DAY5---2 抽象类和接口

(1) 面向程序设计(OOP)三大特性：封装、继承、多态。

(2) 接口是多实现的，一个类可以有多个接口。但是只能继承一个类。

(3) 接口之间可以相互继承。

(4) 继承是is-a的关系，dog is an animals;

(5) 实现是can do的关系，飞机能飞、鸟能飞

(6) String 实现了 java.io.Serializable, Comparable<String>, CharSequence---序列化(变成二进制流的方式)、可比较、一个可读的序列

(7) 抽象类是模板式的设计、接口是契约式的设计。


### DAY5---3 软件设计原则

- 设计模式是人们为软件开发中相同表征问题，抽象出的可重复利用的解决方案。在某种程度上，设计模式已经代表了一些特定情况的最佳实现，同时也起到了软件工程师之间沟通的”行话“的作用。理解和掌握典型的设计模式，有利于我们提高沟通、设计的效率和质量。


#### 5.1 面向对象设计原则

(1) 开闭原则

- 对拓展开放，对修改关闭
- 通过抽象约束、封装变化来实现。
- 即通过接口或者抽象类为软件实体定义一个相对稳定的抽象层，而将相同的可变因素封装在相同的具体实现类中。
- 从抽象类中派生一个实现类 --- 当软件需要发生变化时，只需要根据需求重新派生一个实现类来拓展即可

(2) 里氏代换原则

- 子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法

(3) 依赖倒转原则

- 要面向接口编程，不要面向实现编程

1.每个类尽量提供接口或抽象类，或两者都具备

2.变量的声明类型尽量是接口或者是抽象类

3.任何类都不应该从具体类派生

4.使用继承时，尽量遵循里式替换原则


(4) 接口隔离原则

- 要求程序员尽量将臃肿庞大的接口拆分成更小的和更具体的接口，让接口只包含客户感兴趣的方法。

(5) 迪米特法则(最少知道原则)
- 只与你的直接朋友交谈，不跟“陌生人”说话（Talk only to your immediate friends and not to strangers）。其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。


(6) 合成复用原则

- 原则是尽量使用合成/聚合的方式，而不是使用继承。如果要使用继承关系，则必须严格遵循里氏替换原则。合成复用原则同里氏替换原则相辅相成的，两者都是开闭原则的具体实现规范。

(7) 单一原则
- 一个类只做一件事情



### DAY6---1 模板方法设计模式

(1) 所有需要子类具体实现的方法都用抽象类定义

(2) 所有子类中必须实现的方法都定义在父类里面 //流程类的过程，子类不需要知道具体的实现流程

### DAY6---2 策略设计模式

(1) 面向顶层设计

(2) 解耦合

(3) 开闭原则

### DAY6---3 静态代码块和示例代码块

(1) 实例代码块默认放到无参构造器中实现

(2) 各种代码块的指向顺序

(3) 静态代变量和成员变量的赋值

#### 静态代变量和成员变量的赋值

(1) 静态变量的使用，<类名. + 变量名>

(2) 静态方法的使用，<类名. + 方法名>

(3) 静态的变量或者静态的方法是存在方法区的，其他的方法也在方法区（永久带，元空间）。


#### 静态方法和成员方法

(1) 调用实例方法一定要new对象。也就是一定要有主体，不能直接当做参数使用，也不能直接调用。

(2) 在一个类中直接调用时，省略了this，而在静态方法中没有this，所以在静态方法中调用实例方法，必须new一个对象。

(3) 静态方法无论在那里都是类名.方法名调用，同一个类的静态方法之间可以相互调用，忽略类名，但建议写上。


#### 静态方法和静态常量的使用场景

(1) 使用静态方法完成一些工具性质的类

(2) 静态常量+final关键字修饰，可以定义一些静态常量

(3) 静态常量，字母全部大小

(4) 一处修改，处处修改(好记)


#### 内部类

(1) 80%都是静态内部类

#### 单例设计模式 懒汉和饿汉

(1) 饿汉--一开始就完成初始化； 懒汉--只要使用时才会开辟一个新的空间进行使用。

#### 静态内部类实现单例

#### 匿名内部类

(1) 实现接口的匿名内部类

(2) 匿名(继承父类)子类


#### 箭头函数和函数式接口

- 看day6 arrow的package，应用在strategy中的client

(1) 实现上同匿名内部类，当接口只有一个函数时，可以简化，return只有一个语句时，也可以简化，简化的结果同上。


#### 值传递和所谓的传递引用 --- delivery

(1) Java里面一般只有值传递

(2) 传入的对象不是之前那个对象，只是一个值的拷贝，像引用对像String就会拷贝它的地址，在进行赋值时，在方法区的常量池中分配一个空间给它，对原地址的值没有改变。

(3) 在类中，拷贝的是地址，setName是直接对该地址上的值进行修改，但是new一个空间，会将该空间的地址赋值给拷贝的对象，没有对原来地址上的值进行修改。

#### main方法深入

(1) main方法是所有程序的入口

(2) 可以有很多main方法，执行时只能从一个main方法进入。

(3) Client.java import
$ javac Client.java
$ java Client 1 2 3 4 5 参数

### DAY7---1 JVM

- 编译型还是解释型？

(1) java 是 编译型和解释性，javac将程序编译成字节码文件，字节码文件在Jvm中一行一行的执行

(2) JIT 即使编译器 吞吐量高、有运行时的性能加成、可以跑的很快、能做到动态生成代码、但启动速度慢、并需要一定时间和频率才能触发JIT的分层机制。

(3) AOT 编译器将源代码直接编译成本地机器码

(4) 前端 编译器，像Javac 将程序编译成字节码文件

- 动态类型还是静态类型？

(1) 静态类型语言，强类型定义语言


#### 计算一个对象在内存的大小

![img.png](image/img1.png)

#### 类的加载


#### 垃圾回收
程序的绝大部分时朝生夕死，对使用过以后不再使用的对象，需要从堆内存中清除。栈内存是不需要清除数据的。栈的数据特点，一个数据从栈中弹出后，数据自然就被清理掉了，当然方法区存有我们的元数据，这些数据也是不需要清理的。

(1) 引用计数器法（会造成循环引用的问题）

(2) 根可达算法，通过一系列的称为"GC Roots" 的对象作为起始点，从这些节点向下搜索，搜索走过的路径称为引用链，当一个对象到“GC Root“没有任何引用链时，证明此对象不可用。解决了循环引用的问题。

- 在Java语言中，可作为”GC Roots“的对象包括以下几种：
- 虚拟机栈(栈帧中的本地变量表)中引用的对象
- 方法区中类静态属性引用的对象
- 方法区中常量引用的对象

#### 垃圾回收算法(4种)

(1) 标记-清除算法 (先标记，后清除。产生大量内存碎片)

(2) 复制算法 (堆空间分成两块，有用的复制到另一边；空间换时间)

(3) 标记整理算法 (标记清除后，将碎片补上；进行较多复制操作，效率会变低)

(4) 分代收集算法 (结合了复制算法和标记整理算法的优点，分为年轻代（频繁的更迭，使用复制算法、空间换时间）和老年代(长久存在，使用标记整理算法、时间换空间))

#### 垃圾回收器(小程序，集成在jdk)


### DAY7---2 API

- API (Application Programming Interface) 应用程序接口，是一些预先定义的接口。
- JDK 能够提供给我们使用的类的接口方法

#### Date

#### Calendar

#### simpleDateFormat时间格式化器

#### instance (推荐使用，看实际工作需求)

#### LocalDate详解

Duration(持续时间) 是TemporalAmount(时间量) 的子类。

主要用在instant的日期计算

#### DateTimeFormatter(线程安全的，推荐使用)



#### Math BigDecimal Random(加种子：一直使用下去就是随机，重复使用种子的生成随机数结果相同)

#### Arrays


#### System

#### StringBuilder和StringBuffer***

(1) StringBuffer是线程安全的，效率低。

(2) StringBuilder是非同步的，可以不需要额外的同步于多线程中。



### DAY8---1 error
- Throwable 异常的父类

(1) OutOfMemoryError 内存溢出错误


(2) StackOverflowError 栈内存溢出错误


(3) NoClassDefFoundError 找不到class定义错误


### DAY8---2 Exception
异常链

### DAY8---3 泛型，泛型方法


### 泛型通配符
无界 "?"可以接收任何类型
```java
    public static void printSuperArray(SuperArray<?> superArray){
        for (int i = 0;i<superArray.size();i++){
            System.out.println(superArray.get(i));
        }
    }
```

上界 (SuperArray<? extends Dog> superArray)的形式来约定传入参数的上界，意思就是泛型只能是Dog的或者Dog的子类。
```java
    public static void printSuperArray(SuperArray<? extends Dog> superArray){
        for (int i = 0;i<superArray.size();i++){
            System.out.println(superArray.get(i));
        }
    }
```

下界  我们可以使用(SuperArray<? super Dog> superArray)的形式来约定传入参数的下界，意思就是泛型只能是Dog的或者Dog的超类
```java
    public static void printSuperArray(SuperArray<? super Dog> superArray){
        for (int i = 0;i<superArray.size();i++){
            System.out.println(superArray.get(i));
        }
    }
```


#### 类型擦除

(1) 泛型不能是基本数据类型

(2) 重载方法，如果泛型类型因为具体的泛型不同而导致方法签名不同，那么以下两个方法就是两重载方法

#### 类型擦除和多态的冲突

父类在类型擦除后，为Object类，子类在继承父类时指定了泛型的具体类型，导致重写的方法看上去是重载，JVM中使用了桥接的方法，找到子类方法中同名的参数为Object方法去实现了重写。


#### 静态和泛型

```java
public class Test<T> {
	privat T t;
	private static T s;//会出错，静态常量在类加载时初始化，在static代码块中赋值，但泛型在创建对象或调用方法时明确类型，所以在静态常量中不能使用泛型
    // 静态方法在调用时传参，可以明确类型
}
```

### DAY9---1 枚举 enum

#### 静态导入

### DAY10---1 线程创建无返回值的线程

```java
// 1. 继承Thread类重写run方法
public class Test extends Thread {
	@Override
	public void run() {
		super.run();
	}
}

// 2. 实现Runnable接口
public class Test implements Runnable {
	@Override
	public void run() {
		System.out.println("实现Runnable接口！");
	}
}

// 3. 使用lamdma表达式
new Thread(() -> System.out.println(4)).start();

```

### DAY10---2 线程创建有返回值的线程
```java
// 指定返回值类型，重写call方法
public class UseCallable implements Callable<Long> {
```

#### 创建线程的好处、效率和异步


### DAY10---3 守护线程
```java
Thread t1 = new Thread(
		() - > {
			a = a + b;
        });
t1.setDaeman(true);
```

```java
Thread t1 = new Thread();

t1.start();

t1.join(); // 阻塞当前调用的线程，等该线程先执行完成
```


### DAY10---4 cpu多缓存架构

(1) CPU多核缓存架构

(2) 局部性原理

### DAY10---5 JMM模型中存在的问题

(1) 指令重排，在同一个线程中，没有数据依赖的指令进行重排，但是在多线程中，会出现问题，在这个线程中出现指令重排，另一个线程中出现指令重排，指令执行的结果会导致另一个线程执行的结果发生改变

(2) 内存屏障和对象半初始化

在java语言中使用volatile关键字来保证一个变量在一次读写操作时的避免指令重排，【内存屏障】是在我们的读写操作之前加入一条指令，当CPU碰到这条指令后必须等到前边的指令执行完成才能继续执行下一条指令。

一个对象的半初始化状态
Dog dog = new Dog();
new 1.
invokespecial init 2.
ldc 3.
123 或者 132
问题：132 在13和2之间要使用对象，发生空指针异常

(3) 内存可见性 
```java
// day10.deaman.MemorySee
// 由于一直从缓冲区中拿flag， 即使修改了内存中的flag值，还是会继续空转
public volatile static boolean flag = false;
// 使用volatile关键字进行修饰，写操作时，立刻强制刷新主存，并且将其它缓存区域的值设置为不可用，从主存中拿取
```

(4) volatile关键字总结，1.禁止指令重排 2.内存可见性

(5) as-if-serial语义保证单线程内程序的执行结果不被改变，happens-before关系保证正确同步的多线程程序的执行结果不被改变


(6) 线程争抢(JVM中分为线程内存和主内存) synchronized 关键字修饰方法，只要一个线程用完后，才允许另一个进程进行使用
```java
// 1.给程序上锁
    public synchronized static void add(){
		COUNT++;
    }

// 2.同步代码块
    synchronized (Ticket.class){
	    System.out.println(name + "出票一张，还剩" + Ticket.COUNT-- + "张！");
    }
			
			
```

### DAY10---6 线程安全的实现方法

(1) 数据不可变。在java中一切不可变的对象(immutable)一定是线程安全的，无论是对象的方法实现还是方法的调用者，都不需要再进行任何线程安全保障的措施，比如final关键字

(2) 互斥同步，互斥同步是常见的一种并发正确性的保障手段，同步是指在多个线程并发访问共享数据时，保证共享数据在同一时刻只被一个线程使用，互斥是实现同步的一种手段，互斥是因，同步是果。
    java中最基本的互斥同步手段是
```java
// synchoronized字段，除了synchronize的之外，还可以使用ReentrantLock等工具类实现。
```

(3) 非阻塞同步
互斥同步面临的主要问题是，进行线程阻塞和唤醒带来的性能开销，因此这种同步也被称为阻塞同步，从解决问题的方式上来看互斥同步是一种【悲观的并发策略】，其总是认为，只要不去做正确的同步措施，那就肯定会出现问题，无论共享的数据是否真的出现，都会进行加锁。这将会导致用户态到内核态的转化、维护锁计数器和检查是否被阻塞的线程需要被唤醒等等开销。

随着硬件指令级的发展，我们已经有了另外的选择，基于【冲突检测的乐观并发策略】。通俗的说，就是不管有没有风险，先进行操作，如果没有其他线程征用共享数据，那就直接成功，如果共享数据确实被征用产生了冲突，那就再进行补偿策略，常见的补偿策略就是不断的重试，直到出现没有竞争的共享数据为止，这种乐观并发策略的实现，不再需要把线程阻塞挂起，因此同步操作也被称为非阻塞同步，这种措施的代码也常常被称之为【无锁编程】，也就是咱们说的自旋。我们用cas来实现这种非阻塞同步，cas会在接下来的授课当中详细给大家介绍，现在先不着急。

(4) 无同步方案
 在我们这个工作当中，还经常遇到这样一种情况，多个线程需要共享数据，但是这些数据又可以在单独的线程当中计算，得出结果，而不被其他的线程所影响，如果能保证这一点，我们就可以把共享数据的可见范围限制在一个线程之内，这样就无需同步，也能够保证个个线程之间不出现数据征用的问题，说人话就是数据拿过来，我用我的，你用你的，从而保证线程安全，比如说咱们的ThreadLocal。

 ThreadLocal提供了线程内存储变量的能力，这些变量不同之处在于每一个线程读取的变量是对应的互相独立的。通过get和set方法就可以得到当前线程对应的值。

### DAY10---7 死锁

Java产生死锁的四个必要条件：1.互斥使用 2.不可抢占 3.请求和保持 4.循环等待

当上述四个条件的成立时，便形成死锁。当然，死锁情况下，打破上述任何一个条件，便可以让死锁消失。

#### 锁重入，获取一把锁后，在锁中可以重复进入锁🔒的内容

### DAY10---8 wait 和 notify

(1) wait 会释放锁。
(2) notify 会唤醒锁，notifyAll唤醒所有锁，等待抢占。

### DAY10---9 线程相关方法总结

方法总结：Thread的两个静态方法：

(1) sleep释放CPU资源，但不释放锁。

(2) yield方法释放了CPU的执行权，但时依然保留了CPU的执行资格。(不常用) // 不恰当的例子：你获取了上厕所的资格，但这时候有一个哥们特别急，划线，重新竞争。

线程实例方法：

(1) join: 是线程的方法，程序会阻塞在这里等待线程执行完毕，才继续往下执行。

(2) interrupt: 打断wait和sleep等阻塞过程，运行过程打断不了

Object的成员方法：

(1) wait: 释放CPU资源，同时释放锁。

(2) notify: 唤醒等待中的线程

(3) notifyAll: 唤醒所有等待的线程



### DAY10---10 线程退出

使用标志位退出

### DAY10---11 LockSupport

LockSupport 是一个线程阻塞工具类，所有的方法都是静态方法，可以让线程在任意位置阻塞，阻塞之后也有唤醒的方法。

主要有两类方法: park 和 unpark

```java
public static void park(Object blocker); // 暂停当前线程
public static void parkNanos(Object blocker, long nanos); // 暂停当前线程，不过有超时时间的限制
public static void parkUntil(Object blocker, long deadline); // 暂停当前线程，直到某个时间
public static void park(); // 无期限暂停当前线程
public static void parkNanos(long nanos); // 暂停当前线程，不过有超时时间的限制
public static void parkUntil(long deadline); // 暂停当前线程，直到某个时间
public static void unpark(Thread thread); // 恢复当前线程
public static Object getBlocker(Thread t);
```

### DAY10---12 lock锁

(1) synchronized锁，内置锁，隐式锁

(2) Lock锁

- Lock接口的几个重要方法

```java
// 获取锁  
void lock()   

// 仅在调用时锁为空闲状态才获取该锁，可以响应中断  
boolean tryLock()   

// 如果锁在给定的等待时间内空闲，并且当前线程未被中断，则获取锁  
boolean tryLock(long time, TimeUnit unit)   

// 释放锁  
void unlock()

```

- 获取锁，两种写法

```java

Lock lock = new Lock();
lock.lock();
try{
	
}catch(Exception ex){

}finally{
    lock.unlock(); // 释放锁	
}

```

```java

Lock lock = new Lock();
		
if(lock.tryLock()) {
    try{
    //处理任务
    }catch(Exception ex){
    }finally{
        lock.unlock();   //释放锁
    }
}else {
//如果不能获取锁，则直接做其他事情
}
```

(2.1) ReentrantLock

(2.2) ReentrantReadWriteLock

### DAY12---1 并发编程三大特性

- 原子性：原子操作定义：原子操作可以是一个步骤，也可以是多个步骤，但是其顺序不可以被打乱，也不可以被切割而执行其中的一部分(不可中断性)。 将整个操作视为一个整体是原子性的核心特征。原子性不仅仅是多行代码，也可能是多条指令。
- 可见性：
- 有序性：

cas深入详解
compareAndSet 将期望值和

JUnit
file->p...Stu->library->引包到moudle中

### DAY25--1 IO


### DAY25--2 序列化和反序列化


### DAY25--3 深拷贝浅拷贝


### DAY25--4 大作业：商品的增删改查



