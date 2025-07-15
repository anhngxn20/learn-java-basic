import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnTryCatchException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of limt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Calculator calc = new Calculator();
        calc.readNumbersFromFile();
        calc.divide();
    }
}

class Calculator {
    int firstNumber = 5;
    int secondNumber = 0;

    int add() {
        return firstNumber + secondNumber;
    }

    void readNumbersFromFile() {
        try {
            Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
            int firstNumber = fileScanner.nextInt();
            int secondNumber = fileScanner.nextInt();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }

    int divide() {
        int result = 0;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            System.out.println("The result will automatically be 0");
        }
        return result;
    }


//    try {
//        // Code that could cause an exception
//    } catch(Exception_Type e) {
//        // Code that handles the exception
//    } finally {
//        // Code that always executes
//    }
    // the finally block statement will always run regardless of whether exception occur or not
}
