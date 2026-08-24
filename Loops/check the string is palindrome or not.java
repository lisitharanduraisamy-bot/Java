import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        int n=str.length();
        int start=0;
        int end=n-1;
        int check=0;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                check=1;
            }
            start++;
            end--;
        }
        if(check==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
