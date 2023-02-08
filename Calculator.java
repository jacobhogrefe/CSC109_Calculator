import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 whole numbers separated by a space");
        String[] numbers = input.nextLine().split(" ");
        int[] answer = new int[]{Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1])};
        System.out.println("Would you like to add or subtract each number?");
        String function = input.nextLine();
        if (function.equalsIgnoreCase("add")) {
            int printAnswer = answer[0] + answer[1];
            System.out.println("The answer is " + printAnswer);
        } else if (function.equalsIgnoreCase("subtract")) {
            int printAnswer = answer[0] - answer[1];
            System.out.println("The answer is " + printAnswer);
        } else {
            System.out.println("Unknown function!");
        }
    }
}