package com.leetcode.leetcodetop100;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeetcodeTop100ApplicationTests {

//    @Test
////    void contextLoads() {
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//
//
//        Set<List<Integer>> lists = new HashSet<>();
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int left = i + 1, right = nums.length - 1;
//
//            while (left < right) {
//                if (nums[left] + nums[right] + nums[i] == 0) {
//
//                    lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
//                    left++;
//                    right--;
//                } else if (nums[i] + nums[left] + nums[right] < 0) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//        }
//        List<List<Integer>> list = new ArrayList<>(lists);
//        return list;
//    }


    public static void main(String[] args) {
//        public void nextPermutation ( int[] nums){

//
//            int[] nums = {1, 2, 3};
//            int i = nums.length - 2;
//
//            while (i >= 0 && nums[i] >= nums[i + 1]) {
//                i--;
//            }
//            if (i >= 0) {
//                int j = nums.length - 1;
//                while (j >= 0 && nums[i] >= nums[j]) {
//                    j--;
//                }
//                swap(nums, i, j);
//            }
//            reverse(nums, i + 1);


        /**
         * 2
         */
















    }



public ListNode removeEnd(ListNode head, int n) {

    ListNode currentListNode = new ListNode(0, head);
    int length = getLength(head);
    ListNode current = currentListNode;
    for (int i = 1; i <length-n+1 ; i++) {
        current = current.next;

    }



    current.next=current.next.next;

    ListNode re = currentListNode.next;


    return re;



}

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode head) {
            val = x;
            next = head;
        }
    }







    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }









    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }


    }


































}
