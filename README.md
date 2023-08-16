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

