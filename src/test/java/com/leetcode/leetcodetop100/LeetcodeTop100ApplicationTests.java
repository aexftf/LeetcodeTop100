package com.leetcode.leetcodetop100;

import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

    public static char[] arr= {
            '0',
            'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z'
    };
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

         Scanner sc=new Scanner(System.in);
            String string=sc.next();
            String res="";
            for(int i=0;i<string.length();i++) {
                if(i+1<string.length()) {
                    int x=(string.charAt(i)-'0')*10+(string.charAt(i+1)-'0');
                    if(x<=26) {
                        res+=new String().valueOf(arr[x]);
                        i++;
                    }
                    else {
                        res+=new String().valueOf(arr[string.charAt(i)-'0']);
                    }
                }
                else {
                    res+=new String().valueOf(arr[string.charAt(i)-'0']);
                }
            }
            System.out.println(res);
        /**
         * 2
         */


    }


    public ListNode removeEnd(ListNode head, int n) {

        ListNode currentListNode = new ListNode(0, head);
        int length = getLength(head);
        ListNode current = currentListNode;
        for (int i = 1; i < length - n + 1; i++) {
            current = current.next;

        }


        current.next = current.next.next;

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


    public void sortColors0(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[num2++] = 2;
                nums[num1++] = 1;
                nums[num0++] = 0;
            } else if (nums[i] == 1) {
                nums[num2++] = 2;
                nums[num1++] = 1;
            } else {
                nums[num2++] = 2;
            }
        }


    }


    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;

        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {

                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length, columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columns; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rows - 1][columns - 1];
    }

    public int minPathSum2(int[][] grid) {


        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];

        }

        for (int j = 1; j < columns; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }

        }
        return dp[rows - 1][columns - 1];


    }


    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordDictSet = new HashSet(wordDict);

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }


    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    int a = 0, b = 0, c = 0;
//    for(int i = 0;i<string.length();i++)
//    {
//
//        if(Character.isDigit(string.charAt(i))){
//            c++;
//        }
//        if(Character.isLowerCase(string.charAt(i))){
//                b++;
//            }
//        if (Character.isUpperCase(string.charAt(i))){
//            a++;
//        }
//
//
//
//        if (Character.isDigit(string.charAt(i))) {
//            c++;
//        } else if (Character.isUpperCase(string.charAt(i))) {
//            a++;
//        } else if (Character.isLowerCase(string.charAt(i))) {
//            b++;
//        }
//
//
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//
//        int parseInt = Integer.parseInt("6979786");
//        System.out.println(parseInt);
//        BigInteger bigInteger = BigInteger.valueOf(3242424);
//        bigInteger.add(BigInteger.valueOf(3242424));
//
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        BigInteger sum = BigInteger.ZERO;
//        for (int j = 1; j < n; j++) {
//            sum=sum.add(new BigInteger(j+ "").pow(8));
//
//        }
//
//        System.out.println(sum.mod(new BigInteger("1234567789")));
//
//
//


































    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;


        }




    }






}



















































