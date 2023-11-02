import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil et: ");

        int num = scanner.nextInt();
        int originalNum = num;
        int reverseNum = 0;
        int sumOfDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfDigits =sumOfDigits + digit;
            reverseNum = reverseNum * 10 + digit;
            num =num/ 10;
        }
        if (originalNum == reverseNum) {
            System.out.println("Eded palidromedi ve 232Eded cemi: " + sumOfDigits);
        }
        else {
            System.out.println("Eded palindrome deyil!!!!");
        }
    }
}
