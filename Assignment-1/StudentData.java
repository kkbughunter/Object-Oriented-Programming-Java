/*
 Write a java progr*am to create a class named ‘Student’ with name, id, dept, 3 marks as
 data members. Write function to assign the inputs, calculate grade, display and search.
 Perform these operations for ‘n’ number of students. [Search using id and dept – use
 method overloading]
 */

import java.util.Scanner;

class Student{
	private int id,m1,m2,m3;
	private String name, dept,grade;

	void getinput(String sname,String sdept, int sid,int sm1,int sm2,int sm3){
		id = sid;
		m1 = sm1;
		m2 = sm2;
		m3 = sm3;
		name = sname;
		dept = sdept;
	}

	void display(){
		System.out.printf("| %-8s | %-4s | %-4s | %-5s |\n",name,id,dept,grade);
	}

	static void search(Student[] S,int ID,int numofstu){
		int i;
		System.out.printf("| %-8s | %-4s | %-4s | %-5s |\n","Name","ID","Dept","Total","Grade");
		for(i=0; i<numofstu; i++ ){
			if(ID == S[i].id) S[i].display();
		}

	}
	static void search(Student[] S,String dep,int numofstu){
		int i;
		System.out.printf("| %-8s | %-4s | %-4s | %-5s |\n","Name","ID","Dept","Total","Grade");
		for(i=0; i<numofstu; i++ ){
			if(dep.equals(S[i].dept)) S[i].display();
		}

	}


	void calgrade(){
		int avg =(m1+m2+m3)/3;
		if(avg <40)
			System.out.println("Fail");
		else if(avg <=50)
			grade = "D";
		else if(avg <=60)
			grade = "C";
		else if(avg <=70)
			grade = "B";
		else if(avg <=80)
			grade = "A";
		else if(avg <=90)
			grade = "A+";
		else if(avg <=100)
			grade = "O";
		else {
			System.out.println("Enter the correct marks");
			grade = null;
		}
	}
}

class StudentData{
	public static void main(String[] agrc){
		int numofstu=0,i=0,opt=0,ID=0;
		Scanner obj=new Scanner(System.in);
		Student[] S = new Student[10];
		int id,m1,m2,m3;
		String name, dept,grade;
		while(true){
			System.out.println("1.Add Student\n2.Search By ID no\n3.Search By Dept\n4.Display all student grade");
			System.out.print("Enter Your option : ");
			opt = obj.nextInt();
			switch(opt){
				case 1:
					System.out.print("How many students : ");
					numofstu = obj.nextInt();
					for(i=0; i<numofstu; i++ ){
						System.out.print("Enter the student Name : ");
						name = obj.next();
						System.out.print("Enter the student ID NO : ");
						id = obj.nextInt();
						System.out.print("Enter the student Dept : ");
						dept = obj.next();
						System.out.print("Enter the student Mark 1 : ");
						m1 = obj.nextInt();
						System.out.print("Enter the student Mark 2 : ");
						m2 = obj.nextInt();
						System.out.print("Enter the student Mark 3 : ");
						m3 = obj.nextInt();
						S[i] = new Student();
						S[i].getinput(name, dept, id, m1, m2, m3);
						S[i].calgrade();
					}
					break;
				case 2:
					System.out.print("Enter the ID no to be Search : ");
					ID = obj.nextInt();
					Student.search(S,ID,numofstu);
				case 3:
					System.out.print("Enter the Dept to be Search : ");
					String dep = obj.next();
					Student.search(S,dep,numofstu);

			}
		}
	}
}



/*
1
2
sam
21
CSE
89
94
99
SOM
22
CSE
99
70
75


*/
