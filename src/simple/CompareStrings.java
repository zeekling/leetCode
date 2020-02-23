package simple;

/**
 * @apiNote 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 *     在 A 中出现的 B 字符串里的字符不需要连续或者有序。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-15
 */
public class CompareStrings {

	/**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String a, String b) {
        // write your code here
        if(a.length() < b.length()){
            return false;
        }
        char[] aa = a.toCharArray();
        char[] ba = b.toCharArray();
        for (int i=0; i< ba.length;i++ ){
            boolean e = false;
            for (int j=0;j<aa.length;j++){
                if(aa[j] == ba[i]){
                    e = true;
                    aa[j] = ' ';
                    break;
                }
            }
            if(!e){
                return false;
            }
        }
        return true;
    }
}
