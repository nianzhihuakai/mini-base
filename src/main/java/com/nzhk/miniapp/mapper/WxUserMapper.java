package com.nzhk.miniapp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nzhk.miniapp.business.wxuser.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WxUserMapper extends BaseMapper<WxUser> {

    @Select("SELECT * FROM wx_user WHERE openid = #{openId}")
    WxUser selectByOpenId(@Param("openId") String openId);
}
