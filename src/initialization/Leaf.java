//: initialization/Leaf.java
// Simple use of the "this" keyword.
package initialization;

public class Leaf {
  int i = 0;
  Leaf increment() {
    i++;
    return this;
  }
  void print() {
    System.out.println("i = " + i);
  }
  public static void main(String[] args) {
    Leaf x = new Leaf();
    
    //需要记住这种方法，这种调用方式很有意思。
    x.increment().increment().increment().print();
  }
} 

/* Output:
i = 3
*///:~
