//: reusing/BlankFinal.java
// "Blank" final fields.
package reusing;

class Poppet {
	private int i;
	//构造方法，实现初始化
	Poppet(int ii){
		i = ii;
	}
}

public class BlankFinal {
  
	//初始化的final变量
	private final int i = 0;
	//没有初始化的final变量，也就是空白final
	private final int j; 
	private final Poppet p;

	//一个类的空白final，必须在构造方法中初始化
	public BlankFinal() {
		j = 1; // 初始化变量
		p = new Poppet(1); // 初始化对象引用
	}
	
	public BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}
	
	public static void main(String[] args) {
		BlankFinal b1 = new BlankFinal();
		BlankFinal b2 = new BlankFinal(47);
		System.out.println("BlankFinal()中j = "+b1.j+"p = "+b1.p);
		System.out.println("BlankFinal(47)中j = "+b2.j+"p = "+b2.p);
	}
} 
