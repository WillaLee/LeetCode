import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = findMax(candies);
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies < maxCandies) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }

    public int findMax(int[] candies){
        int maxCandies = candies[0];
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        return maxCandies;
    }
}
