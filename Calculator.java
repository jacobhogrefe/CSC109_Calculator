import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 whole numbers separated by a space");
        String[] numbers = input.nextLine().split(" ");
        int answer = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        System.out.println("The answer is " + answer);
    }
}