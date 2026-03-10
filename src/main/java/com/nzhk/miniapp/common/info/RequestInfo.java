package com.nzhk.miniapp.common.info;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestInfo<T> implements Serializable {

    private T data;
}
