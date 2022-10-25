import java.util.*;



class LongestWord{

	public static void main(String[] argc){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= sc.nextLine();
		String[] result = str.split(" ");
		int max =0,index=1;
		for (String s : result) {
			if(max < s.length()){
				max = s.length();
			}
		}
		for (String s : result) {
			if(max == s.length())break;
			index++;
		}

		System.out.println("The Biggest word Indes is : "+index);
	}
}
