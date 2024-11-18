package module17;

public class checkIfArrayIsSortedOrNot {
  public static void main(String[] args) {
    System.out.println(">>>>>>>>>>>>>>>>>>>>> ");
    int[] arr = { 1, 3, 7, 9, 12, 13 };
    int n = arr.length;
    boolean flag = true;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        flag = false; // unsorted
        break;
      }
    }

    if (!flag) {
      System.out.println("it is unsorted");
    } else {
      System.out.println("it is sorted");
    }
  }
}
