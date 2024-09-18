class shape{
	double getArea(){
		return 0;
	}
}
class Rectangle extends shape{
	double l=10.5,w=4.5; 
	double getArea(){
		return l*w;
	}
}
class Circle extends shape{
	double r=5.5; 
	double getArea(){
		return 3.14*r*r;
	}
}
public class geometry{
	public static void main(String[] args){
		shape s=new shape();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		System.out.println("Shape : "+s.getArea());
		System.out.println("Rectangle : "+r.getArea());
		System.out.println("Circle : "+c.getArea());
	}
}
