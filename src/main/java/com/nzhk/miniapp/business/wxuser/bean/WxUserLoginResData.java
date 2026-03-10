package com.nzhk.miniapp.business.wxuser.bean;

import com.nzhk.miniapp.common.cache.UserInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WxUserLoginResData {
    private String token;
    private UserInfo userInfo;
}
