class Solution {
public:
    string intToRoman(int num) {
        string res = "";
        vector<int> values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        vector<string> symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.size() && num >= 0; i++) {
            while (num / values[i] >= 1) {
                res.append(symbols[i]);
                num -= values[i];
            }
        }

        return res;
    }
};
