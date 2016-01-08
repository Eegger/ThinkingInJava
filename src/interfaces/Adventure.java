package interfaces;
interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {}
}	

//一个类继承于一个类，并且实现多个接口。
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {}
	public void fly() {}
}

public class Adventure {
	
	public static void t(CanFight x) { 
		x.fight(); 
	}
	public static void u(CanSwim x) { 
		x.swim();
	}
	public static void v(CanFly x) { 
		x.fly();
	}
	public static void w(ActionCharacter x) { 
		x.fight();
	}
	//主函数，测试上面的内容
	public static void main(String[] args) {
		
		Hero h = new Hero();//创建一个实现过个接口的类的对象。
		
		/*同一个对象引用，可以匹配不同对象的方法，并且这些对象都是接口类型的
		 * Hero类型的对象h，依次被向上转型为每一个接口。
		 */
		t(h); // Treat it as a CanFight
		u(h); // Treat it as a CanSwim
		v(h); // Treat it as a CanFly
		w(h); // Treat it as an ActionCharacter
	}
} 
///:~
