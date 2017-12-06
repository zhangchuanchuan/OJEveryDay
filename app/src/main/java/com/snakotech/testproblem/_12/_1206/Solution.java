package com.snakotech.testproblem._12._1206;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * Created by Administrator on 2017/12/6.
 */

public class Solution {
    public ArrayList<String> Permutation(String str) {
        if (str == null) {
            return null;
        }

        List<Character> charList = new ArrayList<>();
        for (int i=0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }
        return getReset(charList);
    }

    private ArrayList<String> getReset(List<Character> chars) {
        ArrayList<String> list = new ArrayList<>();
        if (chars.size() == 1) {
            list.add(String.valueOf(chars.get(0)));
            return list;
        }
        for (int i=0; i < chars.size(); i++) {
            Character first = chars.get(i);
            List<Character> copy = new ArrayList<>(chars);
            copy.remove(i);
            ArrayList<String> strings = getReset(copy);
            for (String s : strings) {
                String result = first + s;
                if (!list.contains(result)) {
                    list.add(result);
                }
            }
        }
        return list;
    }
}
