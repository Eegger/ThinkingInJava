//: initialization/ArrayNew.java
// Creating arrays with new.
package initialization;

import java.util.*;
import static net.mindview.util.Print.*;

public class ArrayNew {
  public static void main(String[] args) {
    int[] a;//开始并不知道数组元素的个数
    Random rand = new Random(47);
    a = new int[rand.nextInt(20)];//对数组进行初始化，但是一般都是默认值，也就是0
    print("length of a = " + a.length);
    print(Arrays.toString(a));
  }
} /* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*///:~
