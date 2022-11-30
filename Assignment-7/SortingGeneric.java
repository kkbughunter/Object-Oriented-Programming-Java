// program not completed
class Sorting<T extends Comparable>{
	T [] array;
	int len = array.length;
	Sorting(T[] arr){
		array = arr;
	}
	void sortA(){
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
				if(array[i].compareTo(array[j])>0){
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	void display(){
		System.out.print("\n");
		for(int i=0; i<len; i++){
			System.out.print("2 = " + array[i] + " ");
		}
	}
}


public class SortingGeneric{
	public static void main(String[] argc){
		Integer []arr = new Integer [10];
		String []sarr = new String [10];
		for(int i=0; i<5; i++){
			arr[i] =  i;
		}
		for(int i=0; i<5; i++){
			System.out.print("1 = " + arr[i] + " ");
		}
		Sorting<Integer> sort = new Sorting<Integer>(arr);
		sort.sortA();
		sort.display();
	
	}
}




























