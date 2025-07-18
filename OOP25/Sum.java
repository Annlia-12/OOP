import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of is: " + sum);

        sc.close();
    }
}