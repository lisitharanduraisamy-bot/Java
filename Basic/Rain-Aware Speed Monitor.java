import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s=scan.nextInt();
        int l=scan.nextInt();
        int r=scan.nextInt();
        int m=0;
        if(r==0){
            m=s-l;
        }else{
            l=l-10;
            m=s-l;
        }
        if(m<=0){
            System.out.print("SAFE");
        }else if(m>=1 && m<=10){
            System.out.print("WARNING");
        }else if(m>=11 && m<=20){
            System.out.print("FINE 1000");
        }else{
            System.out.print("FINE 3000");
        }
    }
}
