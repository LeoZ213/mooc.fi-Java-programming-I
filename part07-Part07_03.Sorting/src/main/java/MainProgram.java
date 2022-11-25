
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = MainProgram.smallest(array);
        while (index < array.length) {
            if (array[index] == smallest) {
                break;
            }
            index++;
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int smallestIndex = startIndex;
        for(int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int i = array[index1];
        array[index1] = array[index2];
        array[index2] = i;
    }

    public static void sort(int[] array) {
        for (int y = 0; y < array.length; y++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, y);
            MainProgram.swap(array, y, smallestIndex);
        }
    }
}
