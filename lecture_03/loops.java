import java.util.Scanner;
class loops {

    
    public static void main(String[] args) {

        // for loop example
        Scanner sc = new Scanner(System.in);
        for (int counter = 1 ; counter <= 3 ; counter++){
            System.out.println(counter + " Hello World");
        }

        // while loop example
        int i = 0;
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }

        // do-while loop example
        int j = 0;
        do {
            System.out.println(j + " do");
            j++;
        } while (j <= 3);
    }
}
