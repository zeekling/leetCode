package com.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @apiNote 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author zeekling
 * @version 1.0
 * @date 2020-04-07
 */
public class LengthOfLongestSubString{

	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LengthOfLongestSubString lString = new LengthOfLongestSubString();
        String s = "abcabcbb";
        System.out.println(lString.lengthOfLongestSubstring(s));
    }
}
