/*
4. Write a java program to find whether the given number is Armstrong number or not.

*/


public class Armstrong {

    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;
	int a=100;
	String s=Integer.toString(a);
	a = s.length();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, a);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
