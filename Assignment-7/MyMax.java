class Maximum{
	<T extends Comparable> T findMax(T a, T b){
		if(a.compareTo(b) > 0)
			return a;
		return b;
	}

}

public class MyMax{
	public static void main(String[] args){
		Maximum max = new Maximum();
		System.out.println(max.findMax(2342,234));
		System.out.println(max.findMax(2216.7,713.34));
		System.out.println(max.findMax("SSN","IIT Madras"));
	}

}
