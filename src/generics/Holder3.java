//: generics/Holder3.java
package generics;

public class Holder3<T> {

	private T a;
	public Holder3(T a) { 
		this.a = a;
	}
	
	public void set(T a) { 
		this.a = a;
	}
  
	public T get() { 
		return a; 
	}
	
	public static void main(String[] args) {
		
		//创建对象的时候，先指明持有什么类型的对象。
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get(); // No cast needed
		// h3.set("Not an Automobile"); // Error
		// h3.set(1); // Error
		System.out.println(a);
	}
} 
