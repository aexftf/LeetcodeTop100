package com.leetcode.leetcodetop100;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class LeetcodeTop100ApplicationTests {

    @Test
//    void contextLoads() {

        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);


            Set<List<Integer>> lists = new HashSet<>();


            for (int i = 0; i < nums.length; i++) {

                int left = i + 1, right = nums.length - 1;

                while (left < right) {
                    if (nums[left] + nums[right] + nums[i] == 0) {

                        lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                        left++;
                        right--;
                    } else if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            List<List<Integer>> list = new ArrayList<>(lists);
            return list;
        }













}
