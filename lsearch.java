//JAVA program to impliment linear search
import java.util.Scanner;
 class search{
 	int linear_search(int a[],int key,int size){
 		for(int i=0;i<size;i++){
 			if(a[i]==key) return i;
 		}
 		return -1;
 	}
 }
 public class lsearch{
 	public static void main(String[] args){
 		int [] a=new int[20];
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter the list size: ");
 		int n=sc.nextInt();
 		System.out.print("Enter the list elements: ");
 		for(int i=0;i<n;i++) a[i]=sc.nextInt();
 		System.out.print("Enter the element to be searched ");
 		int key=sc.nextInt();
 		search s=new search();
 		int pos=s.linear_search(a,key,n);
 		if(pos==-1) System.out.println("Search is unsuccesful,key not found");
 		else System.out.println("Search is successful,Key is found at index "+pos);
 		
 	}
 }
