import java.util.*;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numsDict = new HashMap<Integer, Integer>();
        int count = 0;
        for (int num: nums) {
            if (numsDict.get(k - num) != null){
                int remain = numsDict.get(k - num);
                if (remain > 0){
                    numsDict.put(k - num, remain - 1);
                    count++;
                } else {
                    numsDict.merge(num, 1, Integer::sum);
                }
            }else {
                numsDict.merge(num, 1, Integer::sum);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        int k = 3;
        int result = maxOperations(nums, k);
        System.out.println(result);
    }
}
