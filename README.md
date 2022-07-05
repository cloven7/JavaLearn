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






