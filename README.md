# Java学习笔记
## 语法
### 第一个 `HellWord`
<pre>
import java.util.*;

public class helloword {
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(new Date());
	}
}
</pre>

### `foreach`实现
<pre>
import java.util.*;

class arr{
	public static void foreach(){
		float arr[] = new float[10];
		Random value = new Random(50);
		
		for(int i = 0; i <= 9 ; i ++ ){
			arr[i] = value.nextFloat();
		}
		
		for(float x : arr){
			System.out.println(x);
		}
	}
}
</pre>


### `加减乘除`实现

<pre>
import java.math.BigDecimal;
class caculate {

	/**
	 * 加法实现
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	/**
	 * 减法实现
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	/**
	 * 乘法实现
	 * 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	/**
	 * 除法实现
	 * @param v1
	 * @param v2
	 * @param scale
	 * @return
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("Then param scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 除法实现
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 
	 * 小数点以后10位，以后的数字四舍五入。 
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static double div(double v1, double v2) {
		return div(v1, v2, 10);
	}
}

</pre>

## Java中堆和栈创建对象的区别
* 栈与堆都是Java用来在Ram中存放数据的地方。与C++不同，Java自动管理栈和堆，程序员不能直接地设置栈或堆。
* Java的堆是一个运行时数据区,类的对象从中分配空间。这些对象通过`new`、`newarray`、`anewarray`和`multianewarray`等指令建立，它们不需要程序代码来显式的释放。堆是由垃圾回收来负责的，堆的优势是可以动态地分配内存大小，生存期也不必事先告诉编译器，因为它是在运行时动态分配内存的，因此,用堆保存数据时会得到更大的灵活性。变量所需的存储空间只有在运行时创建了对象之后才能确定。Java的垃圾收集器会自动收走这些不再使用的数
据。但缺点是，由于要在运行时动态分配内存，存取速度较慢。

* 栈的优势是，存取速度比堆要快，仅次于寄存器，栈数据可以共享。但缺点是，存在栈中的数据大小与生存期必须是确定的，缺乏灵活性。栈中主要存放一些基本类型的变量（`int`, `short`, `long`, `byte`, `float`, `double`, `boolean`, `char`）和引用对象,栈里存的却是堆的首地址名；就像引用变量。 

* Java中分配堆内存是自动初始化的。Java中所有对象的存储空间都是在堆中分配的，但是这个对象的引用却是在堆栈中分配,也就是说在建立一个对象时从两个地方都分配内存，在堆中分配的内存实际建立这个对象，而在栈中分配的内存只是一个指向这个堆对象的指针(引用变量)而已。 在堆中分配的内存，由Java虚拟机的自动垃圾回收器来管理。 

* 在堆中产生了一个数组或对象后，还可以在栈中定义一个特殊的变量，让栈中这个变量的取值等于数组或对象在堆内存中的首地址，栈中的这个变量就成了数组或对象的引用变量。

* 引用变量是普通的变量，定义时在栈中分配，引用变量在程序运行到其作用域之外后被释放。而数组和对象本身在堆中分配，即使程序运行到使用 new 产生数组或者对象的语句所在的代码块之外，数组和对象本身占据的内存不会被释放，数组和对象在没有引用变量指向它的时候，才变为垃圾，不能在被使用，但仍然占据内存空间不放，在随后的一个不确定的时间被垃圾回收器收走（释放掉）。

* 例子：
`String s=new String("123");`
这个s就在栈里面，而他的"123"这个对象在堆里面。 s 指向`123`;
3.就对象本身而言，他的所有属性的值如果不是单例或者静态的，就是存储在堆里面的。一个类的所有对象的属性值都在堆里面并且占用不同的内存空间，而一个类的方法只在方法区里占一个地方

* 栈有一个很重要的特殊性，就是存在栈中的数据可以共享。假设我们同时定义：
`int a = 3;`
`int b = 3； `

* 编译器先处理int `a = 3`；首先它会在栈中创建一个变量为a的引用，然后查找栈中是否有3这个值，如果没找到，就将3存放进来，然后将a指向3。接着处理`int b = 3`；在创建完b的引用变量后，因为在栈中已经有3这个值，便将b直接指向3。这样，就出现了a与b同时均指向3的情况。

* 这时，如果再令a=4；那么编译器会重新搜索栈中是否有4值，如果没有，则将4存放进来，并令a指向4；如果已经有了，则直接将a指向这个地址。因此a值的改变不会影响
到b的值。
`a-------》3
b-------》3` ，这个3是共享存在的,a,b指向同一个地址，然后存进4，4也是共享存在的。

## enum枚举
* 特性
> `static values()` 按照enum常量的声明顺序，产生由这些常量构成的数组
> `ordinal()` 表示某个特定enum常量的声明顺序

* Demo
<pre>
/**
 * File EnumClass.java
 * @author qiuleo
 *
 */
enum Spiciness {
	NOT, MILD, MEDIUM, HOT, FLAMING
}

public class EnumClass {
	EnumClass() {
		this.order();
	}

	public void order() {
		for (Spiciness s : Spiciness.values()) {
			System.out.println("Spiciness enum value `" + s + "`, order is " + s.ordinal());
		}

	}
}
</pre>

