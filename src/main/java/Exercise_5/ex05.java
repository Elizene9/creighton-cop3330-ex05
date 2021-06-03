package Exercise_5;
/*
Write a program that prompts for two numbers.
Print the sum, difference, product, and quotient
of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints
Values coming from users will be strings.
Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is the first number? ");

        String fir = input.nextLine();

        System.out.print("\nWhat is the second number? ");

        String sec = input.nextLine();

        int first = Integer.parseInt(fir);

        int second = Integer.parseInt(sec);

        int div = first / second;

        int mult = first * second;

        int add = first + second;

        int sub = first - second;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",
            first, second, add, first, second, sub, first, second, mult, first, second, div
        );


    }
}
