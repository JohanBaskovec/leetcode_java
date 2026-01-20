package leetcode.problems.easy.sort_integers_by_number_of_1_bits_1356;

class Solution {
    public int[] sortByBits(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int pivotBitCount = Integer.bitCount(pivot);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            int bitCount = Integer.bitCount(arr[j]);

            if (bitCount < pivotBitCount || (bitCount == pivotBitCount && arr[j] < pivot)) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
