import java.util.*;

/*
 * Daily Problem - 17th april
 * 1431. Kids With the Greatest Number of Candies
 */

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++)
            ans.add((candies[i] + extraCandies) >= max);

        return ans;
    }
}
