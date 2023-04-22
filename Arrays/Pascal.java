/*
 * 118. Pascal's Triangle
 */

import java.util.List;
import java.util.ArrayList;

public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList(numRows)<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i)
                    temp.add(1);
                else {
                    temp.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(temp);
        }
        return list;
    }
}
