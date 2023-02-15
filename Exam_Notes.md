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

# Generic Interface
``` java:
import java.util.*;
import java.util.*;

interface Person<T>{ 
	
    public void add(T point);
    public T display();

}
class work<T> implements Person<T>{
	private T data;
	public void add(T point){
		data = point;
	}
    public T display(){
    	return data;
    }
}
class test {
    public static void main(String[] args) {
        work<Integer> w1 = new work<Integer>();
        w1.add(19);
        System.out.print(w1.display());
        System.out.print("\n");
        work<Integer> w2 = new work<Integer>();
        w2.add(4589);
        System.out.print(w2.display());
        
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

# Algorithm in collections
``` java:

import java.util.*;

class test{
	public static void main(String []argc){
		ArrayList<Integer> lis = new ArrayList<Integer>();
		lis.add(86);
		lis.add(54);
		lis.add(29);
		lis.add(66);
		lis.add(73);
		lis.add(16);
		lis.add(1);
		System.out.println("Array Data : " + lis);
		Collections.sort(lis);
		System.out.println("After Sort Algo: " + lis);
		Collections.shuffle(lis);
		System.out.println("After Shuffle Algo: " + lis);
		Collections.reverse(lis);
		System.out.println("After Reverse Algo: " + lis);
		Collections.swap(lis,0,1);
		System.out.println("After Swap Algo: " + lis);
		Collections.rotate(lis,2);
		System.out.println("After Rotate Algo: " + lis);
		Collections.frequency(lis,5);
		System.out.println("After frequency Algo : " + lis);

	}
}
```


















