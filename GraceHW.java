class Main {
  public static void main(String[] args) {
    //FRQ Starter Code:
    //1. triangle area
    int x = 4;
    int y = 3;
    int area;
    System.out.println("The area of this triangle is " + area(x,y));

    //2. factorial
    int number = 5;
    System.out.println("the factorial of " + number + " is " + factorial(number));
    //3. trianvgle three sode
    int c = 5;
    int d = 8;
    int e = 4;
    int area2;
    System.out.println("the area is " + area2(c, d, e));
    //4. largest
    System.out.println("The largest number between 15, 97, and 42 is " + largest(15,97,42));
    //5. factor
    int first = 100;
    int second = 5;
    if (isFactor(first, second)) {
      System.out.println(first + " is a multiple/factor of " + second);
    } else {
      System.out.println(first + " is NOT multiple/factor of " + second);
    }
    //6. prime
    int f = 47;
    if (prime (f)) {
        System.out.println(f + " is prime.");
    } else {
        System.out.println(f + " isn't prime.");
    }

    //7. sum of array
     int[] intArray = new int[]{10,12,3,4,5,6,7}; 
     System.out.println ("The sum of the array is " + arraysum(intArray));
    //8. remove odd index
    int[] intBarray = new int[]{2,4,7,3,8,9};
    System.out.println ("The even indexes are " + removeindex(intBarray));
  }

public static String removeindex(int[] intBarray) {
  return ("i dont know!!");
}
public static int arraysum(int[] intArray) {
  int i, sum = 0;
  for(i = 0; i < intArray.length; i++){
    sum = sum + intArray[i];
  }
  return (sum);
}
  public static boolean prime (int f) {
    //if ()
    return false;
  }

  public static int area2(int c, int d, int e)
  {
    return ((c * d * e / 2));
  }
  public static int factorial(int number)
  {
    int i, fact = 1;
    for(i = 1; i <= number; i++){
        fact = fact*i;
    }
    return (fact);
  }

  public static int area(int x, int y) {
    return (x*y/2);
  }

  public static int largest(int a, int b, int c) {
    int largest = -1;
    //set largest to largest number between a, b, and c
    if(a > largest)
    {
      largest = a;
    }
    if (b > largest)
    {
        largest = b;
    }
    if (c > largest)
    {
      largest = c;
    }
    return largest;
  }

  public static boolean isFactor (int first, int second) {
      //Code
      if (first%second == 0)
        return true;
      else 
        return false;
      /*some boolean value*/
  }
}