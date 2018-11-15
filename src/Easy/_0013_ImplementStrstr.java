package Easy;

public class _0013_ImplementStrstr {
    /**
     * @param source:
     * @param target:
     * @return: return the index
     */
    public static int strStr(String source, String target) {
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (; j < target.length(); j++)
                if (source.charAt(i + j) != target.charAt(j))
                    break;
            if (j == target.length())
                return i;
        }
        if (target.length() == 0)
            return 0;
        return -1;
    }

    public static void main(String[] args) {
        String source = "source";
        String target = "urc";
        System.out.println(strStr(source, target));
    }
}
