package com.nzhk.miniapp.business.wxuser.controller;

import com.nzhk.miniapp.business.wxuser.bean.SaveUserInfoReqData;
import com.nzhk.miniapp.business.wxuser.bean.UserInfoResData;
import com.nzhk.miniapp.business.wxuser.bean.WxUserLoginReqData;
import com.nzhk.miniapp.business.wxuser.bean.WxUserLoginResData;
import com.nzhk.miniapp.business.wxuser.service.IWxUserService;
import com.nzhk.miniapp.common.info.RequestInfo;
import com.nzhk.miniapp.common.info.ResponseInfo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class WxUserController {

    @Resource
    private IWxUserService wxUserService;

    @PostMapping("login")
    public ResponseInfo<WxUserLoginResData> login(@RequestBody RequestInfo<WxUserLoginReqData> requestInfo) {
        return ResponseInfo.success(wxUserService.login(requestInfo.getData()));
    }

    @PostMapping("saveUserInfo")
    public ResponseInfo<WxUserLoginResData> saveUserInfo(@RequestBody RequestInfo<SaveUserInfoReqData> requestInfo) {
        return ResponseInfo.success(wxUserService.saveUserInfo(requestInfo.getData()));
    }

    @PostMapping("getUserInfo")
    public ResponseInfo<UserInfoResData> getUserInfo() {
        return ResponseInfo.success(wxUserService.getUserInfo());
    }
}
