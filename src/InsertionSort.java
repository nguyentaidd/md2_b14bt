import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] list = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.printf("Enter element %d: \n",i+1);
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        InsertionSort.insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d\t", list[i]);
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curren = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > curren; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = curren;
        }
    }
}
