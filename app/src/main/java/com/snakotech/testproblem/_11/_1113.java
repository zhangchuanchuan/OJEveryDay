package com.snakotech.testproblem._11;

/**
 * Created by Administrator on 2017/11/13.
 */

public class _1113 {
    public static void testMain() {
        String source = "We Are Happy";
        System.out.println(replaceBlack(source));
    }

    public static String replaceBlack(String source) {
        if (source == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
