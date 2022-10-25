import java.util.*;

class Search{

	static int linear_search(int[]arr, int key){
		for(int i=0; i<arr.length; i++){
			if(key == arr[i])return i+1;
		}
		return -1;
	}

	static int binary_search(int[]arr, int start,int end,int key){
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] > key)
				return binary_search(arr, start, mid - 1, key);
			return binary_search(arr, mid + 1, end, key);
		}
		return -1;
	}

	static void sort(int[] arr){
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i; j < arr.length; j++)
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
	}

	public static void main(String[] argc){
		int n=0,result=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many numbers of Element : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.printf("Enter the key want to search : ");
		int key = sc.nextInt();
		System.out.print("1.Linear Search\n2.Binary Search\nEnter Your option : ");
		int opt = sc.nextInt();
		switch(opt){
			case 1:
				result = linear_search(arr,key);
				System.out.print("\nThe Position is : "+result );
				break;
			case 2:
				sort(arr);
				result = binary_search(arr,0,arr.length-1,key);
				System.out.print("\nThe Position is (this array have sorted): "+result );
				break;
			default:
				System.out.println("Enter the Correct Option...");
		}

	}



}
