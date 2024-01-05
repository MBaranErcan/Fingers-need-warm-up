class Solution {
    public String addBinary(String a, String b) {
        
        if (b.equals("0")) return a;
        if (a.equals("0")) return b;

        StringBuilder result = new StringBuilder();
        int lena = a.length() - 1, lenb = b.length() -1 ;
        int carry = 0;

        while (lena >= 0 || lenb >= 0 || carry == 1) {

            int sum = carry; // Set sum to carry

            if (lena >= 0) {
                sum += a.charAt(lena) - '0'; // Substract the unicode value from it. 1 = 49, 0 = 48. For example: if char is '1', 49 - 48 = 1. 
                lena--;
            }
            if (lenb >= 0) {
                sum += b.charAt(lenb) - '0';
                lenb--;
            }

            carry = sum > 1 ? 1 : 0; // If sum is 2, change carry to 1.

            result.append(sum % 2); // Add to the result.
        }

    if (carry != 0) result.append(carry); // add to the result until carry is 0.

    return (result.reverse().toString());
    }
}