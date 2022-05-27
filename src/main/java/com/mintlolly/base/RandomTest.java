package com.mintlolly.base;

/**
 * Created on 2022/5/18
 *
 * @author jiangbo
 * Description:
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(get1to6()+",");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(getctof()+",");
        }
        System.out.println();
        int count=0;
        for (int i = 0; i < 1000; i++) {
            int res = get0or1();
            if (res ==0){
                count++;
            }
//            System.out.print(res+",");
        }
        System.out.println();
        System.out.println("0出现的概率:"+(double)count/(double)1000);


    }

    /**
     * 生成1-6的随机数
     * @return
     */
    public static int get1to6(){
        return (int) (Math.random() * 6) +1;
    }

    /**
     * 生成c-f的随机字符
     */
    public static char getctof(){
        return (char)(99+ (int) (Math.random() * 4));
    }
    /**
     * 随机等概率返回0和1
     */
    public static int get0or1(){
        int ans = 0;
        do{
            ans = Math.random() <0.6 ? 0:1;
        }while (ans == (Math.random() <0.6 ?0:1));
        return ans;
    }
}
