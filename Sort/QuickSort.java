/*
 *  QuickSort
 *  - Pick a random element and partition the array, such that all numbers
 *       that are less than it come before all elements that are greater than it.
 *  - Then do that for each half, then each quarter, etc.
 *  - Each element gets QuickSort called on it log(n) times
 *      - n elements go through log(n) swaps
 *
 *  Worst-case performance: O(n^2)
 *    - like if pivot is consistently index 0 of array or smallest element in array
 *  Best-case performance: O(n log(n))
 *                         O(n) if 3-way partition and equal keys
 *  Average performance: O(n log(n))
 *
 *  When implemented well, it can be about two or three times faster than its
 *  main competitors, merge sort and heapsort
 *
 *  Worst-case space complexity: O(n) auxiliary - naive
 *                               O(log n) auxiliary
 */

public class QuickSort {
  public static void main(String [] args) {
    int [] arr = {2,4,2,6,0,1,5};
    System.out.println("Sorting: " + printArray(arr));
    System.out.println("Solution: " + printArray(sort(arr, 0, arr.length-1)));
  }

  private static int [] sort(int [] arr, int left, int right) {
    if (left >= right) {
      return arr;
    }
    int pivot = arr[((left + right) / 2)];   // middle
    int index = partition(arr, pivot, left, right);
    sort(arr, left, index - 1);
    sort(arr, index, right);
    return arr;
  }

  private static int partition(int [] arr, int pivot, int left, int right) {
    while (left <= right) {
      while (arr[left] < pivot) {
        left ++;
      }

      while (arr[right] > pivot) {
        right --;
      }

      if (left <= right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

        left ++;
        right --;
      }
    }
    return left;
  }

  private static String printArray(int [] arr) {
    String toPrint = "";
    for (int i = 0; i < arr.length; i++) {
      String comma = (i == arr.length -1 ? "" : ", ");
      toPrint += (arr[i] + comma);
    }
    return toPrint;
  }

}
