# Java学习笔记
## 语法相关
### 第一个 `HellWord`
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

### `foreach`的实现
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