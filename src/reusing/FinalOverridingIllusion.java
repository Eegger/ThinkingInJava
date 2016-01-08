//: reusing/FinalOverridingIllusion.java
// It only looks like you can override
// a private or private final method.

package reusing;
import static net.mindview.util.Print.*;

class WithFinals {
	// 明确将private设置为final
	private final void f() { 
		print("WithFinals.f()"); 
	}
	// private方法自动被设置为final
	private void g() { 
		print("WithFinals.g()"); 
	}
}

class OverridingPrivate extends WithFinals {
	
	private final void f() {
		print("OverridingPrivate.f()");
	}
	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	
	public final void f() {
		print("OverridingPrivate2.f()");
	}
	public void g() {
		print("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
  
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		//实际上执行的是子类的方法，尽管父类中有同名方法，但是父类中方法为final或者private，对子类是隐藏的情况。
		op2.f();
		op2.g();
		
		//可以向上转型，但是不能调用父类中的方法，也就是不能重载。
		OverridingPrivate op = op2;
		// But you can't call the methods:
		//! op.f();
		//! op.g();
		// Same here:
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}
} 

/* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~
