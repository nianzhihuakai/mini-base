package com.nzhk.miniapp.common.utils;

@FunctionalInterface
public interface BeanConvertUtilCallBack<S, T> {

    void callBack(S s, T t);
}
