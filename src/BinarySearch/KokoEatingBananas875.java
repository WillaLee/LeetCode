package BinarySearch;

public class KokoEatingBananas875 {
  public int minEatingSpeed(int[] piles, int h) {
    int least = 0, mid = 0;
    for (int pile : piles) {
      mid = Math.max(mid, pile);
    }
    int max = mid;
    while (least < max) {
      int time = timeToEat(piles, mid);
      if (time < h) {
        max = mid - 1;
      } else if (time > h) {
        least = mid + 1;
      } else {
        max = mid;
      }
      mid = least + (max - least) / 2;
    }
    return max;
  }

  private int timeToEat(int[] piles, int k) {
    int time = 0;
    for (int pile : piles) {
      time += Math.ceil(((double)pile) / k);
    }
    return time;
  }
}
