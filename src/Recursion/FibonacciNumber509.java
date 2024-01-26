package Recursion;

import java.util.LinkedList;

public class FibonacciNumber509 {
  public int fib(int n) {
    //recursion
//    if (n <= 1) {
//      return n;
//    }
//    return fib(n - 1) + fib(n - 2);

    //iterative
    LinkedList<Integer> fibs = new LinkedList<>();
    for (int i = 0; i <= n; i++) {
      if (i <= 1) {
        fibs.add(i);
      } else {
        fibs.add(fibs.poll() + fibs.peek());
      }
    }
    return fibs.getLast();
  }
}
