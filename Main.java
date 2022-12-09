import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      int elemento = scanner.nextInt();
      array[i] = elemento;
    }
    Heapsort heapsort = new Heapsort();
    heapsort.heapsort(array);
    String out = "";
    for (int num : array) {
      out += num + " ";
    }
    System.out.println(out);
    scanner.close();
  }
}