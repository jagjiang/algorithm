package com.mintlolly.base;

/**
 * Created on 2022/5/18
 *
 * @author jiangbo
 * Description:
 * 无符号数 0~ 2^32 - 1  java没有
 * java int 有符号数 -2^31 ~ 2^31-1（因为0的存在需要减1）
 */
public class BitTest {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        getIntBit(maxValue);
        //负数值要取反加1
        int minValue = Integer.MIN_VALUE;
        getIntBit(minValue);
        //负数取反加1
        getIntBit(~minValue+1);
    }

    /**
     * 0000000....11
     * 0000000....10
     * 0000000....10 不等于0才证明num的相关位置不为0
     * @param num
     */
    public static void getIntBit(int num){
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }
    /**

     */
}
