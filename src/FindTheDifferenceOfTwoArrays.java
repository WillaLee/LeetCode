import com.google.common.collect.Sets;

import java.lang.reflect.Array;
import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = array2set(nums1);
        Set<Integer> nums2Set = array2set(nums2);

        Set<Integer> temp = Set.copyOf(nums1Set);
        nums1Set.removeAll(nums2Set);
        nums2Set.removeAll(temp);

        List<Integer> result1 = new ArrayList<>(nums1Set);
        List<Integer> result2 = new ArrayList<>(nums2Set);
        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;
    }

    public Set<Integer> array2set(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add((Integer) num);
        }
        return numsSet;
    }
}
