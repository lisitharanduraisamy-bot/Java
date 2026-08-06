import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		while(n>0){
		    int month = scan.nextInt();
		    int first=scan.nextInt();
		    int second=scan.nextInt();
		int bill=0;
		    if(month<=3){
		        bill=first*month;
		    }else{
		        int now =month-3;
		        bill=(3*first)+(now*second);
		    }
		    System.out.println(bill);
		    n--;
		}
	}
}
