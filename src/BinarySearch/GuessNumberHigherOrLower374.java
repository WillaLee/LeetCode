package BinarySearch;

public class GuessNumberHigherOrLower374 {
  int pick = 0;

  public int guessNumber(int n) {
    int l = 1, r = n, mid;
    while (l <= r) {
      mid = l + (r - l) / 2;
      if (guess(mid) == 1) {
        l = mid + 1;
      } else if (guess(mid) == -1) {
        r = mid - 1;
      } else {
        return mid;
      }
    }
    return 0;
  }

  public int guess(int num) {
    if (num > pick) {
      return -1;
    } else if (num < pick) {
      return 1;
    } else {
      return 0;
    }
  }
}
