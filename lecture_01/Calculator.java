import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        // Input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}