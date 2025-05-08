import java.util.Scanner;

public class power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if((number & (number-1)) == 0){
            System.out.println("Numnber:- "+number+ " is power of 2");
        }
        else {
            System.out.println("Numaber:- "+number+" is nor power of 2");
        }
    }
}
