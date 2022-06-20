package com.mintlolly.base;

import java.util.Stack;

/**
 * Created on 2022/5/30
 *
 * @author jiangbo
 * Description:
 */
public class MapTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();

        stringStack.push("hoo");
        stringStack.push("hello");
        stringStack.push("word");
        stringStack.push("yoo");
        while (!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
        }
    }
}
