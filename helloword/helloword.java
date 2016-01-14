import java.util.*;
//import static net.mindview.util.Print.*;
class tasker {
	int counter = 0;
	
}
public class helloword {
	static int countName = 0;
	public static void main(String[] args){
		float arr[] = new float[10];
		Random value = new Random(50);
		
		for(int i = 0; i <= 9 ; i ++ ){
			arr[i] = value.nextFloat();
		}
		
		for(float x : arr){
			System.out.println(x);
		}
	}
	
	public static void print(String str){
		System.out.println(str);
	}
	
	
	public static boolean condition(){
		double randonMath = Math.random();
		boolean result = randonMath  < 0.99;
		helloword.print(randonMath + "");
		return result;
	}
	
	
	
	
	
}


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