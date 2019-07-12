package com.lmk.dubbointerface.jna.service;

import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.win32.StdCallLibrary;

public interface StdCallDll extends StdCallLibrary {
    // DLL文件默认路径为项目根目录，若DLL文件存放在项目外，请使用绝对路径
    StdCallDll INSTANCE = (StdCallDll) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
            StdCallDll.class);// 加载动态库文件
    // 声明将要调用的DLL中的方法（可以是多个方法）

    void printf(String format, Object... args);
}
