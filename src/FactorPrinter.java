public class FactorPrinter {



    public static void main(String[] args) {

        // Test cases

        printFactors(6);   // should print: 1 2 3 6

        printFactors(32);  // should print: 1 2 4 8 16 32

        printFactors(10);  // should print: 1 2 5 10

        printFactors(-1);  // should print: Invalid Value

    }



    // Method to print factors of a number

    public static void printFactors(int number) {

        // Check if number is less than 1

        if (number < 1) {

            System.out.println("Invalid Value");

            return;

        }



        // Print all factors of the number

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                System.out.println(i);

            }

        }

    }

}

