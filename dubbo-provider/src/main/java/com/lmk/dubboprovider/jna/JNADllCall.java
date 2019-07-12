package com.lmk.dubboprovider.jna;

import com.lmk.dubbointerface.jna.service.CLibrary;
import com.lmk.dubbointerface.jna.service.StdCallDll;

public class JNADllCall {
    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, World!");
        StdCallDll.INSTANCE.printf("Hello, World!\n");
    }
}
