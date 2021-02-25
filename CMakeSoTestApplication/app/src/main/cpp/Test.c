//
// Created by acer on 2021/2/25.
//
#include "jni.h"
#include "CalUtil.h"

JNIEXPORT jint JNICALL Java_com_example_cmakesotestapplication_Test_jAdd
        (JNIEnv *env, jobject obj, jint j_i, jint j_j)
{
    //调用第三方库calUtil中的函数
    return cAdd(j_i,j_j);
}
