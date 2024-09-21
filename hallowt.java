import java.util.Scanner;
public class hallowt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==r-1) System.out.print("* ");
                else if(i==j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
