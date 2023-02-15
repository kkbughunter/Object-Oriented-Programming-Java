
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
