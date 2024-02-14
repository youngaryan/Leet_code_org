class Solution
{
public:
    vector<int> rearrangeArray(vector<int> &nums)
    {
        int l = 0, k = 1, len = nums.length();
        std::vector<int> res(len);
        for (int i = 0; i < len; i++)
        {
            if (nums[i] > 0)
            {
                res[l] = nums[i];
                l += 2;
            }else
            {
                res[k] = nums[i];
                k+=2;
            }
            
        }
        return res;
    }
};