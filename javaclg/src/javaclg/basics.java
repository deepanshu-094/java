package javaclg;
  class student{
	String name;
	int rollno;
	int marks;
	
	student(String name,int rollno,int marks){
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
		
	}
	void write() {
		System.out.println("writing");
	}
	void read() {
		System.out.println("reading");
	}
	
}

public class basics {
	
public static void main(String[]args) {
	System.out.println("hello");
	student s1=new student("aman",1,70);
	s1.read();
	s1.write();
	}
}
