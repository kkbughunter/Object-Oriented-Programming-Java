class Stack<E>{
	int top;
	E [] data;
	public Stack(E []arr){
		data = arr;
	}
	Boolean isFill(){
		if(top == data.length)
			return true;
		else return false;
	}
	Boolean isEmpty(){
		if(top == 0)
			return true;
		else return false;
	}
	void push(E element){
		if(isFill()){
			 System.out.println("Stack Fill...");
		}
		else{
			data[top] = element;
			top++;
		}
	}

	E pop(){
		if(isEmpty()){
			System.out.println("Stack Empty...");
			return null;
		}
		else {
			return data[--top];
		}
	}
	void display(){
		System.out.print("\n\n\tStack Element : ");
		for(int i=top-1; i>=0; i--)
			System.out.print(data[i] + " ");
		System.out.print("\n");
	}

}

public class StackGeneric{
	public static void main(String[] args){
		Integer [] arr = new Integer[5];
		Stack<Integer> stack = new Stack<Integer>(arr);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		System.out.print("\nStack Poped : " + stack.pop());
		System.out.print("\nStack Poped : " + stack.pop());
		stack.display();
	}

}




















