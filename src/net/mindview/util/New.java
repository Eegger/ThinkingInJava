//: net/mindview/util/New.java
// Utilities to simplify generic container creation
// by using type argument inference.
package net.mindview.util;
import java.util.*;

/*
 * 工具类，专门用来创建各种常用的容器对象；
 * 使用的是泛型方法。
 */
public class New {

	//创建哈希表
	public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
	}
	//创建数组
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	//创建链表
	public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
	}
	//创建哈希set
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}	
	//创建队列
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}

	public static void main(String[] args) {
		
		Map<String, List<String>> sls = New.map();//静态方法，直接用类名调用即可。
		List<String> ls = New.list();
		LinkedList<String> lls = New.lList();
		Set<String> ss = New.set();
		Queue<String> qs = New.queue();
	}
}

