import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t>0){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int diff = Math.abs(a-b);
            int ans = (diff+9)/10;

            System.out.println(ans);

            t--;
        }
    }
}
