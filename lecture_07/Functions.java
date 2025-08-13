import java.util.Scanner;

// Function to print my name
// class Functions {
//     public static void printMyName(String name) {
//         System.out.println("My name is: " + name);
//         return; // return void 
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         printMyName(name);
//     }
    
// }



// class Functions {

//     public static int calculateSum(int a , int b ) {
//         return a + b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("The sum is: " + sum);
//     }

    
// }





class Functions {

    public static void Factorial(int n) {

        if (n < 0 ){
            System.out.println("Invalid number");
            return; // return void
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);
     }
}