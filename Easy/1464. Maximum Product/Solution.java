public class Solution {
    public int maxProduct(int[] nums) {
        return findMax(nums)*findMax(nums);
    }

    private static int findMax (int[] inputs){
        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] > max) {
                max = inputs[i];
                maxIndex = i;
            }
        }
        inputs[maxIndex] = Integer.MIN_VALUE;
        return max-1;
    }
//    private void sort(int[] nums) {
//        if (nums.length<2)return;
//
//        int length = nums.length;
//
//        int[] left = new int[length/2];
//        int[] right = new int[length-length/2];
//
//        System.arraycopy(nums, 0, left, 0, length / 2);
//        if (length - length / 2 >= 0)
//            System.arraycopy(nums, length / 2, right, 0, length - length / 2);
//
//        sort(left);
//        sort(right);
//
//        merge(nums,left,right);
//
//    }
//
//    private void merge(int[] nums, int[] left, int[] right) {
//        int i = 0, j =0, k =0;
//
//        while (i< left.length && j <right.length){
//            if (left[i]>= right[j]){
//                nums[k] = left[i];
//                i++;
//            }else {
//                nums[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i< left.length){
//            nums[k] = left[i];
//            i++;
//            k++;
//        }
//
//        while (j<right.length){
//            nums[k] = right[j];
//            j++;
//            k++;
//        }
//    }
}
