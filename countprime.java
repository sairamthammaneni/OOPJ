import java.util.Scanner;
public class countprime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int i,count,j;
		for(j=1;j<=n;j++){
			count=0;
			i=1;
			while(i<=j){
				if(j%i==0)
					count++;
				i++;
			}
			if(count==2)
				System.out.print(j+" ");
		}
		System.out.println();
	}
}
