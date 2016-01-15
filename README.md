# Java学习笔记
## 语法相关
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