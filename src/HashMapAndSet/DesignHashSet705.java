package HashMapAndSet;

import java.util.Arrays;

public class DesignHashSet705 {
  int[] nums;
  int size;
  float loadFactor1 = 0.75f;
  float loadFactor2 = 0.25f;
  boolean haveZero;

  /**
   * Shit mountain that do not work.
   */
  public DesignHashSet705() {
    nums = new int[8];
    haveZero = false;
    size = 0;
  }

  public void add(int key) {
    if (key == 0) {
      haveZero = true;
      return;
    }
    int index = key % nums.length;
    while (nums[index] != 0 && nums[index] != key) {
      index++;
      if (index >= nums.length) index -= nums.length;
    }
    if (nums[index] != key) {
      size++;
      nums[index] = key;
    }
    if (size > nums.length * loadFactor1){
      resize(2);
    }
  }

  public void remove(int key) {
    if (key == 0) {
      haveZero = false;
      return;
    }
    int index = key % nums.length;
    while (nums[index] != 0 && nums[index] != key) {
      index++;
      if (index >= nums.length) index -= nums.length;
    }
    if (nums[index] == key) {
      nums[index] = -1;
    }
    if (size < nums.length * loadFactor2) {
      resize(0.5);
    }
  }

  public boolean contains(int key) {
    if (key == 0) return haveZero;
    int index = key % nums.length;
    while (nums[index] != 0 && nums[index] != key) {
      index++;
      if (index >= nums.length) index -= nums.length;
    }
    return nums[index] == key;
  }

  private void resize(double factor) {
    int length = (int) (nums.length * factor);
    int[] newNums = new int[length];
    for (int num : nums) {
      if (num == -1) continue;
      if (newNums[num % length] == 0) {
        newNums[num % length] = num;
      } else {
        int index = num % length + 1;
        while (newNums[index] != 0){
          index++;
          if (index >= nums.length) index -= nums.length;
        }
        newNums[index] = num;
      }
    }
    nums = newNums;
  }
}
