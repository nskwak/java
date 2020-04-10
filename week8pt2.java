import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
    System.out.println("enter a number: ");
    int x = input.nextInt();
    boolean result = myFunction(x);
    if (result == false){
      System.out.println("even");
    } else {
      System.out.println("odd");
    } 

  }
  public static boolean myFunction(int x){
    if (x % 2 == 0){
      return false;
    } else {
      return true;
    }
  }
}

