#ifndef SOLUTION_H
#define SOLUTION_H

#include <iostream>
#include <vector>
#include <algorithm>

class Solution
{
public:
    std::vector<int> memo;

    int rob(std::vector<int> &nums)
    {
        memo.resize(nums.size(), -1);
        return rob(nums, nums.size() - 1);
    }

private:
    int rob(const std::vector<int> &nums, int i)
    {
        if (i < 0)
        {
            return 0;
        }

        if (memo[i] >= 0)
        {
            return memo[i];
        }

        int result = std ::max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        memo[i] = result;
        return result;
    }
};