import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int[] array = getArray(n);
        printArray((array));

        heapSort(array);

        System.out.print("Sorted array is: ");
        printArray(array);
    }

    private static int[] getArray(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = (int) (-10 + Math.random() * 20);
        return array;
    }

    private static void printArray(int array[]) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void heapSort(int array[]) {
        int len = array.length;
        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(array, i, len);
        for (int i = len - 1; i >= 0; i--) {
            swap(array, i, 0);
//
            heapify(array, 0, i);
        }

    }

    static void swap(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    private static void heapify(int[] array, int i, int len) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int parent = i;
        if (left < len && array[left] > array[parent])
            parent = left;
        if (right < len && array[right] > array[parent])
            parent = right;
        if (i != parent) {
            swap(array, i, parent);
//
            heapify(array, parent, len);
        }

    }

}
