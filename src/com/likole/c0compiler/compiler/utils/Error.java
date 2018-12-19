package com.likole.c0compiler.compiler.utils;

import com.likole.c0compiler.Compiler;

public class Error extends Throwable {

    public static int errorCount=0;

    public static void print(int errorcode){
        if(errorCount>100){
            throw new IllegalStateException("错误过多，停止编译");
        }
        char[] s = new char[Compiler.scanner.column-1];
        java.util.Arrays.fill(s, ' ');
        String space = new String(s);
        System.out.println("****" + space + "!" + errorcode);
        Compiler.fa1.println("****" + space + "!" + errorcode);
        errorCount++;
    }
}
