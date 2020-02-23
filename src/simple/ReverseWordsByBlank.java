package simple;

/**
 * @apiNote 给定一个字符串，逐个翻转字符串中的每个单词。
 *   单词的构成：
 *     无空格字母构成一个单词，有些单词末尾会带有标点符号
 *     输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 *     如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 *     https://www.lintcode.com/problem/reverse-words-in-a-string/description
 * @author zeekling
 * @version 1.0
 * @since 2019-12-15
 */
public class ReverseWordsByBlank {

	/*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if (s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char[] sa = s.toCharArray();
        int end = sa.length,start = sa.length-1;
        for (int i=sa.length-1;i>=0 ; i--) {
            if (sa[i] != ' '){
                start = i;
            }
            if (sa[i] == ' ' && (start - 1) == i){
                sb.append(s.substring(start, end)).append(" ");
            }
            if (sa[i] == ' '){
                end = i;
            }
        }
        sb.append(s.substring(0,end));
        return sb.toString();
    }

}
