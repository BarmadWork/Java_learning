
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class basics {

    public static void beginers() {
        Date now = new Date();
        System.out.println("NOW IS: ".toLowerCase() + now + "          something else to test the trim!!         ".trim());
        System.out.println("something to test the backslash \"");

        int[] numbers = {5, 1, 2, 3, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[][] twoDimentional = {
            {1, 2, 3}, {4, 5, 6, 7}
        };
        System.out.println(Arrays.deepToString(twoDimentional));

        int[][][] threeDimentional = {
            {
                {1, 2, 3}, {4, 5, 6, 7}
            },
            {
                {1, 2, 3}, {4, 5, 6, 7}
            }
        };
        System.out.println(Arrays.deepToString(threeDimentional));
    }

    public static void practiceWithUserInput() {

        System.out.println("\nPractice with user input using Scanner!\n");
        System.out.println("Let's play a game! \nI will ask some quistions to complete a nice story!");

        try (Scanner scanner = new Scanner(System.in)) {

            String adjective1;
            String noun;
            int length;
            String adjective2;
            String verb;
            String adjective3;

            System.out.print("Enter an adjective (description): ");
            adjective1 = scanner.nextLine();
            System.out.print("Enter a noun (animal): ");
            noun = scanner.nextLine();
            System.out.print("Enter a number (between 1 and 10): ");
            length = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter another adjective (description): ");
            adjective2 = scanner.nextLine();
            System.out.print("Enter a verb ends with \'ing\' (action): ");
            verb = scanner.nextLine();
            System.out.print("Enter another adjective (description): ");
            adjective3 = scanner.nextLine();

            System.out.println("\nToday I went to a " + adjective1 + " zoo.");
            System.out.println("In an exhibit, I saw a " + noun + ". It was " + length + " tall!");
            System.out.println(noun + " was " + adjective2 + " and " + verb + "!");
            System.out.println("I was " + adjective3 + " that day!\n");

            scanner.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }

    public static void practiceWithRandom() {

        boolean stop = false;
        boolean showOutput = true;
        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {

            while (!stop) {

                if (showOutput) {
                    System.out.println("\nHere is a random number between 0 and 100: " + random.nextInt(0, 100));
                    System.out.println("Here is a random number between 0 and 100: " + random.nextInt(0, 100));
                    System.out.println("Here is a random number between 0 and 100: " + random.nextInt(0, 100) + "\n");

                    System.out.println("\nHere is a random double between 0 and 100: " + random.nextDouble(0, 100));
                    System.out.println("Here is a random double between 0 and 100: " + random.nextDouble(0, 100));
                    System.out.println("Here is a random double between 0 and 100: " + random.nextDouble(0, 100) + "\n");
                }
                System.out.println("Try again?\n    1: to stop\n    2: to continue");

                switch (scanner.nextInt()) {
                    case 1 ->
                        stop = true;
                    case 2 -> {
                        stop = false;
                        showOutput = true;
                    }
                    default -> {
                        System.out.println("Invalid input!");
                        showOutput = false;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    public static void practiceWithMath() {

        double result;

        result = Math.PI;
        System.out.println("Math.PI = " + result);

        result = Math.E;
        System.out.println("Math.E = " + result);

        result = Math.pow(2, 5);
        System.out.println("Math.pow(2, 5) = " + result);

        result = Math.abs(-5);
        System.out.println("Math.abs(-5) = " + result);

        result = Math.sqrt(9);
        System.out.println("Math.sqrt(9) = " + result);

        result = Math.round(3.14);
        System.out.println("Math.round(3.14) = " + result);

        result = Math.round(3.54);
        System.out.println("Math.round(3.54) = " + result);

        result = Math.ceil(3.14);
        System.out.println("Math.ceil(3.14) = " + result);

        result = Math.floor(3.14);
        System.out.println("Math.floor(3.14) = " + result);

        result = Math.max(10, 20);
        System.out.println("Math.max(10, 20) = " + result);

        result = Math.min(10, 20);
        System.out.println("Math.min(10, 20) = " + result);

    }

    public static void main(String[] args) {

        /* 
            Uncomment the functions you need to test! 
         */
        // beginers();
        // practiceWithUserInput();
        // practiceWithRandom();
        practiceWithMath();

    }
}
