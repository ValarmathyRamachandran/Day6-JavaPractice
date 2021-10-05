package ReverseNum;
import java.util.Scanner;
class ReverseNum {
		  public static void main(String[] args) {

		    Scanner scan=new Scanner(System.in);
		    System.out.println("Please Enter the Number:");
		    
			int num=scan.nextInt();
			 scan.close();
			 
			int reversed=0;
			// run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num = num / 10;
		    }

		    System.out.println("Reversed Number: " +reversed);
		  
		  }
		}



