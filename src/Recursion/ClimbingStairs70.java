package Recursion;

public class ClimbingStairs70 {
  //recursion
//  int count = 0;
  public int climbStairs(int n) {
//    helper(n);
//    return count;

    //iterative
    int[] stairsClimbed = new int[n];
    for (int i = 0; i < n; i++) {
      if (i < 2) {
        stairsClimbed[i] = i + 1;
      } else {
        stairsClimbed[i] = stairsClimbed[i - 1] + stairsClimbed[i - 2];
      }
    }
    return stairsClimbed[n - 1];
  }

  //recursion
//  private void helper(int n) {
//    if (n == 0) {
//      count++;
//    }
//    if (n > 0) {
//      helper(n - 1);
//      helper(n - 2);
//    }
//  }
}
