class ODD_or_EVEN{
int regno=120;
String name="";
	public static void main(String[] args){
		System.out.println("hello world\n");
		ODD_or_EVEN data = new ODD_or_EVEN();
		System.out.println(data.regno);
		System.out.println(data.name);
		int a = 10+1;
		if(data.regno%2 == 0 ){

			System.out.println("Even Number");	
		}
		else System.out.println("Odd Number");
	}
}
