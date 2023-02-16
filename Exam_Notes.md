# Important Topic for Exam
- Principles of OOPs
	- Object : instance of class.
	- Class : collections of oblect and methods.
	- Abstraction : repesenting essential **without the background cod**.
	- Encapsulation : Wapping up data and methods.
	- Polymorphism : Talking in more than one form. eg:Overloading
	- Inheritance : derived class share common properties.
	- Dinamic Binding : overriding....
	- Message Passing : 
	- Robust : Exception Handling.
	- Secure : bytecode...
- Benefits of OOPs
- **==**
	- is a Operator
	- compare two Objects based on the memory reference.
- .equales()
	- is a method.
	- compare the content of the object
	- can be override.
- Constructors
	- Default constructors 
	- parameterized constructors 
	- no-arg constructors
	- Multiple constructor
- Method overloading
- Static member
- Static member function
- Access specifiers
	- Default, public, private, and protected
- Finalize method

# Unit 2
# find the O/p
``` java
class c1{
	public int amount=242;
	public c1 (int a){
		System.out.println("c1"+a);
	}
}

class c2 extends c1{
	public c2 (int a, int b){
		super(a);
		System.out.println("c2" + b);
	}
}

class c3 extends c2{
	public c3(int a,int b,int c){
		super(a,b);
		System.out.print("c3" + c);
	}
}
public class test{
	public static void main(String []argcs){
		c3 b = new c3(1,2,3);
	}
}
```
# find the O/p
``` java
class c1{
	public int amount=242;
	public c1 (int a){
		System.out.println("c1"+a);
	}
}

class c2 extends c1{
	public c2 (int a, int b){
		super(a);
		System.out.println("c2" + b);
	}
}

class c3 extends c2{
	public c3(int a,int b,int c){
		super(a,b);
		System.out.print("c3" + c);
	}
}
public class test{
	public static void main(String []argcs){
		c1 b = new c2(1,2);
	}
}
```
# find the O/p
``` java
class P 
{ 
    int a = 30; 
} 
class Q extends P 
{ 
    int a = 50; 
} 
public class test  { 
   public static void main(String[] args) 
   { 
      Q q = new Q();
      System.out.println(" Value of a: " +q.a); 

      P p = new Q();
      System.out.println("Value of a: " +p.a); 
  } 
}
```
# Overloading
```java
class Example {
    public void print(int x) {
        System.out.println("Printing integer: " + x);
    }
    
    public void print(double x) {
        System.out.println("Printing double: " + x);
    }
    
    public void print(String x) {
        System.out.println("Printing string: " + x);
    }
}
public class test  { 
   public static void main(String[] args) 
   { 
      Example example = new Example();
      example.print(5); // Prints "Printing integer: 5"
      example.print(3.14); // Prints "Printing double: 3.14"
      example.print("Hello"); // Prints "Printing string: Hello"

  } 
}
```

# Overriding
```java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}


public class test  { 
   public static void main(String[] args) 
   { 
      Animal animal = new Animal();
      animal.makeSound(); // Prints "The animal makes a sound"

      Dog dog = new Dog();
      dog.makeSound(); // Prints "The dog barks"

      

  } 
}
```
# Unit 4
# Generic Method non return type
``` java
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
``` java
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
``` java
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
``` java
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
``` java

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
``` java

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

# CompareTo Override for compare the elements
```Java
import java.util.*;
class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Person other) {
        // Compare persons based on age
        return this.age < other.getAge() ? -1 : this.age == other.getAge() ? 0 : 1;
    }
}

class test{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));
        
        // Sort people based on age
        Collections.sort(people);
        
        // Print out the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old");
        }
    }
}
```

















