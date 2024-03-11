impl Solution {
    pub fn sorted_squares(nums: Vec<i32>) -> Vec<i32> {
        let mut lens = nums.len();
        if lens == 1 {
        return vec![nums[0] * nums[0]];
         }   
        let mut l = 0;
        let mut r = lens - 1; 
        let (mut l_sq, mut r_sq);
        
        let mut res = vec![0; lens];

        while l <= r {
            l_sq = nums[l] * nums[l];
            r_sq = nums[r] * nums[r];

            if l_sq > r_sq {
                res[lens - 1] = l_sq;
                l += 1;
            } else {
                res[lens - 1] = r_sq;
                r -= 1; // Corrected this line
            }
            lens -= 1;
        }

        res
    }
}
