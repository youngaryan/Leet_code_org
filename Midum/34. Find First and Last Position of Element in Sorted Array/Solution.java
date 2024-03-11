class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = nums.length;
        if (l == 1) {
            return target == nums[0] ? new int[] { 0, 0 } : new int[] { -1, -1 };
        }
        int find = binarySearch(nums, 0, l - 1, target, false);

        if (find == -1)
            return new int[] { -1, -1 };

        int left = binarySearch(nums, 0, find, target, true);
        int right = binarySearch(nums, find + 1, l - 1, target, false);

        int[] res = new int[2];
        if (left != -1) {
            res[0] = left;
        } else {
            res[0] = find;
        }

        if (right != -1) {
            res[1] = right;
        } else {
            res[1] = find;
        }

        return res;
    }

    private int binarySearch(int[] nums, int left, int right, int target, boolean findLeft) {
        int mid;
        int result = -1;

        while (left <= right) {
            mid = (right + left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findLeft)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

}