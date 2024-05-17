package objects;

import java.io.File;
import java.lang.reflect.Field;

public class NativeSum {
    public static native int addNumbers(int a, int b);

    static {
        String currentDir = System.getProperty("user.dir");
        String absolutePath = currentDir + File.separator + "nativelibs/NativeLibrary.so";
//        Runtime.getRuntime().loadLibrary(currentDir + File.separator + "nativelibs/NativeLibrary.so");
//        System.loadLibrary("NativeLibrary");
        System.load(absolutePath);
    }

    public int add(int a, int b) {
        return addNumbers(a, b);
    }

}