import java.util.Scanner;
public class Lab04_methods {


    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;

    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        if (num2 < num1) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 < num2) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num2 < num1) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        System.out.println("enter how many number do you want to display");
        int n = scanner.nextInt();
        fibonacci(n);


        System.out.println("enter a number");
        number= scanner.nextInt();
        if(isPrime(number)){
            System.out.println("this is a prime number");}
        else System.out.println("this is NOT a prime number");
    }


    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            System.out.println(b);
            a = temp;
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0 && number>1) {
                isPrime = false;
                break;}

        }
        if(number==2)
            isPrime= true;

        return isPrime;
    }



}
