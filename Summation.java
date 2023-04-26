import java.util.*;
public class Summation{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integer one by one: \n");
		int sum=0;
		while(true) {
		    int num =sc.nextInt();
			if(num<0){
				break;
			}
			sum=sum+num;
		}
		System.out.println("The summation of all positive integer you entered is: "+sum);
	}
}
