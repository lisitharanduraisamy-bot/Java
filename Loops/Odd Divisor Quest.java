import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
           arr[i]=scan.nextLong();
        }
        for(int i=0;i<n;i++){
            int count=0;
            if(arr[i]%2==1){
                count++;
            }
            for(long j=1;j<=20;j++){
                if(arr[i]%j==0){
                    if(j%2==1){
                        count++;
                    }
                }
                if(count>=2){
                    System.out.println("YES");
                    break;
                }
            }
            if(count<2){
                System.out.println("NO");
            }
        }
    }
}
