package Easy;

public class _0008_RotateString {
    /**
     * @param str:    An array of char
     * @param offset: An integer
     */
    public static void rotateString(char[] str, int offset) {
        if (str.length == 0 || offset == 0)
            return;
        offset = offset % str.length;
        char[] temp = new char[offset];
        for (int i = 0; i < offset; i++)
            temp[i] = str[str.length - offset + i];
        for (int i = 0; str.length - i - offset > 0; i++)
            str[str.length - 1 - i] = str[str.length - 1 - i - offset];
        for (int i = 0; i < offset; i++)
            str[i] = temp[i];
    }

    public static void main(String[] args) {
        char[] c = "abcdefg".toCharArray();
        int offset = 3;
        rotateString(c, offset);
        System.out.println(c.toString());
    }
}
