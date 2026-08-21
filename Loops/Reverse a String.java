import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
