import java.util.Scanner;

public class Funassign1 {
	//Accept a number then find its reverse value with arg,without return
	
		
  static void Reverse (int y) 
  {
  int rev=0;
  while(y>0)
	
		{
			int r = y%10;
			rev = rev*10+r;
			y=y/10;
			// reverse number logic here
	   	}

		
		System.out.println("Reverse No : " + rev); 
}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int y = sc.nextInt();		
		Reverse(y);
	}
	
	}


