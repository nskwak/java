import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int[] epic = new int [2];
    System.out.println("enter two numbers: ");
    for (int i = 0; i < 2; i++){
      int m = input.nextInt();
      epic[i] = m;
    }

    int GCF = myFunctionGCF(epic[0], epic[1]);

    int LCM = myFunctionLCM(epic[0], epic[1]);

    System.out.println("Greatest common factor is " + GCF);
    System.out.println("Least common multiple is " + LCM);
    
  }
  public static int myFunctionGCF(int a, int b){
    if (b == 0) {
      return a; 
    } else {
      return (myFunctionGCF(b, a % b)); 
    }
  }  
  
  public static int myFunctionLCM(int a, int b){
      return (a * b) / myFunctionGCF(a, b); 
  } 
}
