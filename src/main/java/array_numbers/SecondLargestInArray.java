package array_numbers;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 2, 0, 4, 9, 6};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Второй по величине элемент в массиве: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
