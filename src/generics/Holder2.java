package generics;
public class Holder2 {
	
	private Object a;
	
	public Holder2(Object a) { 
		this.a = a; 
	}
	
	public void set(Object a) { 
		this.a = a;
	}
	
	public Object get() { 
		return a; 
	}
	
	public static void main(String[] args) {
		
		//Holder2可以存储任何类型的对象
		Holder2 h2 = new Holder2(new Automobile());
		Automobile a = (Automobile)h2.get();//将获得的object对象引用转换为Automobile类型
		
		//set方法的参数是Object类型，可以传入任何类型参数
		h2.set("Not an Automobile");
		String s = (String)h2.get();//转化为String类型
		
		h2.set(1); // Autoboxes to Integer
		Integer x = (Integer)h2.get();
		
		System.out.println("Automobile a:"+a);
		System.out.println("String s:"+s);
		System.out.println("Integer x:"+x);
	}
}
