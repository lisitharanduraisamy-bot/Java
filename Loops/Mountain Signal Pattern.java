import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int h=2;h<=i;h++){
                System.out.print(h);
            }
            System.out.println();
        }
    }
}
