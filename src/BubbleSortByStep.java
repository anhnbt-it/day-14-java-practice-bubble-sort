import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 9:43 AM
 */
public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = Integer.parseInt(input.nextLine());
        int[] numbers = new int[size];
        System.out.println("Enter " + numbers.length + " values: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(numbers);
    }

    public static void bubbleSortByStep(int[] numbers) {
        boolean needNextPass = true;
        for (int k = 1; k < numbers.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < numbers.length - k; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    System.out.println("Swap " + numbers[i] + " with " + numbers[i + 1]);
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the '" + k + "' sort: ");
            for (int element: numbers) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

    }
}
