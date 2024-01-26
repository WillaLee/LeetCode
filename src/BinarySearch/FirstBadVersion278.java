package BinarySearch;

public class FirstBadVersion278 {
  public int firstBadVersion(int n) {
    int l = 1, r = n, mid;
    while (l < r) {
      mid = l + (r - l) / 2;
      if (!isBadVersion(mid)) {
        l = mid + 1;
      } else {
        r = mid;
      }
    }
    return r;
  }

  private boolean isBadVersion(int version) {
    return false;
  }
}
