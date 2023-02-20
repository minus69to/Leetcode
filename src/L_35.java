class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;

        if (target < nums[0])
        {
            return 0;
        }

        while (start <= end)
        {
            //System.out.println(start + " " + end + " " + mid);
            if (target == nums[mid])
            {
                return mid;
            }
            else if (target < nums[mid])
            {
                //start = start;
                end = mid-1;
                mid = (start+end)/2;
            }
            else
            {
                start = mid+1;
                //end = end;
                mid = (start+end)/2;
            }
        }

        return end+1;
    }
}

public class L_35 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int []arr = {1};
        int target = 0;

        System.out.println(s.searchInsert(arr,target));
    }
}