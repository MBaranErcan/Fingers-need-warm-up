public static int reverse(int x) {
        long result = 0;
        int number;

        if (x < 0) {
            number = -1 * x;
        }else number = x;

        while (number > 0) {
            result = (result * 10)+ (x%10);
            x /= 10;
            number /= 10;
        }

        if(result < Math.pow(-2,31) || result > Math.pow(2,31) )
            return 0;
        else
            return (int) result;
    }