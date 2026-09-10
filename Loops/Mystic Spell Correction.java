import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        boolean upper=true;
        boolean restUpper=true;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                upper=false;
            }
        }
        for(int i=1;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                restUpper=false;
            }
        }
        if(upper || restUpper){
            String ans="";
            for(int i=0;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))){
                    ans+=Character.toLowerCase(str.charAt(i));
                }else{
                    ans+=Character.toUpperCase(str.charAt(i));
                }
            }
            System.out.println(ans);
        }else{
            System.out.println(str);
        }
    }
}
