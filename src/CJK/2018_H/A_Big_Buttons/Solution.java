package CJK.A_Big_Buttons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    /**
     * Input
     * 2
     * 3 2
     * BBB
     * RB
     * 5 1
     * R
     * <p>
     * Output
     * Case #1: 5
     * Case #2: 16
     * Case #3: 0
     * Case #4: 1125556309458944
     */

    public static long solveProblem(int t, String[] punish) {
        for (int i = 0; i < punish.length; i++) {
            for (int j = i + 1; j < punish.length; j++) {
                if (punish[i] == "" || punish[j] == "") {
                    continue;
                }
                if (punish[i].length() > punish[j].length()) {
                    if (punish[i].startsWith(punish[j]))
                        punish[i] = "";
                } else {
                    if (punish[j].startsWith(punish[i]))
                        punish[j] = "";
                }
            }
        }
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < punish.length; i++) {
            if (punish[i] != "") {
                l.add(punish[i]);
            }
        }
        long sum = calc(t, l);
        long solve = (long) Math.pow(2, t) - sum;
        return solve;
    }

    public static long calc(int t, List<String> punish) {
        int p = punish.size();
        long sum = 0;
        for (int i = 0; i < p; i++) {
            long num = (long) Math.pow(2, t - punish.get(i).length());
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        String outputfileName = "A-large.out";
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        Scanner in = new Scanner(new BufferedReader(new FileReader("A-large.in")));
        int num = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        File outfile = new File(outputfileName);
        outfile.delete();
        for (int i = 1; i <= num; ++i) {
            int t = in.nextInt();
            int p = in.nextInt();
            String[] punish = new String[p];
            for (int j = 0; j < p; j++) {
                punish[j] = in.next();
            }
            long solution = solveProblem(t, punish);
//            System.out.println("Case #" + i + ": " + solution);
            String content = "Case #" + i + ": " + solution + "\n";
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(outputfileName, true);
            writer.write(content);
            writer.close();
        }
    }
}
