import java.util.Scanner;
public class grades {
	public static void main(String[] args){
		float Marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of the student:");
		Marks=sc.nextFloat();
		if(Marks>=90)
			System.out.println("Grade is A");
		else if(Marks>=80&&Marks<90)
			System.out.println("Grade is B");
		else if(Marks>=70&&Marks<80)
			System.out.println("Grade is C");
		else if(Marks>=60&&Marks<70)
			System.out.println("Grade is D");
		else if(Marks>=50&&Marks<60)
			System.out.println("Grade is E");
		else
			System.out.println("!!FAILED!!");			
	}
}
