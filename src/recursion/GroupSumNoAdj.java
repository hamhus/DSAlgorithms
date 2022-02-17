package recursion;

public class GroupSumNoAdj {

    //From codingbat - https://codingbat.com/prob/p169605

    public static boolean groupNoAdj(int start, int[] nums, int target) {

        if(start >= nums.length) return target == 0;

        if(groupNoAdj(start + 2, nums, target-nums[start])) return true;

        if(groupNoAdj(start+1, nums, target-nums[start])) return true;

        return false;

    }

    public static void main(String[] args)
    {
        int[] array = {9};
        boolean result = groupNoAdj(0, array, 0);
        System.out.println(result);
    }
}
