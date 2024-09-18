class Person{
	String name="SAI";
	int age=19;
	void display(){
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	} 
}
class Employee extends Person{
	int sal=25000;
	void display(){
		System.out.println("Salary : "+sal);
	}
}
public class office{
	public static void main(String[] args){
		Person p=new Person();
		Employee e=new Employee();
		p.display();
		e.display();
	}
}
