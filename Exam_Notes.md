# Unit 4
# Generic Method non return type
``` java:
import java.util.*;
class Person{
    public <T> void updata(T name){
    	System.out.println(name + "hello ...");
    }
}

class test{
    public static void main(String[] args) {
        Person p = new Person();
        p.updata("sam ");


    }
}
```

# Generic Method return type 
``` java:
import java.util.*;

class Person {
    public <T extends Number> T updata(T age) {
        Integer data = age.intValue() + 10;
        return (T) data;
    }
}

class test {
    public static void main(String[] args) {
        Person p = new Person();
        Integer result = p.<Integer>updata(50);
        System.out.println("Result : " + result);
    }
}
```


# Generic class instead of generic method
``` java:
import java.util.*;

class Person<T extends Number>{ // class itself type T
    public T updata(T point) { // No need to say method is type T.
        Integer data = point.intValue() + 10;
        return (T) data;
    }
}

class test {
    public static void main(String[] args) {
        Person<Integer> p = new Person<Integer>();
        Integer result = p.updata(50);
        System.out.println("Result : " + result);
    }
}
```

# Unit 5
# ListIterator VS Iterator 
``` java:

import java.util.*;

class test{
	public static void main(String []argc){
		LinkedList<String> lis = new LinkedList<String>();
		lis.add("Apple");
		lis.add("Mango");
		lis.add("Grape");
		System.out.println(lis);

		ListIterator<String> it = lis.listIterator();

		while(it.hasNext()){
			String ele = it.next();
			it.set(ele +"+");
		}
		System.out.println(it);
		System.out.println("ListIterator" + lis);
		//----------------------------

		Iterator<String> list = lis.iterator();
		System.out.println("In Loop");
		while(list.hasNext()){
			String ele = list.next();
			ele = (ele+"Cyber");
			System.out.println("\t"+ele);
		}
		System.out.println("Out Loop");
		System.out.println("Iterator :"+lis); // Iterater will not edit the content...

	}
}
```



















