#include <string>
#include <vector>

class Solution
{
public:
    std::string firstPalindrome(std::vector<std::string> &words)
    {
        for (const std::string &str : words)
        {
            if (chekPal(str))
            {
                return str;
            }
        }

        return "";
    }

private:
    bool chekPal(const std ::string &str)
    {
        int leftP = 0, rightP = str.length() - 1;

        while (leftP < rightP)
        {
            if (str[leftP] != str[rightP])
            {
                return false;
            }
            leftP++;
            rightP--;
        }

        return true;
    }
};