class factorial{
int fact=1;
	public static void main(String[] args){
		int n=7,i;
		factorial data = new factorial();
		for(i=1; i<=n; i++) {
			data.fact = data.fact * i;
		}
		System.out.println("Factorial of N numbers : " + data.fact);
	}

}
