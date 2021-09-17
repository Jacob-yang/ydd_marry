package com.jacobyang.ydd_marry.controller;/**
 * @Author: JacobYang
 * @Date: 2021/7/8 14:41
 * @Description:
 */

import com.jacobyang.ydd_marry.service.WechatMiniService;
import com.jacobyang.ydd_marry.web.response.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName: WxApi
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/7/8 14:41
 * @Version: 1.0
 */
@Log4j2
@RestController
@RequestMapping("/wx/api")
public class WxApi {

    @Autowired
    private WechatMiniService wechatMiniService;
    //获取openId
    @GetMapping("/wechat/openId")
    public Object judge(@RequestParam(name= "jsCode")String jsCode) {
        HashMap openIdInfo = wechatMiniService.getOpenIdInfo(jsCode);
        String openId = (String) openIdInfo.get("openId");
        log.info("openid:{}",openId);
        return Result.success(openIdInfo);
    }
}
