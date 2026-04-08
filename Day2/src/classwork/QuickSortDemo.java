package classwork;

public class QuickSortDemo {

    public static void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quicksort(arr, left, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        int j = right - 1;

        while (i < j) {
            while (i < right && arr[i] < pivot) {
                i++;
            }
            while (j > left && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (arr[i] > pivot) {
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 1, 9, 8, 5};

        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}