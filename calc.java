import java.util.Scanner;
public class calc{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		char ch;
		while(true){
			System.out.print("Enter a: ");
			a=sc.nextInt();
			System.out.print("Enter b: ");
			b=sc.nextInt();
			System.out.print("Enter an operator(+,-,/,*,%): ");
			String s=sc.next();
			ch=s.charAt(0);
			System.out.print("Result=");
			switch(ch){
				case '+':System.out.println(a+b);
					break;
				case '-':System.out.println(a-b);
					break;
				case '*':System.out.println(a*b);
					break;
				case '/':System.out.println(a/b);
					break;
				case '%':System.out.println(a%b);
					break;
			}
			System.out.print("Do you want to continue?(1-YES/0-NO):");
			int ch1=sc.nextInt();
			if(ch1==0)
				break;
		}
	}
}
