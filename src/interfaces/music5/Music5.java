//: interfaces/music5/Music5.java
// Interfaces.
package interfaces.music5;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

//创建接口，如果不添加public修饰符，那么这个接口只有包访问权限。
interface Instrument {

	//接口中的变量默认为final和static的
	int VALUE = 5;
	//接口中的方法默认是public的，并且只有方法声明，没有方法体。
	void play(Note n);
	void adjust();
}

class Wind implements Instrument {
	//该类实现了上面定义的接口，在方法中给出方法体。
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { 
		return "Wind"; 
	}
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { 
		return "Percussion";
	}
	public void adjust() { 
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { 
		return "Stringed";
	}
	public void adjust() { 
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	//继承。子类方法覆盖父类方法。
	public String toString() { 
		return "Brass";
	}
}	

class Woodwind extends Wind {
	public String toString() { 
		return "Woodwind";
	}
}

public class Music5 {

	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
  
	//使用foreach语法，输出数组每个元素，其中数组的每个元素都是一个Instructent对象，或者是其子类对象，这里用到了向上转型，多态的概念。
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}	
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
} 

/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
