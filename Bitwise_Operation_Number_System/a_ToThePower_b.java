import java.util.Scanner;
public class aToThePowerb {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int a = sc.nextInt();
        System.out.println("Enter the argument:");
        int b = sc.nextInt();
        int answer=1;
        while(b>0){
            if ((b&1)==1){
                answer=answer*a;
                a*=a;
                b >>=1;

            }
            else {
                a*=a;
                b >>=1;

            }

        }
        System.out.println(answer);

    }
}
