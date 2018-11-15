package Easy;

import java.util.ArrayList;
import java.util.List;

public class _0009_FizzBuzz {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < n+1; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("fizz buzz");
            else if (i % 3 == 0)
                list.add("fizz");
            else if (i % 5 == 0)
                list.add("buzz");
            else
                list.add(i + "");
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 10;
        List<String> l = fizzBuzz(n);
        System.out.println(l.iterator());
    }
}
