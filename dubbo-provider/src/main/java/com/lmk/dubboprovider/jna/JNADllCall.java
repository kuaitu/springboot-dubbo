package com.lmk.dubboprovider.jna;

public class JNADllCall {
    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, World!");
        StdCallDll.INSTANCE.printf("Hello, World!\n");
    }
}
