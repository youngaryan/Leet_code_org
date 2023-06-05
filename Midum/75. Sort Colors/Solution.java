public class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = n/2-1; i >= 0; i--) {
            heapify(nums,n,i);
        }
        for (int i = n-1; i >0 ; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i,0);
        }
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left<n && nums [left] > nums[largest])
            largest = left;
        if (right<n && nums [right] > nums[largest])
            largest = right;

        if (largest != i){
            int tem = nums[i];
            nums[i] = nums[largest];
            nums[largest] = tem;
            heapify(nums,n,largest);
        }
    }
}
