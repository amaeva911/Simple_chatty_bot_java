package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int age = (num1 * 70 + num2 * 21 + num3 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?\n1. To repeat a statement multiple times.\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of a program.\n4. To interrupt the execution of a program.");

        int check = scanner.nextInt();

        while (check != 4) {
            System.out.println("Please, try again.");
            check = scanner.nextInt();
        }

        System.out.println("Congratulations, have a nice day!");

    }
}
