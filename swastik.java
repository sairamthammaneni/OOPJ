import java.util.Scanner;
public class swastik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int c=sc.nextInt();
        int rmid = (r/2)+1;
        int cmid = (c/2)+1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j>=cmid)  System.out.print("* ");
                else if(j==0 && i<rmid)    System.out.print("* ");
                else if(i==rmid-1 ||j==cmid-1) System.out.print("* ");
                else if(i==r-1 && j<cmid) System.out.print("* ");
                else if(j==c-1 && i>=rmid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}