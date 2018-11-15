package Easy;

public class _2_TrailingZeros {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public static long trailingZeros(long n) {
        /*
         * 思路很巧妙的一道题：阶乘后面出现0只有2*5或者是10才会出现
         * 2出现的次数肯定大于5出现的次数
         * 所以我们只要找到5的倍数出现的次数就好了
         * 打比方我们传进来的的数是26 只有25 20 15 10 5 满足条件
         * */
        long num = 0;
        while (n > 0) {
            num += n / 5;
            n /= 5;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeros(110));
    }
}
