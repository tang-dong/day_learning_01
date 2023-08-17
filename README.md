# 记录Java的学习历程
## 2023/08/13
学习了Java的相关基础：变量、运算符、输入输出、循环结构、分支结构、一部分数组的知识，发现虽然之前多学过但是都忘了，很多东西第二次再看的时候确实有和之前不同的感受！希望继续加油！坚持下去！

## 2023/08/14
学习了数组的相关基础知识，再次学习了冒泡排序、快速排序以及二分查找的相关原理和代码
### 冒泡排序：每经过一轮都可以选出一个最大值
```java
public static int[] bubble_Sort(int[] nums){
        boolean flag = true;  //假设数组已经是有序的
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    //如果数组发生了交换，说明数组还没有排好序
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return nums;
    }
```
### 快速排序
```java
public static void quickSort(int[] data) {
		subSort(data, 0, data.length - 1);
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;

			while (true) {
				//找出比base小的low 从前往后找
			    while (low < end && data[++low] <= base);
				//找出比base打的high  从后往前找
				while (high > start && data[--high] >= base);
				if (low < high) {
					//交换data数组[low]与[high]位置的元素
					swap(data, low, high);
				}else {
				    break;
				}
			}


			//交换data数组[start]与[high]位置的元素
			swap(data, start, high);

			//经过代码[start, high)部分的元素 比[high, end]都要小

			//通过递归调用，对data数组[start, high-1]部分的元素重复刚才的过程
			subSort(data, start, high - 1);
			//通过递归调用，对data数组[high+1,end]部分的元素重复刚才的过程
			subSort(data, high + 1, end);
		}
	}

	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
```
### 二分查找
```java
while (left <= right){
     int mid = (left + right) / 2;
     if (arr[mid] > num){
         right = mid - 1;
     }else if (arr[mid] < num) {
         left = mid + 1;
     }else if (arr[mid] == num){
         index = mid;
         break;
     }
}
```

## 2023/08/15
今天学习了Java中的面向对象（基础）的相关知识，包括方法的重载、可变个数形参，值传递和引用传递，递归方法。由于之前都学过，所以进度要快很多，代码量比较大，但基本上都是一些机械式的代码。这些都是一些基础，需要逐步的去夯实。

## 2023/08/16
今天实验室停电，所以学习进度有些落下了。晚上来点后才过来学习了Java基础中面向对象的三大要素，封装、继承、多态。同时更加加深了对重载(overload)和重写(override/overwrite)的认识。
#### 重载（Overload）
+ 定义：重载是指在同一个类中，可以有多个具有相同名称但参数列表不同的方法。
+ 特点：重载方法必须具有不同的参数类型、参数数量或参数顺序，但方法名必须相同。
+ 作用：通过重载，可以根据不同的参数类型或数量来执行不同的操作，提高代码的灵活性和可读性。
#### 重写（Override / Overwrite）：
+ 定义：重写是指在子类中重新定义（覆盖）从父类继承而来的方法，以改变其行为。
+ 特点：重写方法必须具有相同的方法名、参数列表和返回类型。
+ 作用：通过重写，可以根据子类的特定需求修改父类的方法实现，实现多态性和特定行为的定制。

以及对super的重新认识，以前在学到这里的时候没有很在意，后面到学JavaWeb的时候遇到规模比较复杂的问题是，需要调用super就感觉有些蒙了。
> 3.1 super调用属性、方法
子类继承父类以后，我们就可以在子类的方法或构造器中，调用父类中声明的属性或方法。（满足封装性的前提下）
如何调用呢？需要使用"super."的结构，表示调用父类的属性或方法。
一般情况下，我们可以考虑省略"super."的结构。但是，**如果出现子类重写了父类的方法或子父类中出现了同名的属性时，
则必须使用"super."的声明**，显式的调用父类被重写的方法或父类中声明的同名的属性。

> 3.2 super调用构造器
① 子类继承父类时，不会继承父类的构造器。只能通过“super(形参列表)”的方式调用父类指定的构造器。
② 规定：“super(形参列表)”，必须声明在构造器的首行。
③ 我们前面讲过，在构造器的首行可以使用"this(形参列表)"，调用本类中重载的构造器，
结合②，结论：在构造器的首行，"this(形参列表)" 和 "super(形参列表)"只能二选一。
④ 如果在子类构造器的首行既没有显示调用"this(形参列表)"，也没有显式调用"super(形参列表)"，
则子类此构造器默认调用"super()"，即调用父类中空参的构造器。
⑤ 由③和④得到结论：子类的任何一个构造器中，要么会调用本类中重载的构造器，要么会调用父类的构造器。
只能是这两种情况之一。
⑥ 由⑤得到：一个类中声明有n个构造器，最多有n-1个构造器中使用了"this(形参列表)"，
则剩下的那个一定使用"super(形参列表)"。

#### 成员变量不具有多态性
```java
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count); //这个 this.count 就是表示的是当前的Sub下的count值
    }
}

public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);// 20
        s.display();// 20
        Base b = s;  //多态 调用的还是 s 中的 display()
        System.out.println(b == s); // true  相当于将 s 的地址值直接赋值给了 b
        /*
        * 在这段代码中，b 是一个 Base 类型的引用，指向一个 Sub 类的对象。当通过 b 访问成员变量 count 时，由于成员变量不具有多态性，
        * 所以访问的是引用类型 Base 的成员变量 count，而不是对象类型 Sub 的成员变量。
        * */
        System.out.println(b.count);// 10
        b.display();// 20

        Base b1 = new Base();
        System.out.println(b1.count); // 10
        b1.display();// 10
    }
}
```

#### 面试题： 区分 == 和 equals()
对于字符串变量来说，使用"=="和"equals"比较字符串时，其比较方法不同。"=="比较两个变量本身的值，即两个对象在内存中的首地址，"equals"比较字符串包含内容是否相同。

对于非字符串变量来说，如果没有对equals()进行重写的话，"==" 和 "equals"方法的作用是相同的，都是用来比较对象在堆内存中的首地址，即用来比较两个引用变量是否指向同一个对象。

#### 面试题：final 、 finally 、 finalize 的区别
final 可以用来修饰：类、方法、变量和参数，其中可以用来修饰“参数”这一项，容易被人遗忘，这是 final 的 4 种用法。
##### final 用法说明
+ 当 final 修饰类时，此类不允许被继承，表示此类设计的很完美，不需要被修改和扩展。
+ 当 final 修饰方法时，此方法不允许任何从此类继承的类来重写此方法，表示此方法提供的功能已经满足当前要求，不需要进行扩展。
+ 当 final 修饰变量时，表示该变量一旦被初始化便不可以被修改。
+ 当 final 修饰参数时，表示此参数在整个方法内不允许被修改。

finally 则是 Java 中保证重点代码一定要被执行的一种机制。
我们可以使用 try-finally 或者 try-catch-finally 来进行类似关闭 JDBC 连接、保证释放锁等动作。
##### finally 用法
```java
try {
    // do something
} finally {
    // 一定会执行的代码
}
```
有时候面试也会问：finally 是否一定会被执行？这是一个有诱导嫌疑的问题，正常情况下 finally 一定是会执行的，但有一个特殊情况 finally 也是不会执行的，特殊的实现代码和执行结果如下：
```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("执行try代码. ");
            System.exit(0);
        }finally {
            System.out.println("执行finally. ");
        }
    }
}
```

finalize 是 Object 类中的一个基础方法，它的设计目的是保证对象在被垃圾收集前完成特定资源的回收，但在 JDK 9 中已经被标记为弃用的方法（deprecated）。

在实际开发中不推荐使用 finalize 方法，它虽然被创造出来，但无法保证 finalize 方法一定会被执行，所以不要依赖它释放任何资源，因为它的执行极不“稳定”。在 JDK 9 中将它废弃，也很好的证明了此观点。
finalize 除了执行“不稳定”之外，还有一定的性能问题。 ​

因为 finalize 的执行是和垃圾收集关联在一起的，一旦实现了非空的 finalize 方法，就会导致相应对象回收呈现数量级上的变慢，有人专门做过 benchmark，大概是 40~50 倍的下降。 ​

因为 finalize 被设计成在对象被垃圾收集前调用，这就意味着实现了 finalize 方法的对象是个“特殊公民”，JVM 要对它进行额外处理。finalize 本质上成为了快速回收的阻碍者，可能导致你的对象经过多个垃圾收集周期才能被回收。

##### 总结
>final、finally 和 finalize 从英文字面角度来看，看似很像，实则 3 者在 Java 中没任何关系。
final 是用来修饰类、方法、变量和参数的关键字，被 final 修饰的对象不允许修改或替换其原始值或定义；
finally 是 Java 中保证重点代码一定要被执行的一种机制；
finalize 是 Object 类中的一个基础方法，它的设计目的是保证对象在被垃圾收集前完成特定资源的回收的，但其执行“不稳定”，且有一定的性能问题，已经在 JDK 9 中被设置为弃用的方法了。