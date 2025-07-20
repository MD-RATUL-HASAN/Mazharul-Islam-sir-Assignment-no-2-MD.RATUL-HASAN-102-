import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number: ");
        int num1 = input.nextInt();

        System.out.println("Please Enter the second Number: ");
        int num2 = input.nextInt();

        int a = num1;
        int b = num2;

        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = a;
        int lcm = ((num1 * num2)/gcd);

        System.out.println("The GCD of the given number :"+gcd);
        System.out.println("The LCM of the given number :"+lcm);
    }

}
