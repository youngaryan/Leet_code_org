#include <iostream>
#include "Solution.h" // Include the header file
int main()
{
    Solution solution;
    std::vector<int> nums = {2, 1, 1, 2};
    int result = solution.rob(nums);
    std::cout << result << std::endl;

    return 0;
}