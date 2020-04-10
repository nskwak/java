import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int sum = 0;

    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
      int number = input.nextInt();
      sum = sum + number;
    }
  
    System.out.println("the sum is " + sum); 
  }
}

