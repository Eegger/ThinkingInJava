//: arrays/IceCream.java
// Returning arrays from methods.
package arrays;
import java.util.*;

public class IceCream {
	
	private static Random rand = new Random(47);
	//静态最终数组，存放的元素类型是String类型
	static final String[] FLAVORS = {
		"Chocolate", "Strawberry", "Vanilla Fudge Swirl",
		"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
		"Praline Cream", "Mud Pie"
	};
  
	public static String[] flavorSet(int n) {

		//如果传入参数太大，就抛出异常
		if(n > FLAVORS.length)throw new IllegalArgumentException("Set too big");
		
		//创建一个名为results的String数组，数组容量为n，由传入方法的参数决定
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		
		//每次传入不同的味道
		for(int i = 0; i < n; i++) {
			int t;
			do{
				t = rand.nextInt(FLAVORS.length);
			}
			while(picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
		}
		return results;//返回类型为数组
	}
  
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++)
			System.out.println(Arrays.toString(flavorSet(3)));
	}
} 

/* Output:
[Rum Raisin, Mint Chip, Mocha Almond Fudge]
[Chocolate, Strawberry, Mocha Almond Fudge]
[Strawberry, Mint Chip, Mocha Almond Fudge]
[Rum Raisin, Vanilla Fudge Swirl, Mud Pie]
[Vanilla Fudge Swirl, Chocolate, Mocha Almond Fudge]
[Praline Cream, Strawberry, Mocha Almond Fudge]
[Mocha Almond Fudge, Strawberry, Mint Chip]
*///:~
