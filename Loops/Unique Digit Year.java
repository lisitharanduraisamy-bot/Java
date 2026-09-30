import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int found=0;
        
        while(found==0){
            year=year+1;
            
            String s = String.valueOf(year);
            
            if(s.charAt(0)!=s.charAt(1) &&
               s.charAt(0)!=s.charAt(2) &&
               s.charAt(0)!=s.charAt(3) &&
               s.charAt(1)!=s.charAt(2) &&
               s.charAt(1)!=s.charAt(3) &&
               s.charAt(2)!=s.charAt(3)){
                found=1;
            }
        }
        
        System.out.println(year);
    }
}
