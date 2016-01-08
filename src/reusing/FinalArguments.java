//: reusing/FinalArguments.java
// Using "final" with method arguments.
package reusing;

/*
 * final参数，意味着无法更改参数引用所指向的对象。
 */
class Gizmo {
	public void spin() {}
}

public class FinalArguments {
	void with(final Gizmo g) {
		//这里是final参数，无法对g的指向进行重新初始化
		//! g = new Gizmo(); // Illegal -- g is final
	}
  
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}
	//不能改变final参数的值
	//void f(final int i) { i++; } // Can't change
	//可以读取final参数的值	
	int g(final int i) { return i + 1; }
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
		
		//System.out.println("bf.without(null)"+bf.without(null));
		//System.out.println("bf.with(null)"+bf.with(null));
		
	}
}
