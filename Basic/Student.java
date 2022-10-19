/*

5. Write a java program to create a class named ‘Student’ with name, id, dept, 3 marks as data members. Write function to assign the inputs, calculate grade, display and search.
*/

class Student_data{
	private String name,dept,grade;
	private int id,m1,m2,m3;
	Student_data(String name,String dept,int id,int m1,int m2,int m3){
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void display(){
		double total;
		System.out.println("Student Name : "+name);
		System.out.println("Student Id : "+id);
		System.out.println("Student Dept : "+dept);
		System.out.println("Student mark 1 : "+m1);
		System.out.println("Student mark 2 : "+m2);
		System.out.println("Student mark 3 : "+m3);
		total = (m1+m2+m3)/3.0;
		System.out.println("Student Total : "+total);
		if(total <=50) System.out.println("Student Grade : F");
		else if(total <=70) System.out.println("Student Grade : B");
		else if(total <=80) System.out.println("Student Grade : A");
		else if(total <=100) System.out.println("Student Grade : O");
	}
}


class Student {
	public static void main(String[] args){
		Student_data stu = new Student_data("Sam","CSE",21101,99,60,100);
		stu.display();
	}

}


