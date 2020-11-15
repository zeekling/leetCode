package com.leetcode.jiuzhang;

/**
 * @apiNote 给出两个整数 aaa 和 bbb , 求他们的和。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-11
 */
public class PlusAB {

	public int plus(int a, int b){
		while(b != 0){
			int ta = a^b;
			int tb = (a&b)<<1;
			a = ta;
			b = tb;
		}
		return a;
	}

	public static void main(String[] args){
		PlusAB ab = new PlusAB();
		System.out.println(ab.plus(1,3));
	}

}
