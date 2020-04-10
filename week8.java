import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("enter a number: ");
    int n = input.nextInt();

    int[] epic = new int [n];
    for (int i = 0; i < n; i++){
      System.out.println("enter another number: ");
      int m = input.nextInt();
      epic[i] = m;
    }
    
    for (int i = 0; i < n; i++){
      if (i == (n-1))
      {
        System.out.print(epic[i] + "\n");
      } else {
        System.out.print(epic[i]+",");
      }
    }
  }
}

