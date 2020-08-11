package programming_tasks;

import java.util.Arrays;

/*
6 kyu

You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        if (array == null || array.length == 0) return new int[]{};
        int[] odd;
        odd = Arrays.stream(array)
                .filter(number -> number % 2 != 0)
                .sorted()
                .toArray();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) continue;
            array[i] = odd[j];
            j++;
        }
        return array;
    }
}
