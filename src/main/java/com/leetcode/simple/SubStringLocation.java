package com.leetcode.simple;

/**
 * @apiNote 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位
 * 置(从0开始)。如果不存在，则返回 -1。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-13
 */
public class SubStringLocation {

	public int strStr(String source, String target){
		char[] s = source.toCharArray();
		char[] t = target.toCharArray();
		if (s.length == t.length && s.length == 0){
			return 0;
		}
		int i = 0;
		while (i < s.length){
			int j = 0, k = i;
			while (j < t.length && k < s.length && s[k] == t[j]){
				j++;
				k++;
			}
			if (j == t.length){
				return i;
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args){
		SubStringLocation s = new SubStringLocation();
		System.out.println(s.strStr("source","target"));
	}
}
