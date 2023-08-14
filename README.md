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
