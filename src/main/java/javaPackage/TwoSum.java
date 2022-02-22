package javaPackage;

import org.junit.Test;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (num == nums[j]) {
                        int[] twoSum = new int[2];
                        twoSum[0] = i;
                        twoSum[1] = j;
                        return twoSum;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSumnew = new TwoSum();
        System.out.println(twoSumnew.twoSum(new int[]{2, 7, 11, 15}, 9)[0] + " " + twoSumnew.twoSum(new int[]{2, 7, 11, 15}, 9)[1]);
        System.out.println(twoSumnew.twoSum(new int[]{3, 2, 4}, 6)[0] + " " + twoSumnew.twoSum(new int[]{3, 2, 4}, 6)[1]);
        System.out.println(twoSumnew.twoSum(new int[]{3, 3}, 6)[0] + " " + twoSumnew.twoSum(new int[]{3, 3}, 6)[1]);
    }
}
