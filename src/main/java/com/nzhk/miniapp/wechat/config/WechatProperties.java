package com.nzhk.miniapp.wechat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "miniapp.wechat")
public class WechatProperties {

    private String appid;
    private String secret;
}
