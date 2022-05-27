package com.mintlolly.question;

/**
 * Created on 2021/7/13
 *
 * @author jiangbo
 * Description:
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *  1 -> 1种
 *  1+1,2 ->2 种
 *  1+1+1,1+2,2+1 -> 3种
 *  1+1+1+1,1+1+2,1+2+1,2+1+1,2+2, -> 5种
 */
public class ClimbingStairs {
    public Integer climbingStairs(int n){
        if(1==n){
            return 1;
        }
        if(2 == n){
            return 2;
        }
        return climbingStairs(n-1)+climbingStairs(n-2);
    }

    static int gcd(int a,int b){
        return b != 0 ? gcd(b, a % b) : a;
    }
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
//        System.out.println(climbingStairs.climbingStairs(3));

        gcd(9,3);
    }
}
