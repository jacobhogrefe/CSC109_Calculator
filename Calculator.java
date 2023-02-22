import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers separated by a space");
        String[] numbers = input.nextLine().split(" ");
        float[] answer = new float[]{Float.parseFloat(numbers[0]), Float.parseFloat(numbers[1])};
        System.out.println("Would you like to add, subtract, multiply, or divide each number?");
        String function = input.nextLine();
        if (function.equalsIgnoreCase("add")) {
            float printAnswer = answer[0] + answer[1];
            System.out.println("The answer is " + printAnswer);
        } else if (function.equalsIgnoreCase("subtract")) {
            float printAnswer = answer[0] - answer[1];
            System.out.println("The answer is " + printAnswer);
        } else if (function.equalsIgnoreCase("multiply")) {
            float printAnswer = answer[0] * answer[1];
            System.out.println("The answer is " + printAnswer);
        } else if (function.equalsIgnoreCase("divide")) {
            if (answer[1] != 0) {
                float printAnswer = answer[0] / answer[1];
                System.out.println("The answer is " + printAnswer);
            } else {
                System.out.println("Cannot divide by 0!");
            }
        }else {
            System.out.println("Unknown function!");
        }
        input.close();

        System.out.println("No derivatives for u!!!!");
    }
}