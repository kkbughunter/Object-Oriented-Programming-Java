import java.util.*;

class Pangram{

	public static void main(String[] argc){
		int count=0,i=0;
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		char[] alp = "asdfghjklqwertyuiopzxcvbnm".toCharArray();
		int rec[] = new int[27];
		char res[] = new char[27];
		for(char c1 : alp){
			for(char c2: str){
				if(c1==c2) count++;
			}
			rec[i] = count;
			i++;
			count=0;
		}

		int flag = 1;
		for(i=0; i<26; i++){
			System.out.println(alp[i] + " -> " + rec[i]);
			if(flag == -1) continue;
			if(rec[i]==0) flag=-1;

		}
		if(flag == -1) System.out.println("The given string is not Pangram\n");
		else System.out.println("The given string is Pangram\n");

	}
}
