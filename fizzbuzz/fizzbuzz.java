public class fizzbuzz {
  public static void main(String[] args) {
    int max = 50;

    for (int i = 1; i <= 50; i++) {
      System.out.println("Num: " + i);
      boolean isMultipleThree = ((i % 3) == 0);
      boolean isMultipleFive = ((i % 5) == 0);

      // if multiple of 3 & 5 print fizzbuzz
      if (isMultipleThree && isMultipleFive) {
        System.out.println("FizzBuzz");
      } else if (isMultipleThree) { // if multiple of 3 print fizz
        System.out.println("Fizz");
      } else if (isMultipleFive) { // if multiple of 5 print buzz
        System.out.println("Buzz");
      } else {
        // Do nothing
      }
    }
  }
}
