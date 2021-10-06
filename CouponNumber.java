package CouponNumber;
import java.util.Scanner;
public class CouponNumber {
	static void randomNum()
	{
		Scanner scan=new Scanner(System.in);
    System.out.println("Please Enter the Number:");
    int num=scan.nextInt();
	scan.close();
	 int min = 111111;
      int max = 999999;
      int count=0;
      	while (count<num) {
    	  int randomNum1 = min + (int)(Math.random() * max);
	      System.out.println(randomNum1);
	      count++;
      	}
	}
public static void main(String[] args) {

		    randomNum();
		      	}
	}


