class Solution {
public:
    int mySqrt(int x) {
        if (x == 0 || x == 1) { // For special cases when x is 0 or 1, return x.
            return x;
        }

        int start = 1, end = x;
        int mid = start + (end-start)/2; //Set the mid. Ensure we don't encounter any integer overflow.

        while (start <= end) {
            mid = start + (end-start)/2;
            long long midSqr = static_cast<long long> (mid) * mid;    // Set the square of mid.

            if (midSqr > x) { // If square of the mid is greater than x, square root might lie in the lower half of the range.
                    end = mid - 1; // set the end to mid -1.
                    }
            else if (midSqr == x) // Found it!
                return mid;
            else { // Check for the upper range then.
                start = mid + 1;
            }
        }
    return static_cast<int>(std::round(end));
    }
};