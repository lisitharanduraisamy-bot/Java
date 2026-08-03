import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long n1=scan.nextLong();
        long n2=scan.nextLong();
        long n3=scan.nextLong();
        long start = 1;
        for(long i=0;i<a-1;i++){
            start=start*10;
        }
        for(long i=start; ;i++){
            if(i%n1==0 && i%n2==0 && i%n3==0){
                System.out.print(i);
                break;
            }
        }
    }
}
