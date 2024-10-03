import java.util.Scanner;
import java.util.Arrays;

public class MinMaxCalculation {
    
    // Method to find minimum value
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find maximum value
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Given numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        scanner.close();
    }
}
