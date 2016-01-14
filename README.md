# Java核心编程(第四版)学习笔记
## 第一章
## 第二章 一切都是对象
### 第一个HelloWord程序
<pre>
package github;
import java.util.*;

public class helloword {
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(new Date());
	}
}
</pre>

### foreach实现
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