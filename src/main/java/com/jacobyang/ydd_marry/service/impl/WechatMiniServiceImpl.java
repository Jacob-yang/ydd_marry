package com.jacobyang.ydd_marry.service.impl;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.jacobyang.ydd_marry.config.WeChatProperties;
import com.jacobyang.ydd_marry.service.WechatMiniService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author se7en
 */
@Service
@Log4j2
public class WechatMiniServiceImpl implements WechatMiniService {

    @Resource
    private WeChatProperties weChatProperties;


    @Override
    public HashMap getOpenIdInfo(String jsCode) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + weChatProperties.getAppId() + "&" +
                "secret=" + weChatProperties.getAppSecret() + "&" +
                "js_code=" + jsCode + "&" +
                "grant_type=authorization_code";
        String ResponseEntity = "";
        try {
            ResponseEntity = HttpRequest.get(url)
                    .execute().body();
        } catch (Exception e) {
            throw new RuntimeException("500", e.fillInStackTrace());
        }
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = JSONUtil.parseObj(ResponseEntity);
        } catch (Exception e) {
            throw new RuntimeException("500", e.fillInStackTrace());
        }
        //解析请求结果
        if (Objects.nonNull(jsonObject.getStr("openid"))) {
            //保存openId和unionId关系
            String openId = jsonObject.getStr("openid");
            String sessionKey = jsonObject.getStr("session_key");
            HashMap<String, String> data = new HashMap<>(2);
            data.put("openId",openId);
            data.put("sessionKey",sessionKey);
            return data;
        } else {
            log.error(jsonObject.getStr("errcode")+":"+jsonObject.getStr("errmsg"));
            throw  new RuntimeException(jsonObject.getStr("errcode"),new Throwable(jsonObject.getStr("errmsg")));
//            throw new MiniException(ExceptionCodeMessageEnum.ERROR.code(), "小程序获取openId异常");
        }
    }
}
