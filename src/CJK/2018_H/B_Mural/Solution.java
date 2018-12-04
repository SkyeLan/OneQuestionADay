package CJK.B_Mural;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static long solveProblem(int t, int[] score) {
        long s, special1 = 0, special2;
        if (t % 2 == 0) {
            s = distroy(t / 2 - 1, score);
            for (int i = 0; i < t / 2; i++) {
                special1 += score[i];
            }
        } else {
            s = distroy((t - 1) / 2 - 1, score);
            for (int i = 0; i < (t + 1) / 2; i++) {
                special1 += score[i];
            }
        }
        long total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        special2 = total - special1;
        long special = (special1 > special2 ? special1 : special2);
        if (total - s > special)
            return total - s;
        else
            return special;
    }

    public static long distroy(int N, int[] score) {
        long max = 0;

        for (int i = N; i >= 0; i--) {
            long dis = 0;
            int j = 0, k = 1;
            for (; j < i; j++) {
                dis += score[j];
            }
            for (; k <= N - i; k++) {
                dis += score[score.length - k];
            }
            if (score[j] > score[score.length - k])
                dis += score[score.length - k];
            else
                dis += score[j];
            if (dis > max)
                max = dis;
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        String outputfileName = "in.out";
//        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Scanner in = new Scanner(new BufferedReader(new FileReader("B-small-practice.in")));
        int num = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        File outfile = new File(outputfileName);
        outfile.delete();
        for (int i = 1; i <= num; ++i) {
            int t = in.nextInt();
            String s = in.next();
            char[] s2 = s.toCharArray();
            int[] score = new int[s2.length];
            for (int j = 0; j < s2.length; j++) {
                score[j] = s2[j] - '0';
            }
            long solution = solveProblem(t, score);
            System.out.println("Case #" + i + ": " + solution);
            String content = "Case #" + i + ": " + solution + "\n";
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(outputfileName, true);
            writer.write(content);
            writer.close();
        }
    }
}
