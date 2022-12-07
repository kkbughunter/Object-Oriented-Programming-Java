import java.util.*;
 class Sorting {
	<T extends Comparable> void sort(T arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[j].compareTo(arr[i])<0){
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
	}
}

public class SortingProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element : ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextLine();
		}
		Sorting s = new Sorting();
		s.sort(arr);
	}
}

