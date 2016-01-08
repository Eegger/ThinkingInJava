//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}
package strings;
import java.util.*;

public class InfiniteRecursion {
	
	public String toString() {
		return " InfiniteRecursion address: " + super.toString() + "\n";//这里发生自动类型转换，从而导致异常。
		//return " InfiniteRecursion address: " + this + "\n";//这里发生自动类型转换，从而导致异常。
	}
  
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
} 
