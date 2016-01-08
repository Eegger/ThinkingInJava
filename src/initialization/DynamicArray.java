//: initialization/DynamicArray.java
// Array initialization.

/*
 * other.main这种用法第一次见，很神奇。。。。。other就是一个函数，下面有定义，醉了
 */
package initialization;
public class DynamicArray {
  public static void main(String[] args) {
    Other.main(new String[]{ "fiddle", "de", "dum" });
  }
}

class Other {
  public static void main(String[] args) {
    for(String s : args)
      System.out.print(s + " ");
  }
} /* Output:
fiddle de dum
*///:~
