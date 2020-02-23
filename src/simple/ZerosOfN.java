package simple;

/**
 * @apiNote 设计一个算法，计算出n阶乘中尾部零的个数
 * @author zeekling
 * @version 1.0
 * @since 2019-12-12
 */
public class ZerosOfN{

	public long trailingZeros(long n){
		long tmp = 5;
		long count = 0;
		while (tmp <= n){
			count += n / tmp;
			tmp *= 5;
		}
		return count;
	}

	public static void main(String[] args){
		ZerosOfN z = new ZerosOfN();
		System.out.println(z.trailingZeros(11));
	}
}
