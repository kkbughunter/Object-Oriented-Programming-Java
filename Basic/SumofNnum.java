/*
3. Write a java program to find the sum of first ‘n’ natural numbers.

*/

class SumofNnum{
	public static void main(String[] args){
		int n=5,i,rec=0;
		for(i=1; i<=n; i++) {
			rec = rec +i;
		}
		System.out.println("Sum of N numbers : " + rec);
	}

}
