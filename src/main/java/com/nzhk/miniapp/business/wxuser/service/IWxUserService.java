package com.nzhk.miniapp.business.wxuser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nzhk.miniapp.business.wxuser.bean.SaveUserInfoReqData;
import com.nzhk.miniapp.business.wxuser.bean.UserInfoResData;
import com.nzhk.miniapp.business.wxuser.bean.WxUserLoginReqData;
import com.nzhk.miniapp.business.wxuser.bean.WxUserLoginResData;
import com.nzhk.miniapp.business.wxuser.entity.WxUser;

public interface IWxUserService extends IService<WxUser> {

    WxUserLoginResData login(WxUserLoginReqData req);

    WxUserLoginResData saveUserInfo(SaveUserInfoReqData data);

    UserInfoResData getUserInfo();
}
