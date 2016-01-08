//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.
package arrays;
import java.util.*;

public class MultidimensionalPrimitiveArray {
  public static void main(String[] args) {
    int[][] a = {
      { 1, 2, 3, },
      { 4, 5, 6, },
    };
    System.out.println(Arrays.deepToString(a));//java API中自带的一种方法。
  }
} 

/* Output:
[[1, 2, 3], [4, 5, 6]]
*///:~
