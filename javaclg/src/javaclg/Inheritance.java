package javaclg;

class A{
	String name="Rahul";
	int rollno=1;
	
	void show() {
		System.out.println("parent class");
	}
}
class B extends A{
	void display() {
		System.out.println("child class");
	}
}
class C extends B{
	void add() {
		System.out.println("class c method");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.name);
		System.out.println(b.rollno);
		b.show();
		b.display();
		C c=new C();
		System.out.println(c.name);
		System.out.println(c.rollno);
		c.add();
		c.display();
		c.show();
		
	}

}
