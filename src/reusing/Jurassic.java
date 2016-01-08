//: reusing/Jurassic.java
// Making an entire class final.
package reusing;
class SmallBrain {}

//final类，很完美，不被子类继承，不改变。
final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

//final类不能被继承，final类中的方法不能被覆盖
//class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
  public static void main(String[] args) {
    Dinosaur n = new Dinosaur();
    n.f();
    n.i = 40;
    n.j++;
    System.out.println("n.i = "+n.i);
    System.out.println("n.j = "+n.j);
    
  }
} ///:~
