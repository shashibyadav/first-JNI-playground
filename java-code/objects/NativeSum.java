package objects;

import java.io.File;

public class NativeSum {
    public static native int addNumbers(int a, int b);

    static {
        String currentDir = System.getProperty("user.dir");
        String absolutePath = currentDir + File.separator + "nativelibs/NativeLibrary.so";
        System.load(absolutePath);
    }

    public int add(int a, int b) {
        return addNumbers(a, b);
    }

}