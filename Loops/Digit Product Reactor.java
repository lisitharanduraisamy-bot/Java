import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long num=scan.nextLong();
        long count=0;
        while(num>=10){
            long pro=1;
            while(num>0){
                long digit=num%10;
                pro=pro*digit;
                num=num/10;
            }
            num=pro;
            count++;
        }
        System.out.print(count+" "+num);
    }
}
