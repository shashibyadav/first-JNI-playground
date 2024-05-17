//
// Created by shashi on 5/16/24.
//
#include <jni.h>
#include <iostream>

JNIEXPORT jint JNICALL Java_objects_NativeSum_addNumbers(JNIEnv *env, jobject obj, jint a, jint b) {
    // Perform data processing (addition)
    int sum = a + b;
    std::cout << "Inside native code" << std::endl;
    // Return the result (converted to jint)
    return sum;
}