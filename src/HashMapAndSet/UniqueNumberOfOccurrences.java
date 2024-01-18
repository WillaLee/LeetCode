package HashMapAndSet;

import java.util.*;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numOccurrence = new HashMap<>();
        for (int num : arr) {
            numOccurrence.merge(num, 1, Integer::sum);
        }
        Set<Integer> occurrencesSet = new HashSet<>(numOccurrence.values());
        return numOccurrence.size() == occurrencesSet.size();
    }
}
