/**
 * sum
 */
import java.util.Scanner;
 public class sum {

    public static void calcsum(int i,int n,int sum){
        
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        calcsum(i+1, n,sum);
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        input.close();
        int i=0;
        int sum=0;

        calcsum(i,n,sum);       
    }
}