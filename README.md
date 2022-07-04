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

4.1

