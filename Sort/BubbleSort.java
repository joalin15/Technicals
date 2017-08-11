/*
 *  BubbleSort repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order
 *  - Once we reach the end of the array, we know that the largest element has
 *      “bubbled up” to the top.
 *  - Now, we start again with the first element, and so on, terminating one spot earlier.
 *  - This gets repeated at most n − 1 times total.
 *
 *  Worst-case performance: O(n^2)
 *  Best-case performance: O(n)
 *  Average performance: O(n^2)
 *
 *  Worst-case space complexity: O(1) auxiliary
 */

 public class BubbleSort {
   public static void main(String [] args) {
     char [] charArray = {'s', 't', 'r', 'i', 'n', 'g'};
     print(sort(charArray));
   }

   private static char [] sort(char [] arr) {
     int tail = arr.length;

     for (int i = arr.length - 1; i > 0; i--) {
       for (int j = 0; j < i; j++) {
         if (arr[j] > arr[j+1]) {
           char tmp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = tmp;
         }
       }
     }

     return arr;
   }

   private static void print(char [] arr) {
     for (int i = 0; i < arr.length; i++) {
       String comma = (i == arr.length -1 ? "" : ", ");
       System.out.print(arr[i] + comma);
     }
   }
 }
