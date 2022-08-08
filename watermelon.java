import java.util.Scanner;
public class watermelon
{
	public static void main(String[] args) {
	    int a;
	    Scanner sc = new Scanner (System.in);
	    
		System.out.print("Enter Weight: " );
		a = sc.nextInt();
		
		if (a%2==0)
		{
		    System.out.print("Yes");
		    
		}
		else{
		    System.out.print("No");
		    
		}
		
	}
}
