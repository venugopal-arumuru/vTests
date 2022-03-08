import java.util.Scanner;

public class funassign2 {
	//Accept a number then find its reverse value with arg,with return
	

	  static int Reverse (int y) 
	  {
	  int rev=0;
	  while(y>0)
		
			{
				int r = y%10;
				rev = rev*10+r;
				y=y/10;
		   	}

			
	  return rev;
	
	  }
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			int y = sc.nextInt();		
			int result = Reverse(y);
			System.out.println("Reverse Number of " + y + " is : " + result);
		}
		
		}
		
		
		