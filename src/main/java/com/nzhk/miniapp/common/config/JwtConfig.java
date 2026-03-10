package com.nzhk.miniapp.common.config;

import com.nzhk.miniapp.common.utils.JwtUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${miniapp.jwt.secret:miniapp-jwt-secret-change-in-prod}")
    private String secret;

    @PostConstruct
    public void init() {
        JwtUtil.setSecret(secret);
    }
}
