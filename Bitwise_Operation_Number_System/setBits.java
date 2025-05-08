import java.util.Scanner;
public class setBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int count =0;
        while (num > 0){
           if( (num&1)==0 ){
               num>>=1;
           }
           else{
               count+=1;
               num>>=1;
           }
        }
        System.out.println(count);
    }
}
