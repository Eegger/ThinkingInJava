package interfaces.classprocessor;
import java.util.*;
import static net.mindview.util.Print.*;

class Processor {
	public String name() {
		return getClass().getSimpleName();//获得当前类引用对象的名字
	}
	Object process(Object input) { 
		return input;//返回输入的内容
	}
}	

class Upcase extends Processor {
	String process(Object input) {
		return ((String)input).toUpperCase();//调用系统自带的转换成大写的方法，将输出的内容转换成大写
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();//转换成小写
	}
}

class Splitter extends Processor {
	String process(Object input) {
    // The split() argument divides a String into pieces:
    return Arrays.toString(((String)input).split(" "));//将每个被空格分开的词，分离开来。
	}
}	

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
  
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
} 

/* Output:
Using Processor Upcase
DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Processor Downcase
disagreement with beliefs is by definition incorrect
Using Processor Splitter
[Disagreement, with, beliefs, is, by, definition, incorrect]
*///:~
