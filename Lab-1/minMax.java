
import java.util.Scanner;

public class minMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter value in array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Array[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        sc.close();
    }
}
