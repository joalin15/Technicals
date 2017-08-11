public class SelectionSort {
  public static void main(String [] args) {
    int [] arr = {2,4,2,6,0,1};
    System.out.println("Sorting: " + printArray(arr));
    System.out.println("Solution: " + printArray(sort(arr)));
  }

  public static int [] sort(int [] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < ar[i]) {
          minIndex = j;
        }
      }

      if (i != minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
      }
    }
    return arr;
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
