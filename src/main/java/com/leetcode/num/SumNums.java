package com.leetcode.num;

/**
 * @file SumNums.java
 * @apiNote 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *       https://leetcode-cn.com/problems/qiu-12n-lcof/
 * @author zeekling
 * @version
 * @date 2020-06-02
 */
public class SumNums{

    public int sumNums(int n) {
        boolean res = n > 0 && (n += sumNums(n-1)) > 0;
        return n;
    }


}

