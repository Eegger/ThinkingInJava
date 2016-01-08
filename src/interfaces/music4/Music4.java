package interfaces.music4;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

abstract class Instrument {
	
	private int i;
	//Abstract修饰的方法，没有方法体，是抽象方法
	public abstract void play(Note n);
	//下面的方法不是抽象方法，只要类中存在抽象方法，该类就是抽象类
	public String what() { 
		return "Instrument"; 
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	
	//继承了抽象类，并希望创建新类的对象，那么必须为基类中的所有抽象方法提供方法定义
	public void play(Note n) {
		print("Wind.play() " + n);
	}
	
	public String what() { 
		return "Wind";
	}
	public void adjust() 
	{
		//为抽象方法提供了方法体，虽然方法体为空。
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() { 
		return "Percussion";
	}
	public void adjust() {
		
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
	public String what() { 
		return "Stringed";
	}
	public void adjust() {}
}	

class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play() " + n);
	}
	public void adjust() { 
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String what() { 
		return "Woodwind";
	}
}	

public class Music4 {

	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
  
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
