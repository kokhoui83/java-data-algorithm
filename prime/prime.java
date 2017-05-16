import java.util.*;

public class prime {
  public static void main(String[] args) {
    int max = 2;
    if (args.length > 0) {
      max = Integer.parseInt(args[0]);
    }

    List<Integer> primes = new ArrayList<>();
    for (int i = 1; i <= max; i++) {
      boolean isPrime = prime.isPrime(i);

      if (isPrime) {
        primes.add(i);
      }

      System.out.println("Is " + i + " prime number: " + isPrime);
    }

    System.out.println("Total prime number found: " + primes.size());
  }

  private static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      boolean noRemain = ((number % i) == 0);

      if (noRemain) {
        return false;
      }
    }

    return true;
  }
}
