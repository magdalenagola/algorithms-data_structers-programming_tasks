import java.util.List;

class QuickSort {

    /**
     * Sorts the given List in place
     *
     * @param numbers the List of Integers to sort. Throws an error if its null
     */
    static void quickSort(List<Integer> numbers) {
        if (numbers == null) throw new IllegalArgumentException();
        if (numbers.isEmpty()) return;
        int scrollingIndex = 0;
        int positionIndex = 0;
        int pivotIndex = numbers.size() / 2;
        Integer pivot = numbers.get(pivotIndex);

        //replacing last element with the pivot
        numbers.set(pivotIndex, numbers.get(numbers.size() - 1));
        numbers.set(numbers.size() - 1, pivot);

        //dividing collection into two parts, where the elements in the left partition are less or equal then all elements in the right partition;
        //partitions are divided by pivot
        Integer comparingElement;
        for (; scrollingIndex < numbers.size() -  1; scrollingIndex++) {
            comparingElement = numbers.get(scrollingIndex);
            if (comparingElement > pivot) continue;
            numbers.set(scrollingIndex, numbers.get(positionIndex));
            numbers.set(positionIndex, comparingElement);
            positionIndex++;
        }
        numbers.set(numbers.size() - 1, numbers.get(positionIndex));
        numbers.set(positionIndex, pivot);

        //sort recursively each partition
        List<Integer> leftPartition = numbers.subList(0, positionIndex);
        List<Integer> rightPartition = numbers.subList(positionIndex + 1, numbers.size());
        if (positionIndex > 0) {
            quickSort(leftPartition);
        }
        if (positionIndex < numbers.size()) {
            quickSort(rightPartition);
        }
    }
}