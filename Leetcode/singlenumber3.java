package Leetcode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/single-number-iii/description/
public class singlenumber3 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        int[] result = new int[2];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

}
