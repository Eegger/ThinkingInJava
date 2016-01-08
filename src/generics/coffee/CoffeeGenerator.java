//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
package generics.coffee;
import java.util.*;
import net.mindview.util.*;

public class CoffeeGenerator
implements Generator<Coffee>, Iterable<Coffee> {
	
	//定义存放类的数组
	private Class[] types = { Latte.class, Mocha.class,Cappuccino.class, Americano.class, Breve.class, };
	private static Random rand = new Random(47);//生成随机数
	
	public CoffeeGenerator() {
		//默认构造方法
	}
	
	// For iteration:
	private int size = 0;
	public CoffeeGenerator(int sz) { 
		size = sz;
	}	

	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		public boolean hasNext() { 
			return count > 0; 
		}
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	};	
	
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for(Coffee c : new CoffeeGenerator(5))
			System.out.println(c);
	}
} 
/* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
