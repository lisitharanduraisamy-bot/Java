import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n= scan.nextLong();
        
        long days=0;
        long hours=0;
        long minutes=0;
        long seconds=0;
        
        if(n>=86400){
            days=n/86400;
            n=n%86400;
        }
        
        if(n>=3600){
            hours=n/3600;
            n=n%3600;
        }
        
        if(n>=60){
            minutes=n/60;
            n=n%60;
        }
        
        seconds=n;
        
        System.out.print(days+" "+hours+" "+minutes+" "+seconds);
    }
}
